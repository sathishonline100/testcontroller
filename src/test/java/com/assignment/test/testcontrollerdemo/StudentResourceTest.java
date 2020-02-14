package com.assignment.test.testcontrollerdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class StudentResourceTest {

    private MockMvc mockMvc;

    @InjectMocks
    private StudentResource studentResource;


    @Before
    public void setUp() throws Exception {
        mockMvc= MockMvcBuilders.standaloneSetup(studentResource).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStudent() throws Exception{

        mockMvc.perform(get("/student"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is a test"));

    }
}