package com.example.artiinfo10.CardView;

public class ListElement {
    String tipoDato;
    String dato1;
    String dato2;
    String color;


    public ListElement(String tipoDato, String dato1, String dato2, String color) {
        this.tipoDato = tipoDato;
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.color = color;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
