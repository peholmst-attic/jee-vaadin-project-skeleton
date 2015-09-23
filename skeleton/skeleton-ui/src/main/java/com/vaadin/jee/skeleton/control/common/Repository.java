package com.vaadin.jee.skeleton.control.common;

import com.vaadin.jee.skeleton.entity.common.BaseEntity;

import java.util.Optional;

/**
 * Interface defining a repository for saving, removing and finding entities.
 *
 * @param <E> the type of the entity.
 * @see com.vaadin.jee.skeleton.entity.common.BaseEntity
 */
public interface Repository<E extends BaseEntity> {

    /**
     * Attempts to find the entity with the specified ID.
     *
     * @param id the ID of the entity to find.
     * @return an {@code Optional} containing the entity if found.
     * @see javax.persistence.EntityManager#find(Class, Object)
     */
    Optional<E> findById(Long id);

    /**
     * Saves the specified entity to the database and returns it.
     *
     * @param entity the entity to save.
     * @return the saved entity, which may or may not be the same instance as the passed in {@code entity}.
     * @see javax.persistence.EntityManager#persist(Object)
     * @see javax.persistence.EntityManager#merge(Object)
     */
    E save(E entity);

    /**
     * Deletes the specified entity from the database.
     *
     * @param entity the entity to remove.
     * @see javax.persistence.EntityManager#remove(Object)
     */
    void remove(E entity);
}
