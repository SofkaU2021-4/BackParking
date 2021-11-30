package com.sofka.Parking.Controller;

import com.sofka.Parking.Model.Vehiculo;
import com.sofka.Parking.Service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping("api/vehiculo")
    public ResponseEntity<?> save(@RequestBody Vehiculo vehiculo){
        return new ResponseEntity (vehiculoService.save(vehiculo), HttpStatus.OK);
    }

    @GetMapping("api/vehiculo")
    public ResponseEntity<?> list(){
        return new ResponseEntity (vehiculoService.list(), HttpStatus.OK);
    }

    @DeleteMapping("api/vehiculo/{id}")
    public ResponseEntity delete(@PathVariable("id")Long id){
        return new ResponseEntity (vehiculoService.delete(id), HttpStatus.OK);
    }

/*    @GetMapping(value = "api/{id}/todo")
   public Todo get(@PathVariable("id") Long id){
        return service.get(id);
    }*/

}
