package com.example;

import java.util.List;

public interface IKitten {
    int getKittens();
    List<String> getFood(String type) throws Exception;
}
