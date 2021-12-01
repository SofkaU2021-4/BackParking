package com.sofka.Parking.Service;

import com.sofka.Parking.Model.Vehiculo;
import com.sofka.Parking.Repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public Iterable<Vehiculo> list(){
            return vehiculoRepository.findAll();
        }

    public Vehiculo save(Vehiculo vehiculo){
            return vehiculoRepository.save(vehiculo);
    }

    public String  delete(Long id){
        vehiculoRepository.deleteById(id);
        return "ok";
    }

    public Optional<Vehiculo> findPorPlaca(String placa){
      return vehiculoRepository.findByPlaca(placa);
    }

    public Vehiculo findById(Long id){
        return vehiculoRepository.findById(id).orElseThrow();
    }

    public Vehiculo update(Vehiculo vehiculo){
        Vehiculo vehiculoUpdate= findById(vehiculo.getId());
        vehiculoUpdate.setDueno(vehiculo.getDueno());
        vehiculoUpdate.setPlaca(vehiculo.getPlaca());
        return vehiculoRepository.save(vehiculoUpdate);
    }
}
