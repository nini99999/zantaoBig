package com.poshist.zantaoBig.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * Created by server on 17-5-12.
 */
@Entity
@Table(name = "ZT_PROJECT")
@EntityListeners(AuditingEntityListener.class)
public class Project extends AbstractEntity {

    private String name;


//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Task> tasks;
//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
