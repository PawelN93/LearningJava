package oop.project;

import oop.project.drive.Drive;
import oop.project.drive.HDDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell");
        Drive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);
//        hddDrive.addFile(new File("photo.jpg"));
//        hddDrive.listFiles();
        computer.addFile(new File("file.png"));
        computer.listFiles();

    }
}