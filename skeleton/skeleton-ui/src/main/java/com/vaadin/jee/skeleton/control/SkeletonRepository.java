package com.vaadin.jee.skeleton.control;

import com.vaadin.jee.skeleton.control.common.BaseRepository;
import com.vaadin.jee.skeleton.entity.SkeletonEntity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional(Transactional.TxType.MANDATORY)
public class SkeletonRepository extends BaseRepository<SkeletonEntity> {

    @Inject
    public SkeletonRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<SkeletonEntity> getEntityClass() {
        return SkeletonEntity.class;
    }
}
