package com.example.artiinfo10.excel.control;

import android.widget.TextView;

public class InformacionSistema {
    private HojaExcelUnidad hojaExcelUnidad;
    int coutSistemaEncontrado = 0;
    String sNombreSistema, sNumeroSerial, sEstadoOperativo, sLineaMando, sUbicacion, sTipoMunicion1,sTipoMunicion2, sMunicionUnidadTactica1, sMunicionBrigada1, sMunicionDivision1,
            sMunicionUnidadTactica2,sMunicionBrigada2, sMunicionDivision2, sNumeroApoyoFuegos, sFechaUltimoMantenimiento, sNivelMantenimiento;;

    public InformacionSistema(HojaExcelUnidad hojaExcelUnidad) {
        this.hojaExcelUnidad = hojaExcelUnidad;
        encontrarSistema();
        setsNombreSistema(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[1].getContents());
        setsNumeroSerial(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[22].getContents());
        setsEstadoOperativo(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[23].getContents());
        setsLineaMando(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[24].getContents() + " - " +
                hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[25].getContents() + " - " +
                hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[26].getContents());
        setsUbicacion(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[29].getContents() + " - " +
                hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[28].getContents() + " - " +
                hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[27].getContents());

        setsTipoMunicion1(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[30].getContents());
        setsMunicionUnidadTactica1(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[31].getContents());
        setsMunicionBrigada1(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[32].getContents());
        setsMunicionDivision1(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[33].getContents());

        setsTipoMunicion2(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[34].getContents());
        setsMunicionUnidadTactica2(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[35].getContents());
        setsMunicionBrigada2(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[36].getContents());
        setsMunicionDivision2(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[37].getContents());

        setsNumeroApoyoFuegos("0");

        setsFechaUltimoMantenimiento(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[38].getContents());
        setsNivelMantenimiento(hojaExcelUnidad.getHoja().getRow(getCoutSistemaEncontrado())[39].getContents());

    }

    public void encontrarSistema() {
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

    public String getsNombreSistema() {
        return sNombreSistema;
    }

    public void setsNombreSistema(String sNombreSistema) {
        this.sNombreSistema = sNombreSistema;
    }

    public HojaExcelUnidad getHojaExcelUnidad() {
        return hojaExcelUnidad;
    }

    public void setHojaExcelUnidad(HojaExcelUnidad hojaExcelUnidad) {
        this.hojaExcelUnidad = hojaExcelUnidad;
    }

    public String getsNumeroSerial() {
        return sNumeroSerial;
    }

    public void setsNumeroSerial(String sNumeroSerial) {
        this.sNumeroSerial = sNumeroSerial;
    }

    public String getsEstadoOperativo() {
        return sEstadoOperativo;
    }

    public void setsEstadoOperativo(String sEstadoOperativo) {
        this.sEstadoOperativo = sEstadoOperativo;
    }

    public String getsLineaMando() {
        return sLineaMando;
    }

    public void setsLineaMando(String sLineaMando) {
        this.sLineaMando = sLineaMando;
    }

    public String getsUbicacion() {
        return sUbicacion;
    }

    public void setsUbicacion(String sUbicacion) {
        this.sUbicacion = sUbicacion;
    }

    public String getsTipoMunicion1() {
        return sTipoMunicion1;
    }

    public void setsTipoMunicion1(String sTipoMunicion1) {
        this.sTipoMunicion1 = sTipoMunicion1;
    }

    public String getsTipoMunicion2() {
        return sTipoMunicion2;
    }

    public void setsTipoMunicion2(String sTipoMunicion2) {
        this.sTipoMunicion2 = sTipoMunicion2;
    }

    public String getsMunicionUnidadTactica1() {
        return sMunicionUnidadTactica1;
    }

    public void setsMunicionUnidadTactica1(String sMunicionUnidadTactica1) {
        this.sMunicionUnidadTactica1 = sMunicionUnidadTactica1;
    }

    public String getsMunicionBrigada1() {
        return sMunicionBrigada1;
    }

    public void setsMunicionBrigada1(String sMunicionBrigada1) {
        this.sMunicionBrigada1 = sMunicionBrigada1;
    }

    public String getsMunicionDivision1() {
        return sMunicionDivision1;
    }

    public void setsMunicionDivision1(String sMunicionDivision1) {
        this.sMunicionDivision1 = sMunicionDivision1;
    }

    public String getsMunicionUnidadTactica2() {
        return sMunicionUnidadTactica2;
    }

    public void setsMunicionUnidadTactica2(String sMunicionUnidadTactica2) {
        this.sMunicionUnidadTactica2 = sMunicionUnidadTactica2;
    }

    public String getsMunicionBrigada2() {
        return sMunicionBrigada2;
    }

    public void setsMunicionBrigada2(String sMunicionBrigada2) {
        this.sMunicionBrigada2 = sMunicionBrigada2;
    }

    public String getsMunicionDivision2() {
        return sMunicionDivision2;
    }

    public void setsMunicionDivision2(String sMunicionDivision2) {
        this.sMunicionDivision2 = sMunicionDivision2;
    }


    public String getsNumeroApoyoFuegos() {
        return sNumeroApoyoFuegos;
    }

    public void setsNumeroApoyoFuegos(String sNumeroApoyoFuegos) {
        this.sNumeroApoyoFuegos = sNumeroApoyoFuegos;
    }

    public String getsFechaUltimoMantenimiento() {
        return sFechaUltimoMantenimiento;
    }

    public void setsFechaUltimoMantenimiento(String sFechaUltimoMantenimiento) {
        this.sFechaUltimoMantenimiento = sFechaUltimoMantenimiento;
    }

    public String getsNivelMantenimiento() {
        return sNivelMantenimiento;
    }

    public void setsNivelMantenimiento(String sNivelMantenimiento) {
        this.sNivelMantenimiento = sNivelMantenimiento;
    }
}
