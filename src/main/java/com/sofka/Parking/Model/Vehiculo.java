package com.sofka.Parking.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,name="id")
    private Long id;

    @Column(unique = true,nullable = false,name="Placa")
    private String placa;

    @Column(name="Dueno",nullable = false)
    private String dueno;

    @Column(name="Fecha_Ingreso")
    private LocalDate fechaIngreso = LocalDate.now();

    @Column(name="Hora_Ingreso")
    private LocalTime horaIngreso = LocalTime.now();

    @Column(name="Hora_Salida")
    private LocalTime horaSalida;

    @Column(name="Fecha_salida")
    private LocalDate fechaSalida;

    @Column(name="Total")
    private Long total;

    @Column(name="Estado")
    private boolean estado=true;////

    @Column(name="FechaCalcularIngreso")
    private LocalDateTime fechaCalcularIngreso = LocalDateTime.now();

    @Column(name="FechaTemporalCalcularSalida")
    private LocalDateTime fechaTemporalCalcularSalida ;

    @Column(name="FechaCalcularSalida")
    private LocalDateTime fechaCalcularSalida ;








    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCalcularIngreso() {
        return fechaCalcularIngreso;
    }

    public void setFechaCalcularIngreso(LocalDateTime fechaCalcularIngreso) {
        this.fechaCalcularIngreso = fechaCalcularIngreso;
    }

    public LocalDateTime getFechaTemporalCalcularSalida() {
        return fechaTemporalCalcularSalida;
    }

    public void setFechaTemporalCalcularSalida(LocalDateTime fechaTemporalCalcularSalida) {
        this.fechaTemporalCalcularSalida = fechaTemporalCalcularSalida;
    }

    public LocalDateTime getFechaCalcularSalida() {
        return fechaCalcularSalida;
    }

    public void setFechaCalcularSalida(LocalDateTime fechaCalcularSalida) {
        this.fechaCalcularSalida = fechaCalcularSalida;
    }
}
