package com.company.Summative1WarnerAmsu.controller;

import com.company.Summative1WarnerAmsu.model.Shoe;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class ShoeController {
    private final List<Shoe> shoeList;
//    private static int idCounter = 1;

    public ShoeController() {
        shoeList = new ArrayList<>();

        // SHOES
        shoeList.add(new Shoe("Nike", "Air Max 90", 1990));
        shoeList.add(new Shoe("Jordan", "Air Jordan 3", 1988));
        shoeList.add(new Shoe("Asics", "Gel Kayano 14", 2008));
        shoeList.add(new Shoe("New Balance", "990v3", 2012));
        shoeList.add(new Shoe("Nike", "Mac Attack", 1984));
    }

    // GET ALL SHOES
    @RequestMapping(value="/shoe", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Shoe getShoe() {
        Random random = new Random();
        return shoeList.get(random.nextInt(5));
    }

}
