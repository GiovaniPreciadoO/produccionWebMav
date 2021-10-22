package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "com_id")
    private int comId;

    private BigDecimal total;
    private LocalDateTime fecha;
    private int proId;
    private int gasId;

    public Compra(){
    }

    public Compra(int comId, BigDecimal total, LocalDateTime fecha, int proId, int gasId) {
        this.comId = comId;
        this.total = total;
        this.fecha = fecha;
        this.proId = proId;
        this.gasId = gasId;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public int getGasId() {
        return gasId;
    }

    public void setGasId(int gasId) {
        this.gasId = gasId;
    }
}
