package com.company.Summative1WarnerAmsu.controller;


import com.company.Summative1WarnerAmsu.model.Magic;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {
    private final List<Magic> magicList;
    private static int idCounter = 1;

    public MagicController() {
        magicList = new ArrayList<>();

        // MAGIC ANSWERS
        magicList.add(new Magic("Enter a question", " As I see it, yes.", idCounter++));
        magicList.add(new Magic("Enter a question", " My reply is no.", idCounter++));
        magicList.add(new Magic("Enter a question", "Signs point to yes.", idCounter++));
        magicList.add(new Magic("Enter a question", " Ask again later.", idCounter++));
        magicList.add(new Magic("Enter a question", "Most likely", idCounter++));
        magicList.add(new Magic("Enter a question", " Don’t count on it.", idCounter++));
    }

    // POST ANSWERS
    // METHOD ANNOTATIONS
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic createMagic(@RequestBody @Valid Magic magic) {
        magic.setId(idCounter++);
        magicList.add(magic);
        return magic;
    }

    // GET ANSWERS
    // METHOD ANNOTATIONS
    @RequestMapping(value = "/magic", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Magic getMagic() {
        Random random = new Random();
        return magicList.get(random.nextInt(6));
    }
}