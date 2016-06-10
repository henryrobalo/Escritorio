package org.academiadecodigo.escritorio;

import java.io.*;

/**
 * Created by codecadet on 08/06/16.
 */
public class FileManager {

    private BufferedReader bf = new BufferedReader(new FileReader(filePath));

    public FileManager() throws FileNotFoundException {
        this.bf = bf;
    }

    public static final String filePath = "resources/listatelefonica.txt";

    public static void save(String string) throws IOException {

        FileWriter writer = new FileWriter(filePath);

        BufferedWriter bf = new BufferedWriter(writer);

        bf.write(string);

        bf.close();
    }

    public String readLine() throws FileNotFoundException {

        String line = "";
        try {
            line = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
