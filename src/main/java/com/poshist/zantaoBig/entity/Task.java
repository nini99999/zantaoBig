package com.poshist.zantaoBig.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by server on 17-5-12.
 */
@Entity
@Table(name = "ZT_TASK")
@EntityListeners(AuditingEntityListener.class)
public class Task extends AbstractEntity {


    private String name;
    private String type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project")
    private Project project;
    private String status;
    private String deleted;
    @ManyToOne
    @JoinColumn(name="assignedto",referencedColumnName="account")
    private User user;
    //需时
    private float estimate;
    //耗时
    private float consumed;

    public float getEstimate() {
        return estimate;
    }

    public void setEstimate(float estimate) {
        this.estimate = estimate;
    }

    public float getConsumed() {
        return consumed;
    }

    public void setConsumed(float consumed) {
        this.consumed = consumed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
