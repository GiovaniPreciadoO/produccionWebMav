package produccion.produccionWebMav.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pre_id")
    private int prestamoId;

    private BigDecimal total;
    private int remintente;
    private int destinatario;
    private int status;

    public Prestamo(){

    }

    public Prestamo(int prestamoId, BigDecimal total, int remintente, int destinatario, int status) {
        this.prestamoId = prestamoId;
        this.total = total;
        this.remintente = remintente;
        this.destinatario = destinatario;
        this.status = status;
    }

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getRemintente() {
        return remintente;
    }

    public void setRemintente(int remintente) {
        this.remintente = remintente;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
