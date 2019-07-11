package com.stackroute.domain;

public class Movie {
    Actor actor;
    public void act()
    {
        actor.act();
    }

    public Movie setActor(Actor actor) {
        this.actor = actor;
        return this;
    }
}
