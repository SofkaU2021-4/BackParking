package com.sofka.Parking.Controller;

import com.sofka.Parking.Model.Vehiculo;
import com.sofka.Parking.Service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VehiculoController {

    @Autowired
    private VehiculoService carroService;

/*    @GetMapping(value = "api/carros")
    public Iterable<Vehiculo>> list(){
        return carroService.list();
    }*/

/*    @PostMapping(value = "api/carro")
    public ResponseEntity<Vehiculo> save(@RequestBody Vehiculo carro){
        return carroService.save(carro);
    }*/

  /*  @DeleteMapping(value = "api/{id}/carro")
    public ResponseEntity delete(@PathVariable("id")Long id){
        return carroService.delete(id);
    }
*/
/*    @GetMapping(value = "api/{id}/todo")
   public Todo get(@PathVariable("id") Long id){
        return service.get(id);
    }*/

}
