package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "salida")
public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sal_id")
    private int salidaId;

    private BigDecimal porcentaje;
    private BigDecimal totalVenta;
    private BigDecimal totalSalida;
    private int status;
    private LocalDateTime fecha;
    private int socioId;
    private int ventaId;

    public Salida(){
    }

    public Salida(int salidaId, BigDecimal porcentaje, BigDecimal totalVenta, BigDecimal totalSalida, int status,
                  LocalDateTime fecha, int socioId, int ventaId) {
        this.salidaId = salidaId;
        this.porcentaje = porcentaje;
        this.totalVenta = totalVenta;
        this.totalSalida = totalSalida;
        this.status = status;
        this.fecha = fecha;
        this.socioId = socioId;
        this.ventaId = ventaId;
    }

    public int getSalidaId() {
        return salidaId;
    }

    public void setSalidaId(int salidaId) {
        this.salidaId = salidaId;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public BigDecimal getTotalSalida() {
        return totalSalida;
    }

    public void setTotalSalida(BigDecimal totalSalida) {
        this.totalSalida = totalSalida;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }
}
