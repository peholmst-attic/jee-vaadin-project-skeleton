package com.vaadin.jee.skeleton.config;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CdiConfig {

    @Produces
    @Dependent
    @PersistenceContext(unitName = "SkeletonPU")
    public EntityManager entityManager;
}
