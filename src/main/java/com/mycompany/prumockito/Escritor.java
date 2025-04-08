package com.mycompany.prumockito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class Escritor {
    private OutputStreamWriter osw;
    public Escritor(String nomArch) throws FileNotFoundException {
        File f = new File(nomArch);
        FileOutputStream fos = new FileOutputStream(f);
        osw = new OutputStreamWriter(fos);
    }
    public Escritor(OutputStreamWriter o) {
        osw = o;
    }
    public void escribe(List<String> cads) throws IOException {
        for(String c : cads) {
            osw.append(c);
        }
    }
}
