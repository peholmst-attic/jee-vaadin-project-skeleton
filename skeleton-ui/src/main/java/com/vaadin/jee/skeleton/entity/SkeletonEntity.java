package com.vaadin.jee.skeleton.entity;

import com.vaadin.jee.skeleton.entity.common.BaseEntity;

import javax.persistence.Entity;

@Entity
public class SkeletonEntity extends BaseEntity {

    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
