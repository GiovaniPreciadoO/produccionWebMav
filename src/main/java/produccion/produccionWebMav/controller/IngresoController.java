package produccion.produccionWebMav.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import produccion.produccionWebMav.dto.IngresoDto;
import produccion.produccionWebMav.entity.Ingreso;
import produccion.produccionWebMav.service.IngresoService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {

    private final IngresoService ingresoService;

    public IngresoController(IngresoService ingresoService) {
        this.ingresoService = ingresoService;
    }

    @PostMapping()
    public ResponseEntity<Integer> create(@RequestBody IngresoDto dto){
        Ingreso ingreso = new Ingreso(dto.getImporte(), dto.getFecha(), dto.isIngresoVenta(), dto.getSocioId());
        ingresoService.saveIngreso(ingreso);
        return new ResponseEntity(ingreso.getIdIngreso(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        ingresoService.delete(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Ingreso>> findAll(){
        return new ResponseEntity(ingresoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/total/{socId}")
    public ResponseEntity<BigDecimal> ingresoPorSocio(@PathVariable("socId") int socId){
        return new ResponseEntity(ingresoService.ingresoPorSocio(socId), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<BigDecimal> totalIngresos(){
        return new ResponseEntity(ingresoService.totalIngresos(), HttpStatus.OK);
    }

}
