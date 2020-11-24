package com.rongda.feature;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @class: FilesTest.class
 * @description:
 * @author: acao
 * @create: 2020-11-23 14:33
 **/
public class FilesTest {

    /**
     * Finds and returns the position of the first mismatched byte in the content
     * of two files
     */
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("1.txt");
        fileWriter1.write("8");
        fileWriter1.write("b");
        fileWriter1.write("c");
        fileWriter1.close();

        FileWriter fileWriter2 = new FileWriter("2.txt");
        fileWriter2.write("a");
        fileWriter2.write("8");
        fileWriter2.write("c");
        fileWriter2.close();

        System.out.println(Files.mismatch(Path.of("1.txt"), Path.of("2.txt")));
    }
}











