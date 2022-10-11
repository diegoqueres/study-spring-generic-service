package net.diegoqueres.spring_generic_service.repositories;

import net.diegoqueres.spring_generic_service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
