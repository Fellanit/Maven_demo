package org.example;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;


public class App{
    public static void main( String[] args ) {
        Map<String,String > name = new HashMap<>();
        name.put(
                "name", "Bogdan"

        );
        name.put(
                "lastname","Syniavskiy"
        );
        System.out.println("new Gson().toJson(name) = " + new Gson().toJson(name));
    }
}