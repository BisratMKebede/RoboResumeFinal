package com.bisratmk.roboresume.roboresume.Container;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @NotNull
    @Size(min = 4)
    private String firstName;
    private String lastName;
    @NotNull
    @Size(min=10)
    private String phonNo;
    @Email
    private String email;

    private ArrayList<Edu> EDU;
    private ArrayList<Exp> EXP;
    private ArrayList<Skill> SKILL;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhonNo() {
        return phonNo;
    }

    public void setPhonNo(String phonNo) {
        this.phonNo = phonNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Edu> getEDU() {
        return EDU;
    }

    public void setEDU(ArrayList<Edu> EDU) {
        this.EDU = EDU;
    }

    public ArrayList<Exp> getEXP() {
        return EXP;
    }

    public void setEXP(ArrayList<Exp> EXP) {
        this.EXP = EXP;
    }

    public ArrayList<Skill> getSKILL() {
        return SKILL;
    }

    public void setSKILL(ArrayList<Skill> SKILL) {
        this.SKILL = SKILL;
    }
}
