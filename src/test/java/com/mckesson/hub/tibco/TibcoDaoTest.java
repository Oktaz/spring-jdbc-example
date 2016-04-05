package com.mckesson.hub.tibco;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Zatko on 4/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TibcoDaoTest {

    @Autowired
    private TibcoDao dao;

    @Test
    public void testGetSomeDatabaseTable() throws Exception {
        assertNotNull(dao);
        dao.getSomeDatabaseTable();

    }
}