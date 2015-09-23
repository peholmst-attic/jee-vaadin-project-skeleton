package com.vaadin.jee.skeleton.boundary;

import com.vaadin.jee.skeleton.entity.SampleEntity;

import javax.ejb.Local;

@Local
public interface SampleBoundary {

    SampleEntity createAndReturn(String foo);

}
