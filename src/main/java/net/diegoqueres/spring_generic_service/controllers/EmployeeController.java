package net.diegoqueres.spring_generic_service.controllers;

import net.diegoqueres.spring_generic_service.dto.EmployeeDTO;
import net.diegoqueres.spring_generic_service.entities.Employee;
import net.diegoqueres.spring_generic_service.services.EmployeeService;
import net.diegoqueres.spring_generic_service.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private GenericService<Employee, EmployeeDTO, Long> service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id) {
        EmployeeDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> findAll() {
        List<EmployeeDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

}
