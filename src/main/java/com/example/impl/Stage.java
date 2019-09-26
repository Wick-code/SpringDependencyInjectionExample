package com.example.impl;

public class Stage {

    private Stage(){
    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    private static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

    public void setStage(){
        System.out.println("Stage set for performer. ");
    }

}
