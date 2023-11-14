package oop.project.file.image;

import oop.project.file.File;
import oop.project.file.FileType;

public class AbstractImageFile implements File {
    protected final String name;
    protected final int size;

    public AbstractImageFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
