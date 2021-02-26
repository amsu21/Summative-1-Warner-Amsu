package com.company.Summative1WarnerAmsu.model;

public class Word {
    private String word;
    private String definition;
    private int id;

    public Word() {}

    // CONSTRUCTOR
    public Word(String word, String definition, int id) {
        this.word = word;
        this.definition = definition;
        this.id = id;
    }

    // GETTERS AND SETTERS


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
