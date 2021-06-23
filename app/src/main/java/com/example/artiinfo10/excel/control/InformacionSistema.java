package com.example.artiinfo10.excel.control;

public class InformacionSistema {
    private HojaExcelUnidad hojaExcelUnidad;
    int coutSistemaEncontrado = 0;
    String nombreSistema;

    public InformacionSistema(HojaExcelUnidad hojaExcelUnidad) {
        this.hojaExcelUnidad = hojaExcelUnidad;
        encontrarSistema();
        setNombreSistema(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[1].getContents());


    }

    public void encontrarSistema() {
        System.out.println(hojaExcelUnidad.getHoja().getRows());
        for (int i = 0; i < hojaExcelUnidad.getHoja().getRows(); i++) {
            if (getHojaExcelUnidad().getSerial().equals(hojaExcelUnidad.getHoja().getRow(i)[22].getContents())) {
                setCoutSistemaEncontrado(i);
            }
        }

    }

    public int getCoutSistemaEncontrado() {
        return coutSistemaEncontrado;
    }

    public void setCoutSistemaEncontrado(int coutSistemaEncontrado) {
        this.coutSistemaEncontrado = coutSistemaEncontrado;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public HojaExcelUnidad getHojaExcelUnidad() {
        return hojaExcelUnidad;
    }

    public void setHojaExcelUnidad(HojaExcelUnidad hojaExcelUnidad) {
        this.hojaExcelUnidad = hojaExcelUnidad;
    }
}
