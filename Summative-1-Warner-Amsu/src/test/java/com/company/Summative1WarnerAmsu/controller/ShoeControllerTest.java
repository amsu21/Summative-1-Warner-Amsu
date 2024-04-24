package com.company.Summative1WarnerAmsu.controller;

import com.company.Summative1WarnerAmsu.model.Shoe;
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
@WebMvcTest(ShoeController.class)

public class ShoeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // TEST GET
    @Test
    public  void getShoe() throws Exception {
        mockMvc.perform(get("/shoe"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
