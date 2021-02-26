package com.company.Summative1WarnerAmsu.controller;


import com.company.Summative1WarnerAmsu.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private final List<Word> wordList;
    private static int idCounter = 1;

    public WordController() {
        wordList = new ArrayList<>();

        // WORDS
        wordList.add(new Word("Acnestis", "The part of the back (or backbone) between the shoulder blades and the loins which an animal cannot reach to scratch", idCounter++));
        wordList.add(new Word("Grommet", "an eyelet of firm material to strengthen or protect an opening or to insulate or protect something passed through it", idCounter++));
        wordList.add(new Word("Meldrop", "A drop of mucus at the nose, whether produced by cold or otherwise", idCounter++));
        wordList.add(new Word("Octothorpe", "the symbol #", idCounter++));
        wordList.add(new Word("Nauseant", "an agent that induces nausea", idCounter++));
        wordList.add(new Word("Obelus", "the symbol ÷", idCounter++));
        wordList.add(new Word("Agelast", "a person who never laughs", idCounter++));
        wordList.add(new Word("Computer", "a programmable usually electronic device that can store, retrieve, and process data", idCounter++));
        wordList.add(new Word("Slugabed", "a person who stays in bed after the usual or proper time to get up", idCounter++));
        wordList.add(new Word("Abundance", "an ample quantity", idCounter++));

    }

    // GET ALL WORDS
    // METHOD NOTATIONS
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord() {
        Random random = new Random();
        return wordList.get(random.nextInt(9));
    }

}
