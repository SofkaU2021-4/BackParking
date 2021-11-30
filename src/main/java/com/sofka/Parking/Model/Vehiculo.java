package com.sofka.Parking.Model;

import javax.persistence.*;
import javax.xml.crypto.Data;
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

    @Column(name="Fecha_Ingreso")
    private LocalDate fechaIngreso = LocalDate.now();

    @Column(name="Hora_Ingreso")
    private LocalTime horaIngreso=LocalTime.now();

    @Column(name="Hora_Salida")
    private LocalTime horaSalida;

    @Column(name="Fecha_salida")
    private LocalDate fechaSalida;

    @Column(name="Total")
    private Long total;

    @Column(name="Estado")
    private boolean estado;

    @Column(name="FechaCalcularIngreso")
    private LocalDateTime fechaCalcuarIngreso = LocalDateTime.now();

    @Column(name="FechaCalcularSalida")
    private LocalDateTime fechaCalcuarSalida ;




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

    public LocalDateTime getFechaCalcuarIngreso() {
        return fechaCalcuarIngreso;
    }

    public void setFechaCalcuarIngreso(LocalDateTime fechaCalcuarIngreso) {
        this.fechaCalcuarIngreso = fechaCalcuarIngreso;
    }

    public LocalDateTime getFechaCalcuarSalida() {
        return fechaCalcuarSalida;
    }

    public void setFechaCalcuarSalida(LocalDateTime fechaCalcuarSalida) {
        this.fechaCalcuarSalida = fechaCalcuarSalida;
    }
}