package com.xy;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.persistence.ManyToOne;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * Created by xyduan on 11/7/16.
 */
@Data
@Entity
public class Employee {
    public Long getId() {
        return id;
    }

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private @Version @JsonIgnore Long version;

    private @ManyToOne  Manager manager;

    private Employee() {}

    public Employee(String firstName, String lastName, String description, Manager manager){
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.manager = manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
