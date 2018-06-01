package com.files;

import java.io.File;
import java.io.IOException;

/**
 * Created by student on 01.06.2018.
 */
public class MainFile {

    public static void main(String[] args) {
        File f = new File("input.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());

        File folder = new File("test\\test");
        folder.mkdir();
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.setReadOnly();
        file.renameTo(new File(folder.getPath() + "\\" + file.getName()));
    }
}
