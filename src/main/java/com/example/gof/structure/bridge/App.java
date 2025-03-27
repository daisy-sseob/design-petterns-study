package com.example.gof.structure.bridge;

import com.example.gof.structure.bridge._01_before.Champion;
import com.example.gof.structure.bridge._02_after.KDA;
import com.example.gof.structure.bridge._02_after.PoolParty;
import com.example.gof.structure.bridge._02_after.Ahri;

public class App {

    public static void main(String[] args) {
      
      Champion kdaAhri = new Ahri(new KDA());
      kdaAhri.skillQ();
      kdaAhri.skillW();

      Champion poolPartyAhri = new Ahri(new PoolParty());
      poolPartyAhri.skillR();
      poolPartyAhri.skillW();
    }
}
