package net.diegoqueres.spring_generic_service.dto;

import net.diegoqueres.spring_generic_service.entities.Employee;

public class EmployeeDTO {

    private Long id;
    private String name;

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
