package produccion.produccionWebMav.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VentaDto {

    private String concepto;
    private BigDecimal total;
    private LocalDateTime fecha;
    private int productoId;

    public VentaDto(){

    }

    public VentaDto(String concepto, BigDecimal total, LocalDateTime fecha, int productoId) {
        this.concepto = concepto;
        this.total = total;
        this.fecha = fecha;
        this.productoId = productoId;
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
