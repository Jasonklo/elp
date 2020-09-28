package com.infosys.timetracker.elp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
public class Application {

    @Id
    private String appName;

    private String managerName;
    private String area;
    private int maintId;
    private Timestamp maintTs;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "application")
    private List<Task> tasks;
}
