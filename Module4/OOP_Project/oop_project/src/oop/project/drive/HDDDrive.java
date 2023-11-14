package oop.project.drive;

import oop.project.file.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements  Drive {
    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
