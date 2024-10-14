package org.example;

public class Usuarios {
    private String correo;
    private String idioma;
    private String plataforma;

    public Usuarios(String correo, String idioma, String plataforma) {
        this.correo = correo;
        this.idioma = idioma;
        this.plataforma = plataforma;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
