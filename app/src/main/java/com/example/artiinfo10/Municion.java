package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.artiinfo10.excel.control.InformacionSistema;

public class Municion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvTipoMunicion1, tvMunicionUnidadTactica1, tvMunicionBrigada1, tvMunicionDivision1,
                tvTipoMunicion2, tvMunicionUnidadTactica2, tvMunicionBrigada2, tvMunicionDivision2,
                tvTipoMunicionTitle2, tvMunicionUnidadTacticaTitle2, tvMunicionBrigadaTitle2, tvMunicionDivisionTitle2, tvTipomunicion, tvUbicacion;

        CardView cardView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municion);
        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);

        cardView = findViewById(R.id.cv_municion1);

        tvTipoMunicion1 = findViewById(R.id.tv_tipo_municion_1);
        tvMunicionUnidadTactica1 = findViewById(R.id.tv_dpo_unidad_tactico_1);
        tvMunicionBrigada1 = findViewById(R.id.tv_dpo_unidad_brigada_1);
        tvMunicionDivision1 = findViewById(R.id.tv_dpo_unidad_division_1);


        tvTipoMunicion2 = findViewById(R.id.tv_tipo_municion_2);
        tvMunicionUnidadTactica2 = findViewById(R.id.tv_dpo_unidad_tactico_2);
        tvMunicionBrigada2 = findViewById(R.id.tv_dpo_unidad_brigada_2);
        tvMunicionDivision2 = findViewById(R.id.tv_dpo_unidad_division_2);

        tvTipoMunicionTitle2 = findViewById(R.id.tv_tipo_municion_title_2);
        tvMunicionUnidadTacticaTitle2 = findViewById(R.id.tv_dpo_unidad_tactico_title_2);
        tvMunicionBrigadaTitle2 = findViewById(R.id.tv_dpo_unidad_brigada_title_2);
        tvMunicionDivisionTitle2 = findViewById(R.id.tv_dpo_unidad_division_title_2);

        tvTipomunicion = findViewById(R.id.tv_numero_apoyo);
        tvUbicacion = findViewById(R.id.tv_ubicacion);


        tvTipoMunicion2.setText(informacionSistema.getsTipoMunicion2());
        tvMunicionUnidadTactica2.setText(informacionSistema.getsMunicionUnidadTactica2());
        tvMunicionBrigada2.setText(informacionSistema.getsMunicionBrigada2());
        tvMunicionDivision2.setText(informacionSistema.getsMunicionDivision2());


        if (informacionSistema.getsTipoMunicion2().isEmpty() || informacionSistema.getsTipoMunicion2() == null || informacionSistema.getsTipoMunicion2().length() == 0) {
            tvTipoMunicion2.setVisibility(View.INVISIBLE);
            tvMunicionUnidadTactica2.setVisibility(View.INVISIBLE);
            tvMunicionBrigada2.setVisibility(View.INVISIBLE);
            tvMunicionDivision2.setVisibility(View.INVISIBLE);

        } else {
            tvTipoMunicion2.setText(informacionSistema.getsTipoMunicion2());
            tvMunicionUnidadTactica2.setText(informacionSistema.getsMunicionUnidadTactica2());
            tvMunicionBrigada2.setText(informacionSistema.getsMunicionBrigada2());
            tvMunicionDivision2.setText(informacionSistema.getsMunicionDivision2());

        }

        tvTipoMunicion1.setText(informacionSistema.getsTipoMunicion1());
        tvMunicionUnidadTactica1.setText(informacionSistema.getsMunicionUnidadTactica1());
        tvMunicionBrigada1.setText(informacionSistema.getsMunicionBrigada1());
        tvMunicionDivision1.setText(informacionSistema.getsMunicionDivision1());
        tvTipomunicion.setText(informacionSistema.getsNumeroApoyoFuegos());





    }
}