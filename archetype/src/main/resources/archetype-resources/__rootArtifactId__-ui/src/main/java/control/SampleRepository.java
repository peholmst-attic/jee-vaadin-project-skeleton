#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.control;

import ${package}.control.common.BaseRepository;
import ${package}.entity.SampleEntity;

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
