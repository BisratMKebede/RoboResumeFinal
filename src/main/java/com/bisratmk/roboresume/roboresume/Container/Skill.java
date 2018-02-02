package com.bisratmk.roboresume.roboresume.Container;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill {

    @Id
    @GeneratedValue
    private Long skId;

    @NotNull
    @Size(min = 4)
    private String skillName;

    public Long getSkId() {
        return skId;
    }

    public void setSkId(Long skId) {
        this.skId = skId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
