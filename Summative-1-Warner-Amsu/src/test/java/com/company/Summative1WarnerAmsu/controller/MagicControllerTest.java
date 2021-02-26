package com.company.Summative1WarnerAmsu.controller;

import com.company.Summative1WarnerAmsu.model.Magic;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class MagicControllerTest {
    // WIRING THE MOCk MVC OBJECT
    @Autowired
    private MockMvc mockMvc;

    // OBJECT MAPPER CONVERTS JAVA OBJECTS TO JSON AND VICE VERSA
    private ObjectMapper mapper = new ObjectMapper();

    // TEST POST "/magic"
    @Test
    public void getMagic() throws Exception {
        // ARRANGE
        Magic inputMagic = new Magic();
        inputMagic.setQuestion("Enter a question");
        inputMagic.setAnswer("As I see it, yes.");
        inputMagic.setId(0);

        // CONVERT JAVA OBJECT TO JSON
        String inputJson = mapper.writeValueAsString(inputMagic);
        Magic outputMagic = new Magic();
        outputMagic.setQuestion("Enter a question");
        outputMagic.setAnswer("As I see it, yes.");
        inputMagic.setId(0);

        String outputJson = mapper.writeValueAsString(outputMagic);
        // ACTION
        mockMvc.perform(
                post("/magic")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated());
    }


}
