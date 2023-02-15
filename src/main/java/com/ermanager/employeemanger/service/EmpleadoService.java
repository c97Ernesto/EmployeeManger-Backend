/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ermanager.employeemanger.service;

import com.ermanager.employeemanger.exception.UserNotFoundException;
import com.ermanager.employeemanger.model.Empleado;
import com.ermanager.employeemanger.repository.IEmpleadoRepository;
import java.util.List;
import static java.util.UUID.randomUUID;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ernesto
 */
@Service
public class EmpleadoService {
    
    private final IEmpleadoRepository empleadoRepo;

    public EmpleadoService(IEmpleadoRepository empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }
    
    public Empleado agregarEmpleado (Empleado employee) {
        employee.setCodigoEmpleado(randomUUID().toString());   //seteamos in código por defecto
        return this.empleadoRepo.save(employee);
    }
    
    public List<Empleado> obtenerEmpleados() {
        return this.empleadoRepo.findAll();
    }
    
    public Empleado actualizarEmpleado(Empleado employee) {
        return this.empleadoRepo.save(employee);
    }
    
//    public Optional<Empleado> buscarEmpleado(Long id) throws UserPrincipalNotFoundException {
//        return this.empleadoRepo.findById(id);
//    }
    
    public Empleado buscarEmpleado(Long id) {
        return this.empleadoRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario con id " + id + " no se encontró"));
    }
    
    public void eliminarEmpleado(Long id) {
        this.empleadoRepo.deleteById(id);
    }
}
     