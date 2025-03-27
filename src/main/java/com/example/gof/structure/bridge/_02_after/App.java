package com.example.gof.structure.bridge._02_after;


import com.example.gof.structure.bridge._01_before.Champion;

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new Ahri(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new Ahri(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
