package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_id")
    private int productoId;

    private String descripcion;
    private String urlImagen;
    private BigDecimal existencia;
    private int unidadCompraId;
    private int unidadVentaId;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private int status;
    private BigDecimal pesoInicio;
    private BigDecimal pesoFin;
    private int tipo;

    public Producto(){
    }

    public Producto(int productoId, String descripcion, String urlImagen, BigDecimal existencia, int unidadCompraId,
                    int unidadVentaId, BigDecimal precioCompra, BigDecimal precioVenta, int status,
                    BigDecimal pesoInicio, BigDecimal pesoFin, int tipo) {
        this.productoId = productoId;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.existencia = existencia;
        this.unidadCompraId = unidadCompraId;
        this.unidadVentaId = unidadVentaId;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.status = status;
        this.pesoInicio = pesoInicio;
        this.pesoFin = pesoFin;
        this.tipo = tipo;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public BigDecimal getExistencia() {
        return existencia;
    }

    public void setExistencia(BigDecimal existencia) {
        this.existencia = existencia;
    }

    public int getUnidadCompraId() {
        return unidadCompraId;
    }

    public void setUnidadCompraId(int unidadCompraId) {
        this.unidadCompraId = unidadCompraId;
    }

    public int getUnidadVentaId() {
        return unidadVentaId;
    }

    public void setUnidadVentaId(int unidadVentaId) {
        this.unidadVentaId = unidadVentaId;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getPesoInicio() {
        return pesoInicio;
    }

    public void setPesoInicio(BigDecimal pesoInicio) {
        this.pesoInicio = pesoInicio;
    }

    public BigDecimal getPesoFin() {
        return pesoFin;
    }

    public void setPesoFin(BigDecimal pesoFin) {
        this.pesoFin = pesoFin;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
