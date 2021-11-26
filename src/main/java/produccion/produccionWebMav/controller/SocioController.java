package produccion.produccionWebMav.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import produccion.produccionWebMav.dto.SocioDto;
import produccion.produccionWebMav.service.SocioService;


@RestController
@RequestMapping("/socio")
public class SocioController {

    private final SocioService service;

    public SocioController(SocioService service){
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<Integer> create(@RequestBody SocioDto dto){
        Integer socioId = service.createSocio(dto);
        return new ResponseEntity(socioId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable("id") Integer id){
        return new ResponseEntity(service.findById(id), HttpStatus.OK);
    }

}
