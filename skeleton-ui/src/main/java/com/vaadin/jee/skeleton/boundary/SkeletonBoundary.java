package com.vaadin.jee.skeleton.boundary;

import com.vaadin.jee.skeleton.entity.SkeletonEntity;

import javax.ejb.Local;

@Local
public interface SkeletonBoundary {

    SkeletonEntity createAndReturn(String foo);

}
