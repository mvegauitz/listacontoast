package com.listadeltiempo.gh.listadeltiempo;

/**
 * Created by gh on 05/07/2015.
 */
public class informacion {

    private int imgview;
    private String diasemana;
    private String temperatura;


    public informacion(int imgview, String diasemana, String temperatura) {
        this.imgview = imgview;
        this.diasemana = diasemana;
        this.temperatura = temperatura;
    }

    public int getImgview() {
        return imgview;
    }

    public void setImgview(int imgview) {
        this.imgview = imgview;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
