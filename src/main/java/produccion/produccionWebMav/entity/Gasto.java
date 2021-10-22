package produccion.produccionWebMav.entity;

import javax.persistence.*;

@Entity
@Table(name = "gasto")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gas_id")
    private int gasId;

    private String descripcion;
    private int tipoPagoId;

    public Gasto(){

    }

    public Gasto(int gasId, String descripcion, int tipoPagoId){
        this.gasId = gasId;
        this.descripcion = descripcion;
        this.tipoPagoId = tipoPagoId;
    }

    public int getGasId() {
        return gasId;
    }

    public void setGasId(int gasId) {
        this.gasId = gasId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipoPagoId() {
        return tipoPagoId;
    }

    public void setTipoPagoId(int tipoPagoId) {
        this.tipoPagoId = tipoPagoId;
    }
}
