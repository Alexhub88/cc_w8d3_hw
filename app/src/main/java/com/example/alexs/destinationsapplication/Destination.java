package com.example.alexs.destinationsapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class Destination implements Serializable {

    private Integer ranking;
    private String name;

    public Destination(Integer ranking, String name) {
        this.ranking = ranking;
        this.name = name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }
}
