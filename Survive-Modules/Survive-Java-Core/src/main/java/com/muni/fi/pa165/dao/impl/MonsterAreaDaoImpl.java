/* ------------------------------------------------
 * MonsterTypeJpaDao.java
 * 
 * ------------------------------------------------
 */
package com.muni.fi.pa165.dao.impl;

import com.muni.fi.pa165.dao.MonsterAreaDao;
import com.muni.fi.pa165.dao.gen.GenericDaoAbs;
import com.muni.fi.pa165.entities.MonsterArea;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 * This class represents the implementation of all basic operations. Typed JpaDao objects extending the GenericDaoAbs
 * abstract class and implementing a Type specific interface. This Dao object will be used to perform all operations
 * within the business layer.
 *
 * @author Michal Vikler
 */
@Repository
public class MonsterAreaDaoImpl extends GenericDaoAbs<MonsterArea, Long> implements MonsterAreaDao {

    public MonsterAreaDaoImpl() {
        super(MonsterArea.class);
    }

    @Override
    public List<MonsterArea> getByMonsterId(Long id){
 EntityManager em = this.getEntityManagerFactory().createEntityManager();
        TypedQuery<MonsterArea> query = em.createQuery("select m from " + getPersistentClass().getSimpleName()  + " m where m.monster.id = :id", MonsterArea.class);
        query.setParameter("id", id);
       return query.getResultList();
    }

    @Override
    public List<MonsterArea> getByAreaId(Long id) {
        EntityManager em = this.getEntityManagerFactory().createEntityManager();
           TypedQuery<MonsterArea> query = em.createQuery("select m from " + getPersistentClass().getSimpleName()  + " m where m.weapon.id = :id", MonsterArea.class);
        query.setParameter("id", id);
       return query.getResultList(); 
    }
}

    
   
