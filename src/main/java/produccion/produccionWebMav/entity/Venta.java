package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ven_id")
    private int ventaId;

    private String concepto;
    private BigDecimal total;
    private LocalDateTime fecha;
    private int productoId;

    public Venta(){
    }

    public Venta(int ventaId, String concepto, BigDecimal total, LocalDateTime fecha, int productoId) {
        this.ventaId = ventaId;
        this.concepto = concepto;
        this.total = total;
        this.fecha = fecha;
        this.productoId = productoId;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
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

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
}
