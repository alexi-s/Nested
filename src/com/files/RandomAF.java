package com.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by student on 01.06.2018.
 */
public class RandomAF {

    public static void main(String[] args) {

        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")){ // конструкция с ресурсами
            StringBuilder sb = new StringBuilder();

            String str = "Hello world";
            System.out.println(str);

            byte[] bytes = str.getBytes();
            for (byte b : bytes) {
                raf.write(b);
            }
            int num;
            raf.seek(0);
            while ((num = raf.read()) != -1) {
                sb.append((char)num);
            }

            System.out.println(sb);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
