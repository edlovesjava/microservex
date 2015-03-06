/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edlovesjava
 */
public class RepositoryTest {
    private TestRepository<Long, TestEntity> repository;
    
    public RepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        repository = new TestRepository<Long, TestEntity>();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void testCreateRepository() {
         assertNotNull(repository);
     }
     
     @Test 
     public void testAddToRepository() {
         
         TestEntity e = createTestEntity();
         repository.persist(e);
        final List<TestEntity> results = repository.findAll();
         assertNotNull(results);
         assertTrue(results.contains(e));
         
     }

    private TestEntity createTestEntity() {
        TestEntity e = new TestEntity(TEST_ID);
        return e;
    }
     
     @Test
     public void testFindById() {
         TestEntity e = createTestEntity();
         repository.persist(e);
        TestEntity found = repository.findById(TEST_ID);
        assertNotNull(found);
        assertEquals(Long.valueOf(TEST_ID), found.getId());
     }
    private static final long TEST_ID = 1l;
}
