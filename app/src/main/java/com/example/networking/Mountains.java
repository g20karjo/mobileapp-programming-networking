package com.example.networking;

public class Mountains {
    public Mountains(String ID, String name, String company, String location, String category, int size, int cost) {
        this.ID = ID;
        this.name = name;
        this.company = company;
        Location = location;
        Category = category;
        this.size = size;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    String ID;
    String name;
    String company;
    String Location;
    String Category;
    int size;
    int cost;

}
