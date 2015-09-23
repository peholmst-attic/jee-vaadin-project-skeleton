package com.vaadin.jee.skeleton.control.common;

import com.vaadin.jee.skeleton.entity.common.BaseEntity;

import javax.persistence.EntityManager;
import java.util.Objects;
import java.util.Optional;

/**
 * Base class for {@link com.vaadin.jee.skeleton.control.common.Repository}-implementations.
 *
 * @param <E> the type of the entity.
 */
public abstract class BaseRepository<E extends BaseEntity> implements Repository<E> {

    private final EntityManager entityManager;

    /**
     * Initializing constructor. In subclasses, this constructor should be public and annotated
     * with {@link javax.inject.Inject}.
     *
     * @param entityManager the entity manager to use.
     */
    protected BaseRepository(EntityManager entityManager) {
        this.entityManager = Objects.requireNonNull(entityManager);
    }

    /**
     * Gets the entity manager to use.
     *
     * @return the entity manager, never {@code null}.
     */
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Returns the entity class. This is used for example when invoking the
     * {@link javax.persistence.EntityManager#find(Class, Object)} method.
     *
     * @return the entity class. never {@code null}.
     */
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
