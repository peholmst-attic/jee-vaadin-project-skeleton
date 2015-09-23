package com.vaadin.jee.skeleton.control.common;

import com.vaadin.jee.skeleton.entity.common.BaseEntity;

import javax.persistence.EntityManager;
import java.util.Objects;
import java.util.Optional;

public abstract class BaseRepository<E extends BaseEntity> implements Repository<E> {

    private final EntityManager entityManager;

    protected BaseRepository(EntityManager entityManager) {
        this.entityManager = Objects.requireNonNull(entityManager);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected abstract Class<E> getEntityClass();

    @Override
    public Optional<E> findById(Long id) {
        return Optional.ofNullable(getEntityManager().find(getEntityClass(), Objects.requireNonNull(id)));
    }

    @Override
    public E save(E entity) {
        Objects.requireNonNull(entity);
        if (entity.isNew()) {
            getEntityManager().persist(entity);
            return entity;
        } else {
            return getEntityManager().merge(entity);
        }
    }

    @Override
    public void remove(E entity) {
        getEntityManager().remove(Objects.requireNonNull(entity));
    }
}
