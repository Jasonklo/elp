package com.infosys.timetracker.elp.repository;

import com.infosys.timetracker.elp.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, String> {
}
