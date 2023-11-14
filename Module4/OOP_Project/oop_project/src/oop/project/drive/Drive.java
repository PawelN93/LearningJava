package oop.project.drive;

import oop.project.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String fileName);
}
