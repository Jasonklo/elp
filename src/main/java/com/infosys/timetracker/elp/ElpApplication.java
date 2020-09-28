package com.infosys.timetracker.elp;

import com.infosys.timetracker.elp.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)

public class ElpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElpApplication.class, args);
    }

}
