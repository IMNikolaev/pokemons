package rest_example.repository;

import rest_example.entity.Pokemon;


import java.util.HashMap;
import java.util.Map;

public class TopList {
    Map<Integer, Pokemon> topList;

    public TopList(Map<Integer, Pokemon> topList) {
        this.topList = new HashMap<>();
    }
}
