package com.vaadin.jee.skeleton.boundary;

import com.vaadin.jee.skeleton.control.SkeletonRepository;
import com.vaadin.jee.skeleton.entity.SkeletonEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class SkeletonBoundaryBean implements SkeletonBoundary {

    @Inject
    SkeletonRepository skeletonRepository;

    @Override
    public SkeletonEntity createAndReturn(String foo) {
        SkeletonEntity entity = new SkeletonEntity();
        entity.setFoo(foo);
        return skeletonRepository.save(entity);
    }
}
