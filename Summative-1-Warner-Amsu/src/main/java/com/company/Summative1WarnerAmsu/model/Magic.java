package com.company.Summative1WarnerAmsu.model;

import javax.validation.constraints.NotEmpty;

public class Magic {
    @NotEmpty(message = "Enter a question.")
    private String question;
    private String answer;
    private int id;

    public Magic() {}

    // CONSTRUCTOR
    public Magic(String question, String answer, int id) {
        this.question = question;
        this.answer = answer;
        this.id = id;
    }

    // GETTERS AND SETTERS

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
