package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by student on 01.06.2018.
 */
public class MainRW {

    public static void main(String[] args) {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("output.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println((char) c);
                outputStream.append((char) c);
            }
            outputStream.append("q");
            outputStream.write("super", 0, 4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
