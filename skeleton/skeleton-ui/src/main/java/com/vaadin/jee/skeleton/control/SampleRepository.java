package com.vaadin.jee.skeleton.control;

import com.vaadin.jee.skeleton.entity.SampleEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import javax.transaction.Transactional;

@Transactional(Transactional.TxType.MANDATORY)
@Repository(forEntity = SampleEntity.class)
public interface SampleRepository extends EntityRepository<SampleEntity, Long> {
}
