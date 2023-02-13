package com.ermanager.employeemanger.controller;

import com.ermanager.employeemanger.model.Empleado;
import com.ermanager.employeemanger.service.EmpleadoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/empleado")//valor predeterminado o url base de la clase
public class EmpleadoController {
    
    private final EmpleadoService empleadoService;

    
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    
    @GetMapping("/obtenerEmpleados")
    /*Devolvemos una respuesta http, y en el cuerpo de esa respuesta http, una lista.*/
    public ResponseEntity<List<Empleado>> obtenerEmpleados() {
        List<Empleado> employees = this.empleadoService.obtenerEmpleados();
        return new ResponseEntity<>(employees, HttpStatus.OK);
        //Pasamos los empleados en el cuerpo, y además el código de estado http 200
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Empleado> buscarEmpleadoById(@PathVariable("id") Long id) {
        Empleado employee = this.empleadoService.buscarEmpleado(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
        
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Empleado> agregarEmpleado(@RequestBody Empleado empleado) {
        Empleado employee = this.empleadoService.agregarEmpleado(empleado);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
    
    @PutMapping("/actualizar")
    public ResponseEntity<Empleado> actualizarEmpleado(@RequestBody Empleado empleado) {
        Empleado employee = this.empleadoService.actualizarEmpleado(empleado);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarEmpleado(@PathVariable("id") Long id) {
        this.empleadoService.eliminarEmpleado(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
}
