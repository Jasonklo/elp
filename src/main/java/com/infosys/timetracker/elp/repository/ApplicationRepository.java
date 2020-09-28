package com.infosys.timetracker.elp.repository;

import com.infosys.timetracker.elp.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, String> {
}
