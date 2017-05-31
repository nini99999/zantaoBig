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

    private String deleted;


    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
