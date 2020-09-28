package com.infosys.timetracker.elp.repository;

import com.infosys.timetracker.elp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
