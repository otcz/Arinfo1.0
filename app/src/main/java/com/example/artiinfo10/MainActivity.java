package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.artiinfo10.excel.control.HojaExcelUnidad;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.io.InputStream;

import jxl.Sheet;
import jxl.Workbook;

public class MainActivity extends AppCompatActivity {
    Button btnBuscar;
    HojaExcelUnidad hojaExcelUnidad;
    String div, unidad, serial;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBuscar = findViewById(R.id.btn_buscar);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                integrator.setPrompt("Lector -CDP");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();

                cargarLibros("2,BAGAL,2150");

                //Intent intent = new Intent(v.getContext(), Informacion.class);
                //startActivity(intent);

            }
        });
    }


    protected void onActivityResult(int requesCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requesCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Lectura Cancelada", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
               Intent intent = new Intent(this, Informacion.class);
               startActivity(intent);
            }
        } else {
            super.onActivityResult(requesCode, resultCode, data);
        }

    }

    public void cargarLibros(String sistema) {
        String[] datosSistema = sistema.split(",");
        setDiv(datosSistema[0]);
        setUnidad(datosSistema[1]);
        setSerial(datosSistema[2]);
        switch (getDiv()) {
            case "1":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("1"));
                break;
            case "2":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("2"));
                break;
            case "3":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("3"));
                break;
            case "5":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("5"));
                break;
            case "6":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("6"));
                break;
            case "7":
                hojaExcelUnidad = new HojaExcelUnidad(entregaLibro("7"));
                break;
        }
        hojaExcelUnidad.setSerial(getSerial());
    }

    public Sheet entregaLibro(String div) {
        Sheet sheet = null;
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open("libro" + div + ".xls");
            Workbook workbook = Workbook.getWorkbook(inputStream);
            for (int i = 0; i < workbook.getSheets().length; i++) {
                if (workbook.getSheets()[i].getName().equals(getUnidad())) {
                    sheet = workbook.getSheets()[i];
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sheet.getName());
        return sheet;
    }

    public HojaExcelUnidad getHojaExcelUnidad() {
        return hojaExcelUnidad;
    }

    public void setHojaExcelUnidad(HojaExcelUnidad hojaExcelUnidad) {
        this.hojaExcelUnidad = hojaExcelUnidad;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}