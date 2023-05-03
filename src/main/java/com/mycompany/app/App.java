package com.mycompany.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) throws IOException {
        File file = new File("/java");
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File("/java/sout.log");
        if (!file.exists()) {
            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(MESSAGE.getBytes());
            outputStream.close();
        }
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
