package produccion.produccionWebMav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import produccion.produccionWebMav.entity.Ingreso;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, Integer> {


}
