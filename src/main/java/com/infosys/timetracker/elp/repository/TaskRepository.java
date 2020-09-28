package com.infosys.timetracker.elp.repository;

import com.infosys.timetracker.elp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
}
