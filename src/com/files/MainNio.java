package com.files;

import java.io.*;

/**
 * Created by student on 04.06.2018.
 */
public class MainNio {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.close();
        fw.close();


        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        String currentLine;
        while((currentLine = br.readLine()) != null) {
            System.out.println(currentLine);
        }
        br.close();
        fr.close();
    }
}
