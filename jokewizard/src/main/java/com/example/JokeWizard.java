package com.example;

public class JokeWizard {

    public String getJoke() {
        return new JokeSmith().getJoke() + "Calling Class -> JokeWizard";
    }

}
