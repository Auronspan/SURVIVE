/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pa165.dao.service.impl;

import com.muni.fi.pa165.service.impl.MonsterAreaServiceImpl;
import com.muni.fi.pa165.dao.MonsterAreaDao;
import com.muni.fi.pa165.service.AbstractServiceIntegrationTest;
import com.muni.fi.pa165.dto.MonsterAreaDto;
import com.muni.fi.pa165.entities.Area;
import com.muni.fi.pa165.entities.Monster;
import com.muni.fi.pa165.entities.MonsterArea;
import com.muni.fi.pa165.enums.MonsterClass;
import com.muni.fi.pa165.enums.TerrainType;
import javax.inject.Inject;
import org.dozer.Mapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 *
 * @author irina
 */
public class MonsterAreaServiceImplTest extends AbstractServiceIntegrationTest {
    @Inject
    private MonsterAreaDao mockDAO;
    private MonsterAreaServiceImpl service;
    
    @Inject
    private Mapper mapper;
    
    
    private Monster monster = new Monster();
    private Area area = new Area(); 
    private MonsterAreaDto monsterAreaDto = new MonsterAreaDto();
    

    @Before
    public void setUp() {
        service = new MonsterAreaServiceImpl();
        mockDAO = mock(MonsterAreaDao.class);
        service.setDao(mockDAO);
        service.setMapper(mapper);
        
        monster.setId(1L);
        monster.setAgility(11.0);
        monster.setDangerLevel(22.4);
        monster.setDescription("Headless Zombie");
        monster.setHeight(11.4);
        monster.setImagePath("C:\\image.png");
        monster.setMonsterClass(MonsterClass.Zombie);
        monster.setStamina(11.5);
        monster.setStrength(11.8);
        monster.setWeight(11.2);
        monster.setName("HeadlessNick");
        
        area.setName("Farm");
        area.setTerrain(TerrainType.SNOW);
        
        monsterAreaDto.setArea(area);
        monsterAreaDto.setMonster(monster);
        monsterAreaDto.setMonsterQuantity(5);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }
/**
     * Test of save method, of class MonsterAreaServiceImpl.
     */
    @Test
    public void testSave() {

        MonsterArea entity = mapper.map(monsterAreaDto, MonsterArea.class);
        when(mockDAO.save(any(MonsterArea.class))).thenReturn(entity);
        MonsterAreaDto returned = service.save(monsterAreaDto);
        verify(mockDAO, times(1)).save(entity);
        assertEquals(returned, monsterAreaDto);
          
    }
    /**
     * Test of update method, of class MonsterAreaServiceImpl.
     */
    @Test
    public void testUpdate() {

        MonsterArea entity = mapper.map(monsterAreaDto, MonsterArea.class);
        when(mockDAO.update(any(MonsterArea.class))).thenReturn(entity);
        MonsterAreaDto returned = service.update(monsterAreaDto);
        verify(mockDAO, times(1)).update(entity);
        verifyNoMoreInteractions(mockDAO);
        assertEquals(returned, monsterAreaDto);
}
      /**
     * Test of delete method, of class MonsterAreaServiceImpl.
     */
        @Test
        public void testDelete() {
            
          MonsterArea entity = mapper.map(monsterAreaDto, MonsterArea.class);
          service.delete(monsterAreaDto);
          verify(mockDAO, times(1)).delete(entity);
          verifyNoMoreInteractions(mockDAO);
       
    }   
}
              