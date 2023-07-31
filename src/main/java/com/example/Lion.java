package com.example;

import java.util.List;

public class Lion {
    private IKitten kitten;
    Predator predator;

    public Lion(IKitten kitten) {
        this.kitten = kitten;
    }

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    public int getKittens() {
        return kitten.getKittens();
    }


    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return kitten.getFood();
    }
}
