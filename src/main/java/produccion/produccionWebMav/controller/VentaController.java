package produccion.produccionWebMav.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import produccion.produccionWebMav.dto.VentaDto;
import produccion.produccionWebMav.entity.Ingreso;
import produccion.produccionWebMav.entity.Venta;
import produccion.produccionWebMav.service.VentaService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    private final VentaService service;

    public VentaController(VentaService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<Integer> create(@RequestBody VentaDto dto){
        Venta venta = new Venta(dto.getConcepto(), dto.getTotal(), dto.getFecha(), dto.getProductoId());
        service.crearVenta(venta);
        return new ResponseEntity(venta.getVentaId(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        service.delete(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Ingreso>> findAll(){
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }


    @GetMapping("/total")
    public ResponseEntity<BigDecimal> totalVentas(){
        return new ResponseEntity(service.totalVentas(), HttpStatus.OK);
    }

}
