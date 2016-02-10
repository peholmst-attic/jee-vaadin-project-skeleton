package com.vaadin.jee.skeleton.control;

import javax.transaction.Transactional;

import com.vaadin.jee.skeleton.control.common.BaseRepository;
import com.vaadin.jee.skeleton.entity.SampleEntity;

@Transactional(Transactional.TxType.MANDATORY)
public class SampleRepository extends BaseRepository<SampleEntity> {
}
