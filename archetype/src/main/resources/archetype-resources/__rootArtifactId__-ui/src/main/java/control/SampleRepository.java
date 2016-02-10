#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.control;

import javax.transaction.Transactional;

import ${package}.control.common.BaseRepository;
import ${package}.entity.SampleEntity;

@Transactional(Transactional.TxType.MANDATORY)
public class SampleRepository extends BaseRepository<SampleEntity> {
}
