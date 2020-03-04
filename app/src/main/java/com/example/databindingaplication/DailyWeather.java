package com.example.databindingaplication;

public class DailyWeather {
    private String ciudad;
    private String fecha;
    private String grados;
    private String unidadMedida;

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", imagen='" + imagen + '\'' +
                ", grados='" + grados + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                '}';
    }

    private String imagen;





    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }





    public DailyWeather(String ciudad, String fecha, String imagen, String grados, String unidadMedida) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.imagen = imagen;
        this.grados = grados;
        this.unidadMedida = unidadMedida;
    }





}
