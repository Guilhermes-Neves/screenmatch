package br.com.alura.screenmatch.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;


public class BuilderGson {
    public static Gson createGson() {
        return new com.google.gson.GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }
}
