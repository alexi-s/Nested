package com.files;

import java.io.*;

/**
 * Created by student on 01.06.2018.
 */
public class MainData {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(
                    new FileOutputStream("out.dat")));
            out.writeUTF("Hello");
            out.writeUTF(" world");
            out.write(123);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
