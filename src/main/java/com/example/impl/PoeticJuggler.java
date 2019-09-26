package com.example.impl;

import com.example.inerf.Poem;

public class PoeticJuggler extends Juggler{

    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanbags, Poem poem){
        super(beanbags);
        this.poem = poem;
    }

    @Override
    public void perform(){
        super.perform();
        System.out.println("start singing ");
        poem.recite();
    }

}
