package com.sofka.Parking.Service;

import com.sofka.Parking.Model.Vehiculo;
import com.sofka.Parking.Repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
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
////
    public boolean existsByPlaca(String placa){
        return vehiculoRepository.existsByPlaca(placa);
    }

    public boolean existsById(Long id){
        return vehiculoRepository.existsById(id);
    }

    public String updateValor(Vehiculo vehiculo){
        if(!existsByPlaca(vehiculo.getPlaca()))
            return "no existe la placa a modificar";
        Vehiculo vehiculoUpdate = findById(vehiculo.getId());
        vehiculoUpdate.setFechaSalida(LocalDate.now());
        vehiculoUpdate.setHoraSalida(LocalTime.now());
        vehiculoUpdate.setFechaCalcularSalida(LocalDateTime.now());
        vehiculoUpdate.setTotal((ChronoUnit.MINUTES.between(vehiculoUpdate.getFechaCalcularIngreso(), vehiculoUpdate.getFechaCalcularSalida()))*100);
        vehiculoRepository.save(vehiculoUpdate);
        return "producto actualizado";
    }

    public String updateSalida(Vehiculo vehiculo){
        if(!existsByPlaca(vehiculo.getPlaca()))
            return "no existe la placa a modificar";
        Vehiculo vehiculoUpdate = findById(vehiculo.getId());
        vehiculoUpdate.setEstado(false);
        vehiculoRepository.save(vehiculoUpdate);
        return "producto actualizado";
    }

}
