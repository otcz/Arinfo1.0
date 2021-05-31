package com.example.artiinfo10.excel.control;

import jxl.Sheet;

public class HojaExcelUnidad {
    String serial;
    Sheet hoja;

    public HojaExcelUnidad(Sheet hoja) {
        this.hoja = hoja;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Sheet getHoja() {
        return hoja;
    }

    public void setHoja(Sheet hoja) {
        this.hoja = hoja;
    }
}
