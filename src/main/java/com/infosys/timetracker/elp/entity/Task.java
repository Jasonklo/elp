package com.infosys.timetracker.elp.entity;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@RestResource(rel="task", path="task")
public class Task implements Serializable {

    @Id
    @GeneratedValue
    private String incidentId;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name="AppName", insertable = false, updatable = false)
    private Application application;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name="groupId", insertable = false, updatable = false)
    private Group group;

    private String incidentType;
    private String summary;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name="empId", insertable = false, updatable = false)
    private Employee employee;
    private Timestamp submitDate;
    private Timestamp closedDate;
    private String impact;
    private String resolution;
    private String resCateTier1;
    private String status;
    private Timestamp respondedDate;
    private String resCateTier3;
    private Timestamp targetDate;
    private int maintId;
    private Timestamp maintTs;




}
