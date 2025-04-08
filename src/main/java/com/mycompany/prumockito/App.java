package com.mycompany.prumockito;

import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        Escritor escr;
        escr = new Escritor("arch.txt");
        escr.escribe(Arrays.asList(args));
    }
}
