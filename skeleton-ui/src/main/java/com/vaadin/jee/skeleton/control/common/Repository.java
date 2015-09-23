package com.vaadin.jee.skeleton.control.common;

import com.vaadin.jee.skeleton.entity.common.BaseEntity;

import java.util.Optional;

public interface Repository<E extends BaseEntity> {

    Optional<E> findById(Long id);

    E save(E entity);

    void remove(E entity);
}
