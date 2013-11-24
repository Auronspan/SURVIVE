/* ------------------------------------------------
 * MonsterweaponDaoImpl.java
 * 
 * ------------------------------------------------
 */
package com.muni.fi.pa165.dao.impl;

import com.muni.fi.pa165.dao.MonsterWeaponDao;
import com.muni.fi.pa165.dao.gen.GenericDaoAbs;
import com.muni.fi.pa165.entities.Monsterweapon;
import com.muni.fi.pa165.entities.MonsterweaponPK;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

/**
 * This class represents the implementation of all basic operations. Typed
 * JpaDao objects extending the GenericDaoAbs abstract class and implementing a
 * Type specific interface. This Dao object will be used to perform all
 * operations within the business layer.
 *
 * @author Michal Vikler
 */
@Repository
public class MonsterWeaponDaoImpl extends GenericDaoAbs<Monsterweapon, Long> implements MonsterWeaponDao {

    public MonsterWeaponDaoImpl() {
        super(Monsterweapon.class);
    }

    @Override
    public List<Monsterweapon> getByMonsterId(Long id) {
        EntityManager em = this.getEntityManagerFactory().createEntityManager();
        List<Monsterweapon> query = em.createNamedQuery("Monsterweapon.findByMonsterid").setParameter("monsterid", id).getResultList();
        return query;
    }

    @Override
    public List<Monsterweapon> getByWeaponId(Long id) {
        EntityManager em = this.getEntityManagerFactory().createEntityManager();
        List<Monsterweapon> query = em.createNamedQuery("Monsterweapon.findByWeaponid").setParameter("weaponid", id).getResultList();
        return query;
    }

    @Override
    public List<Monsterweapon> findAll() {
        EntityManager em = this.getEntityManagerFactory().createEntityManager();      
        List<Monsterweapon> query = em.createNamedQuery("Monsterweapon.findAll").getResultList();
        return query;
    }
    
    @Override
    public Monsterweapon findById(MonsterweaponPK id) {
      EntityManager em = this.getEntityManagerFactory().createEntityManager();      
        Monsterweapon query = (Monsterweapon) em.createNamedQuery("Monsterweapon.findById").setParameter("monsterweaponPK", id).getSingleResult();
        return query;
    }
}
