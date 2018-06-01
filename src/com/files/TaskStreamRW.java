package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 01.06.2018.
 */
public class TaskStreamRW {

    public static void main(String[] args) {
        FileInputStream in = null;

        try {
            in = new FileInputStream("input.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = in.read()) != -1) {
                sb.append((char)c);
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
