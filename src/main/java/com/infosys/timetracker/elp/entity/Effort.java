package com.infosys.timetracker.elp.entity;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@RestResource(rel="effort", path="effort")
public class Effort implements Serializable {


    @EmbeddedId
    private EffortId effortId;
    private Double mon;
    private Double tue;
    private Double wed;
    private Double thr;
    private Double fri;
    private Double sat;
    private Double sun;
    private Integer maintId;
    private Timestamp maintTs;

}
