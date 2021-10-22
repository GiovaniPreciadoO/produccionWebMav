package produccion.produccionWebMav.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class IngresoDto {

    private BigDecimal importe;
    private LocalDateTime fecha;
    private boolean ingresoVenta;
    private int socioId;

    public IngresoDto(){
    }

    public IngresoDto(BigDecimal importe, LocalDateTime fecha, boolean ingresoVenta, int socioId){
        this.importe = importe;
        this.fecha = fecha;
        this.ingresoVenta = ingresoVenta;
        this.socioId = socioId;
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
