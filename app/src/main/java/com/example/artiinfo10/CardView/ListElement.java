package com.example.artiinfo10.CardView;

public class ListElement {
    String tipoDato;
    String color;


    public ListElement(String tipoDato, String color) {
        this.tipoDato = tipoDato;

        this.color = color;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
