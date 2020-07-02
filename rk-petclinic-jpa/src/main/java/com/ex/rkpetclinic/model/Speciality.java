package com.ex.rkpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="spcialities")
public class Speciality extends BaseEntity {

    @Column(name="description")
    private String decription;

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
