package com.company.Summative1WarnerAmsu.controller;


import com.company.Summative1WarnerAmsu.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class QuoteController {
    private final List<Quote> quoteList;
    private static int idCounter = 1;

    public QuoteController() {
        quoteList = new ArrayList<>();

        // QUOTES
        quoteList.add(new Quote("The way to get started is to quit talking and begin doing.", "Rob", idCounter++));
        quoteList.add(new Quote("The only impossible journey is the one you never begin. - ", "Tony Robbins", idCounter++));
        quoteList.add(new Quote("You only live once, but if you do it right, once is enough. - ", "Mae West", idCounter++));
        quoteList.add(new Quote("Only a life lived for others is a life worthwhile. - ", "Albert Einstein",idCounter++));
        quoteList.add(new Quote("Life is a long lesson in humility. - ", "James M. Barrie", idCounter++));
        quoteList.add(new Quote("Love the life you live. Live the life you love. - ", "Bob Marley", idCounter++));
        quoteList.add(new Quote("I never dreamed about success, I worked for it. - ", "Estee Lauder", idCounter++));
        quoteList.add(new Quote("Stay hungry, stay foolish", "Steve Jobs", idCounter++));
        quoteList.add(new Quote("The future belongs to those who prepare for it today.", "Malcom X", idCounter++));
        quoteList.add(new Quote("Those who dare to fail miserably can achieve greatly.", "John F. Kennedy", idCounter++));
    }

    // GET ALL QUOTES
    // METHOD ANNOTATIONS
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {
        Random random = new Random();
        return quoteList.get(random.nextInt(9));

    }
}

