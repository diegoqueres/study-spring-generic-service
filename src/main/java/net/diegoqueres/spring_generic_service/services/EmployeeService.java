package net.diegoqueres.spring_generic_service.services;

import net.diegoqueres.spring_generic_service.dto.EmployeeDTO;
import net.diegoqueres.spring_generic_service.entities.Employee;
import net.diegoqueres.spring_generic_service.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public JpaRepository<Employee, Long> getRepository() {
        return repository;
    }

}
