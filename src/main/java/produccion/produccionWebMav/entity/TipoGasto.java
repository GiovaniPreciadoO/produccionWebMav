package produccion.produccionWebMav.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipogasto")
public class TipoGasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tpg_id")
    private int tipoGastoId;

    private String nombre;

    public TipoGasto(){
    }

    public TipoGasto(int tipoGastoId, String nombre){
        this.tipoGastoId = tipoGastoId;
        this.nombre = nombre;
    }

    public int getTipoGastoId(){
        return tipoGastoId;
    }

    public void setTipoGastoId(int tipoGastoId){
        this.tipoGastoId = tipoGastoId;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
