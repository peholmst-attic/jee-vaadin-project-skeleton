package com.vaadin.jee.skeleton.control;

import com.vaadin.jee.skeleton.control.common.BaseRepository;
import com.vaadin.jee.skeleton.entity.SampleEntity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional(Transactional.TxType.MANDATORY)
public class SampleRepository extends BaseRepository<SampleEntity> {

    @Inject
    public SampleRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<SampleEntity> getEntityClass() {
        return SampleEntity.class;
    }
}
