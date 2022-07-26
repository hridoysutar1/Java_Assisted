package Lesson3;

import java.io.*;
import java.util.Scanner;

public class fileHandlingDemo {
    public static void main(String[] args) {
        //Create  a new file
        File myFile=new File("assisted.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            throw new RuntimeException(e);
        }

        //Write
        try {
            FileWriter fileWriter=new FileWriter("assisted.txt");
            fileWriter.write("This is file is writing \n \n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Read
        try {
            Scanner sc=new Scanner(myFile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);

            }
            System.out.println("This is read");
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //append

        try {
            FileWriter file=new FileWriter("assisted.txt",true);

            BufferedWriter bf=new BufferedWriter(file);
            bf.write("This is append");
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
