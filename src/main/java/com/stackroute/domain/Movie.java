package com.stackroute.domain;

public class Movie {
    Actor actor;
    public Movie(){}

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void act()
    {
        actor.act();
    }

    public Movie setActor(Actor actor) {
        this.actor = actor;
        return this;
    }
}
