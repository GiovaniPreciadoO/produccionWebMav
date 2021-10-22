package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ingreso")
public class Ingreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ing_id")
    private int idIngreso;

    private BigDecimal importe;

    private LocalDateTime fecha;
    private boolean ingresoVenta;

    private int socioId;

    public Ingreso(){
    }

    public Ingreso(BigDecimal importe, LocalDateTime fecha, boolean ingresoVenta, int socioId){
        this.importe = importe;
        this.fecha = fecha;
        this.ingresoVenta = ingresoVenta;
        this.socioId = socioId;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isIngresoVenta() {
        return ingresoVenta;
    }

    public void setIngresoVenta(boolean ingresoVenta) {
        this.ingresoVenta = ingresoVenta;
    }

    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }
}
