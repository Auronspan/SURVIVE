/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pa165.dao.service.impl;

import com.muni.fi.pa165.service.impl.AreaServiceImpl;
import com.muni.fi.pa165.dao.AreaDao;
import com.muni.fi.pa165.service.AbstractServiceIntegrationTest;
import com.muni.fi.pa165.dto.AreaDto;
import com.muni.fi.pa165.entities.Area;
import com.muni.fi.pa165.enums.TerrainType;
import javax.inject.Inject;
import org.dozer.Mapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 *
 * @author Auron
 */
public class AreaServiceImplTest extends AbstractServiceIntegrationTest {

    @Inject
    private AreaDao mockDAO;
    private AreaServiceImpl service;
    @Inject
    private Mapper mapper;

    @Before
    public void setUp() {
        service = new AreaServiceImpl();
        mockDAO = mock(AreaDao.class);
        service.setDao(mockDAO);
        service.setMapper(mapper);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSave() {
//        System.out.println("Testing save");
        AreaDto dto = new AreaDto();
        dto.setName("Farm");
        dto.setTerrain(TerrainType.SNOW);
        Area entity = mapper.map(dto, Area.class);
        when(mockDAO.save(any(Area.class))).thenReturn(entity);
        AreaDto returned = service.save(dto);
        assertEquals(returned, dto);
    }

    /**
     * Test of update method, of class AreaServiceImpl.
     */
    @Test
    public void testUpdate() {
//        System.out.println("Testing update");

        AreaDto dto = new AreaDto();
        dto.setName("Farm");
        dto.setTerrain(TerrainType.SNOW);
        Area entity = mapper.map(dto, Area.class);
        when(mockDAO.update(any(Area.class))).thenReturn(entity);
        AreaDto returned = service.update(dto);
        verify(mockDAO, times(1)).update(entity);
        verifyNoMoreInteractions(mockDAO);
        assertEquals(returned, dto);


    }

    /**
     * Test of delete method, of class AreaServiceImpl.
     */
    @Test
    public void testDelete() {
//        System.out.println("Testing delete");

        AreaDto dto = new AreaDto();
        dto.setId(1L);
        dto.setName("Farm");
        Area entity = new Area();
        entity.setId(1L);
        entity.setName("Farm");

        service.delete(dto);

        verify(mockDAO, times(1)).delete(entity);
        verifyNoMoreInteractions(mockDAO);



    }

    /**
     * Test of findById method, of class AreaServiceImpl.
     */
    @Test
    public void testFindById() {
//        System.out.println("Testing FindById");

        AreaDto dto = new AreaDto();

        dto.setId(1L);
        dto.setName("Farm");
        dto.setTerrain(TerrainType.OCEANIC);

        Area entity = mapper.map(dto, Area.class);

        when(mockDAO.findById(dto.getId())).thenReturn(entity);

        AreaDto returned = service.findById(dto.getId());
        verify(mockDAO, times(1)).findById(dto.getId());
        verifyNoMoreInteractions(mockDAO);

        assertEquals(returned, dto);


    }
}