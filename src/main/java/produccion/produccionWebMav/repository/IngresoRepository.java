package produccion.produccionWebMav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import produccion.produccionWebMav.entity.Ingreso;

import java.math.BigDecimal;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, Integer> {

    @Query("SELECT SUM(i.importe) FROM Ingreso i WHERE i.socioId = ?1")
    BigDecimal ingresoPorSocio(int socId);

    @Query("SELECT SUM(i.importe) FROM Ingreso i")
    BigDecimal totalIngresos();

}
