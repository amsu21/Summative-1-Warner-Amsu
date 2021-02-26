package com.company.Summative1WarnerAmsu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// CLASS ANNOTATIONS
@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)

public class QuoteControllerTest {
    // WIRING THE MOCk MVC OBJECT
    @Autowired
    private MockMvc mockMvc;

    // TEST GET "/quote"
    @Test
    public void getQuote() throws Exception {
        // ACTION
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
