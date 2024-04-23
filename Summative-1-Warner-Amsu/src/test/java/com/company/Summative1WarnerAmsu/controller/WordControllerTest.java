package com.company.Summative1WarnerAmsu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


// CLASS ANNOTATIONS
@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)


public class WordControllerTest {
    // WIRING THE MOCk MVC OBJECT
    @Autowired
    private MockMvc mockMvc;


    //TEST GET "/word"
    @Test
    public void getWord() throws Exception {
        // ACTION
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
