package com.infosys.timetracker.elp.repository;

import com.infosys.timetracker.elp.entity.Effort;
import com.infosys.timetracker.elp.entity.EffortId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EffortRepository extends JpaRepository<Effort, EffortId> {
}
