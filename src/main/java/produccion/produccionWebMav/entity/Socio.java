package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "socio")
public class Socio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "soc_id")
    private int socId;

    private String nombre;
    private LocalDateTime fechaNac;
    private String urlImage;
    private String telefono;
    private String celular;
    private boolean registrarIngreso;

    public Socio(){

    }

    public Socio(int socId, String nombre, LocalDateTime fechaNac, String urlImage, String telefono, String celular, boolean registrarIngreso) {
        this.socId = socId;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.urlImage = urlImage;
        this.telefono = telefono;
        this.celular = celular;
        this.registrarIngreso = registrarIngreso;
    }

    public int getSocId() {
        return socId;
    }

    public void setSocId(int socId) {
        this.socId = socId;
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
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
