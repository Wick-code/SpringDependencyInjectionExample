package com.example.impl;

import com.example.inerf.Performer;

public class Juggler implements Performer {
    private int beanbag = 3;

    public Juggler(){
    }

    public Juggler(int beanbag){
        this.beanbag = beanbag;
    }

    public void perform(){
        System.out.println("juggling " + beanbag + " beanbags. " );
    }
}
