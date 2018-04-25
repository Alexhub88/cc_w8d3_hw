package com.example.alexs.destinationsapplication;

import java.util.ArrayList;

public class TopDestinations {

    private ArrayList<Destination> list;

    public TopDestinations() {
        list = new ArrayList<Destination>();
        this.list.add(new Destination(1, "Malta"));
        this.list.add(new Destination(2, "Maldives"));
        this.list.add(new Destination(3, "New York"));
        this.list.add(new Destination(4, "Athens"));
        this.list.add(new Destination(5, "Prague"));
        this.list.add(new Destination(6, "Sydney"));
        this.list.add(new Destination(7, "Rio de Janeiro"));
        this.list.add(new Destination(8, "Paris"));
        this.list.add(new Destination(9, "Madrid"));
        this.list.add(new Destination(10, "Kuala Lumpur"));
        this.list.add(new Destination(11, "Rome"));
        this.list.add(new Destination(12, "Moscow"));
    }
}
