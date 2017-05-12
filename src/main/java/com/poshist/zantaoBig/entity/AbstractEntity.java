package com.poshist.zantaoBig.entity;

/**
 * Created by server on 17-5-12.
 */

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity extends AbstractPersistable<Long> implements Cloneable {


    private static final long serialVersionUID = 5583035582769043365L;



}