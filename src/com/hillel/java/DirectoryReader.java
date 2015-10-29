package com.hillel.java;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by EKarpenko on 04.06.2015.
 */
public class DirectoryReader {
    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showDialog(null, "Open");

        if (result == JFileChooser.APPROVE_OPTION) {
            Path directory = fileChooser.getSelectedFile().toPath();
            DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory);

            for (Path file: dirStream) {
                System.out.println(file.getFileName());
            }

            dirStream.close();
        }
    }
}
