package com.bean;

import java.util.ArrayList;

/**
 * Created by sparkle on 12/25/16.
 */
public class ActorDetails {
    private String name;
    private ArrayList<String> songs;

    //Todo 1: Create a new variable that stores a list of movie names
    //Todo 1: Create getter and a update list method for getting and updating the list of movie names

    public ActorDetails(String name, ArrayList<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    //Todo 2: Create update songs list method
}
