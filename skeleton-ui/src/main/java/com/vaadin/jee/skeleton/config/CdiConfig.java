package com.vaadin.jee.skeleton.config;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * CDI configuration class.
 */
public class CdiConfig {

    /**
     * Makes the {@link javax.persistence.EntityManager} available for CDI injection.
     */
    @Produces
    @Dependent
    @PersistenceContext(unitName = "SkeletonPU")
    public EntityManager entityManager;
}
