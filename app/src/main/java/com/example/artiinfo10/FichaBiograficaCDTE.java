package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.artiinfo10.excel.control.InformacionSistema;

public class FichaBiograficaCDTE extends AppCompatActivity {
    TextView tvCDTEBateria, tvCDTESistema, tvTelefonoCDTESistema, tvCertificadoESART, rvFechaUltimoReentrenamiento, tvFechaUltimoCurso, tvUltimoCurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_biografica_c_d_t_e);
        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);

        tvCDTEBateria = findViewById(R.id.tv_CDTE_bateria_title);
        tvCDTESistema = findViewById(R.id.tv_CDTE_sistema);
        tvTelefonoCDTESistema = findViewById(R.id.tv_telefono_CDTE_Sistema);
        tvCertificadoESART = findViewById(R.id.tv_certificado_esart);
        rvFechaUltimoReentrenamiento = findViewById(R.id.tv_fecha_ultimo_reentrenamiento);
        tvFechaUltimoCurso = findViewById(R.id.tv_fecha_ultimo_curso);
        tvUltimoCurso = findViewById(R.id.tv_ultimo_curso);


        tvCDTEBateria.setText("CODTE BATERÍA "+informacionSistema.getsCDTEBateria()+ " TELÉFONO "+informacionSistema.getsTelefonoCDTEBateria());
        tvCDTESistema.setText(informacionSistema.getsCDTESistema());
        tvTelefonoCDTESistema.setText(informacionSistema.getsTelefonoCDTESistema());
        tvCertificadoESART.setText(informacionSistema.getsCertificadoESART());
        rvFechaUltimoReentrenamiento.setText(informacionSistema.getsFechaUltimoReentrenamiento());
        tvFechaUltimoCurso.setText(informacionSistema.getsFechaUltimoCurso());
        tvUltimoCurso.setText(informacionSistema.getsUltimoCurso());


    }
}