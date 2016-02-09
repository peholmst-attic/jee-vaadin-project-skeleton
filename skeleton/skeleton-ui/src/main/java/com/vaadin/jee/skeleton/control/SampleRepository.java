package com.vaadin.jee.skeleton.control;

import com.vaadin.jee.skeleton.entity.SampleEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = SampleEntity.class)
public interface SampleRepository extends EntityRepository<SampleEntity, Long> {
}
