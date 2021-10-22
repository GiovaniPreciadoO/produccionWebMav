package produccion.produccionWebMav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import produccion.produccionWebMav.entity.Ingreso;
import produccion.produccionWebMav.repository.IngresoRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IngresoService {

    @Autowired
    private IngresoRepository ingresoRepository;

    public void saveIngreso(Ingreso ing){
        ingresoRepository.save(ing);
    }

    public List<Ingreso> findAll(){
        return ingresoRepository.findAll();
    }

    public void delete(int id){
        ingresoRepository.deleteById(id);
    }

}
