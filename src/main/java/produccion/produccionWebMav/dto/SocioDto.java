package produccion.produccionWebMav.dto;

import java.time.LocalDateTime;

public class SocioDto {

    private String nombre;
    private LocalDateTime fechaNac;
    private String contentImage;
    private String telefono;
    private String celular;
    private boolean registrarIngreso;

    public SocioDto(){
    }

    public SocioDto(String nombre, LocalDateTime fechaNac, String contentImage, String telefono, String celular, boolean registrarIngreso) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.contentImage = contentImage;
        this.telefono = telefono;
        this.celular = celular;
        this.registrarIngreso = registrarIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDateTime fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getContentImage() {
        return contentImage;
    }

    public void setContentImage(String contentImage) {
        this.contentImage = contentImage;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isRegistrarIngreso() {
        return registrarIngreso;
    }

    public void setRegistrarIngreso(boolean registrarIngreso) {
        this.registrarIngreso = registrarIngreso;
    }
}
