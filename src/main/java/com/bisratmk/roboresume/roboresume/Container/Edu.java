package com.bisratmk.roboresume.roboresume.Container;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Edu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eduId;

    @NotNull
    @Size(min = 4)
    private String university;

    @NotNull
    @Size(min = 4)
    private String degree;

    @NotNull
    @Size(min = 4)
    private String graduationYear;

    public Long getEduId() {
        return eduId;
    }

    public void setEduId(Long eduId) {
        this.eduId = eduId;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }
}
