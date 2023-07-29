package com.example;

import java.util.List;

public class Lion implements IKitten{
    private IKitten kitten;

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

    @Override
    public List<String> getFood(String type) throws Exception {
        return kitten.getFood("Хищник");
    }


    public boolean doesHaveMane() {
        return hasMane;
    }




}
