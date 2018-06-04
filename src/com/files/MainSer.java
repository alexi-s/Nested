package com.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 * Created by student on 04.06.2018.
 */
public class MainSer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student s1 = new Student("Alexey", "Petrov", 22);
        Student s2 = new Student("Ivan", "Makarov", 55);
        Student s3 = new Student("Oleg", "Popov", 18);
        Student s4 = new Student("Mihail", "Sokolov", 20);
        Student s5 = new Student("Alexandr", "Fomin", 21);

        FileWriter fw = new FileWriter("students.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        List students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        ListIterator iterator = students.listIterator();
        Student temp;
        while(iterator.hasNext()){
            temp = (Student)iterator.next();
            bw.write(temp.getFirstName() + "\t");
            bw.write(temp.getLastName() + "\t");
            bw.write(temp.getAge() + "\n");
        }

        bw.close();
        fw.close();


        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);

        String currentLine;
        List studentsD = new ArrayList<Student>();
        while((currentLine = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(currentLine, "\t");
            String firstName = tokenizer.nextToken();
            String lastName = tokenizer.nextToken();
            int age = Integer.valueOf(tokenizer.nextToken());
            studentsD.add(new Student(firstName, lastName, age));
        }

        br.close();
        fr.close();

        iterator = studentsD.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



/*        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.close();

        Student s2;
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        s2 = (Student) ois.readObject();
        System.out.println(s2);
        ois.close();
        System.out.println(s1.getAge());*/
    }
}
