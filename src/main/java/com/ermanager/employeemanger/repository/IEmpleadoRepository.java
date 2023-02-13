package com.ermanager.employeemanger.repository;

import com.ermanager.employeemanger.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
