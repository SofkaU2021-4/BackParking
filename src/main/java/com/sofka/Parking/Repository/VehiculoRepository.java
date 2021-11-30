package com.sofka.Parking.Repository;

import com.sofka.Parking.Model.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo,Long> {
    Optional<Vehiculo> findByPlaca(String placa);
}
