package com.bisratmk.roboresume.roboresume.Container;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Exp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long expId;

    @NotNull
    @Size(min = 4)
    private String jobTitle;

    @NotNull
    @Size(min = 4)
    private String company;

    @NotNull
    @Size(min = 4)
    private String startTime;
    private String endTime;

    @NotNull
    @Size(min = 4)
    private String position;

    public Long getExpId() {
        return expId;
    }

    public void setExpId(Long expId) {
        this.expId = expId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}