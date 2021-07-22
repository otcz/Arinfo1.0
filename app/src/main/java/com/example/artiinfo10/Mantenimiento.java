package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.artiinfo10.excel.control.InformacionSistema;

public class Mantenimiento extends AppCompatActivity {
    TextView tvFechaUltimoMantenimiento, tvNivelMantenimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);

        setContentView(R.layout.activity_mantenimiento);
        tvFechaUltimoMantenimiento = findViewById(R.id.tv_fecha_ultimo_mantenimiento);
        tvNivelMantenimiento = findViewById(R.id.tv_nivel_mantenimiento);

        tvFechaUltimoMantenimiento.setText(informacionSistema.getsFechaUltimoMantenimiento());
        tvNivelMantenimiento.setText(informacionSistema.getsNivelMantenimiento());
    }
}