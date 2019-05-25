package com.stackroute.awareInterface;

public class Movie {


    private Actor actor;

    public void setActor(Actor actor)
    {
        this.actor = actor;

    }
    public Movie()
    {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
