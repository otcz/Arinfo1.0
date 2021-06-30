package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.artiinfo10.excel.control.InformacionSistema;

public class InformacionBasicaSistema extends AppCompatActivity {
    TextView tvNumeroSerie, tvEstadoOperativo, tvLineaMando, tvUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_basica_sistema);
        tvNumeroSerie = findViewById(R.id.tv_numero_serie);
        tvEstadoOperativo = findViewById(R.id.tv_estado_operativo);
        tvLineaMando = findViewById(R.id.tv_linea_mando);
        tvUbicacion = findViewById(R.id.tv_ubicacion);

        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);
        tvNumeroSerie.setText(informacionSistema.getsNumeroSerial() + " - " + informacionSistema.getsNombreSistema());
        tvEstadoOperativo.setText(informacionSistema.getsEstadoOperativo());
        tvLineaMando.setText(informacionSistema.getsLineaMando());
        tvUbicacion.setText(informacionSistema.getsUbicacion());

    }
}