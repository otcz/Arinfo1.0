package com.example.artiinfo10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.artiinfo10.CardView.ListAdapter;
import com.example.artiinfo10.CardView.ListElement;
import com.example.artiinfo10.excel.control.InformacionSistema;

import java.util.ArrayList;
import java.util.List;

public class Informacion extends AppCompatActivity  {
    List<ListElement> elements;
    TextView textTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        textTitulo = findViewById(R.id.texTitulo);

        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);
        textTitulo.setText(informacionSistema.getsNombreSistema());
        elements = new ArrayList<>();
        elements.add(new ListElement("INFORMACI\u00D3N B\u00C1SICA", "#775447"));
        elements.add(new ListElement("DATOS T\u00C9CNICOS", "#775447"));
        elements.add(new ListElement("MUNICI\u00D3N", "#FFFFFF"));
        elements.add(new ListElement("MANTENIMIENTO", "#FFFFFF"));
        elements.add(new ListElement("FICHA BIOGRAFICA DEL COMANDATE", "#775447"));


        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }


}