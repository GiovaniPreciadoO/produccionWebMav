package produccion.produccionWebMav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import produccion.produccionWebMav.entity.Venta;

import java.math.BigDecimal;

public interface VentaRepository extends JpaRepository<Venta, Integer> {

    @Query("SELECT SUM(v.total) FROM Venta v")
    BigDecimal totalVentas();

}
