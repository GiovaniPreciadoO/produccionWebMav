package produccion.produccionWebMav.service;

import org.springframework.stereotype.Service;
import produccion.produccionWebMav.entity.Venta;
import produccion.produccionWebMav.repository.VentaRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public void crearVenta(Venta venta){
        ventaRepository.save(venta);
    }

    public List<Venta> findAll(){
        return ventaRepository.findAll();
    }

    public void delete(int id){
        ventaRepository.deleteById(id);
    }

    public BigDecimal totalVentas(){
        return ventaRepository.totalVentas();
    }

}
