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

    public Vehiculo save(Vehiculo carro){
            return vehiculoRepository.save(carro);

    }

    public String  delete(Long id){
        vehiculoRepository.deleteById(id);
        return "ok";
    }

    public Optional<Vehiculo> findByPlaca(String placa){
      return vehiculoRepository.findByPlaca(placa);
    }


}
