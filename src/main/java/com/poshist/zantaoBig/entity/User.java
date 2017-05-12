package com.poshist.zantaoBig.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * Created by server on 17-5-12.
 */
@Entity
@Table(name = "ZT_USER")
@EntityListeners(AuditingEntityListener.class)
public class User extends AbstractEntity {
    private String account;
    private String realname;
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
