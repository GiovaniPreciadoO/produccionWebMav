package produccion.produccionWebMav.entity;

import javax.persistence.*;

@Entity
@Table(name = "unidad")
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uni_id")
    private int unidadId;

    private String nombre;
    private int status;

    public Unidad(){
    }

    public Unidad(int unidadId, String nombre, int status){
        this.unidadId = unidadId;
        this.nombre = nombre;
        this.status = status;
    }

    public int getUnidadId(){
        return unidadId;
    }

    public void setUnidadId(int unidadId){
        this.unidadId = unidadId;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

}
