package net.diegoqueres.spring_generic_service.entities;

import net.diegoqueres.spring_generic_service.dto.EmployeeDTO;
import net.diegoqueres.spring_generic_service.util.Convertible;

import javax.persistence.*;

@Entity
@Table(name = "tb_employee")
public class Employee implements Convertible<EmployeeDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Employee() {
        super();
    }

    public Employee(Long id, String name) {
        this();
        this.id = id;
        this.name = name;
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

    @Override
    public EmployeeDTO convert() {
        return new EmployeeDTO(this);
    }

}
