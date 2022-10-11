package net.diegoqueres.spring_generic_service.services;

import net.diegoqueres.spring_generic_service.dto.EmployeeDTO;
import net.diegoqueres.spring_generic_service.entities.Employee;
import net.diegoqueres.spring_generic_service.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeDTO findById(Long id) {
        Optional<Employee> result = repository.findById(id);
        return new EmployeeDTO(result.get());
    }

    public List<EmployeeDTO> findAll() {
        List<Employee> list = repository.findAll();
        return list.stream().map(x -> new EmployeeDTO(x)).collect(Collectors.toList());
    }

}
