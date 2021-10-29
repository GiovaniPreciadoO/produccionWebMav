package produccion.produccionWebMav.service;

import org.springframework.stereotype.Service;
import produccion.produccionWebMav.entity.Ingreso;
import produccion.produccionWebMav.repository.IngresoRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class IngresoService {

    private final IngresoRepository ingresoRepository;

    public IngresoService(IngresoRepository ingresoRepository) {
        this.ingresoRepository = ingresoRepository;
    }

    public void saveIngreso(Ingreso ing){
        ingresoRepository.save(ing);
    }

    public List<Ingreso> findAll(){
        return ingresoRepository.findAll();
    }

    public void delete(int id){
        ingresoRepository.deleteById(id);
    }

    public BigDecimal ingresoPorSocio(int socId){
        return ingresoRepository.ingresoPorSocio(socId);
    }

    public BigDecimal totalIngresos(){
        return ingresoRepository.totalIngresos();
    }

}
