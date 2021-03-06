package com.infosys.timetracker.elp.entity;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@RestResource(rel="employee", path="employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String cId;
    private String empName;

    @Enumerated(EnumType.STRING)
    private Access access;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "groupId")
    private Group group;

    private int maintId;
    private Timestamp maintTs;

    @OneToMany(mappedBy = "task")
    private List<Task> tasks;

    //ADMIN, READ, WRITE
    public enum Access {
        A,
        R,
        W
    }

}