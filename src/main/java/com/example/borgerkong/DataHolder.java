package com.example.borgerkong;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {
    final ArrayList<Item> item = new ArrayList<Item>();
    final ArrayList<Integer> counterList = new ArrayList();

    private DataHolder() {}

    static DataHolder getInstance() {
        if( instance == null ) {
            instance = new DataHolder();
        }
        return instance;
    }

    private static DataHolder instance;
}
