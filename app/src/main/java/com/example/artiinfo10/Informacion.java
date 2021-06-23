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

public class Informacion extends AppCompatActivity {
    List<ListElement> elements;
    TextView textTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        textTitulo = findViewById(R.id.texTitulo);
        InformacionSistema informacionSistema = new InformacionSistema(MainActivity.hojaExcelUnidad);
        textTitulo.setText(informacionSistema.getNombreSistema());
        elements = new ArrayList<>();
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#FFFFFF"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#FFFFFF"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#FFFFFF"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#FFFFFF"));
        elements.add(new ListElement("GENERAL", "DATO 11", "DATO 22", "#775447"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}