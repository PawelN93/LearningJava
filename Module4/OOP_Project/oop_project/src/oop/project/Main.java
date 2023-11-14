package oop.project;

import oop.project.drive.Drive;
import oop.project.drive.HDDDrive;
import oop.project.drive.SSDDrive;
import oop.project.file.File;
import oop.project.file.image.GIFImageFile;
import oop.project.file.image.JPGImageFile;
import oop.project.file.music.MP3File;
import oop.project.usbdevice.MemoryStick;
import oop.project.usbdevice.Mouse;
import oop.project.usbdevice.USBDevice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor("Dell");
//        Drive hddDrive = new HDDDrive();
//
//        Computer computer = new Computer(monitor, hddDrive);
//        hddDrive.addFile(new File("photo.jpg"));
//        hddDrive.listFiles();
//        computer.addFile(new File("file.png"));
//        computer.listFiles();

//        Mouse mouse = new Mouse("Mysz");
//        MemoryStick memoryStick = new MemoryStick("Pendrive");
//
//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);

//        List<USBDevice> usbDevices = computer.getUsbDevices();
//
//        for (USBDevice device : usbDevices) {
//            System.out.println(device.getName());
//        }

//        computer.removeUSBDevice(mouse);
//
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);

        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 1000);
        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 800);

        Monitor monitor = new Monitor("Dell");
        Drive ssdDrive = new SSDDrive();

        Computer computer = new Computer(monitor, ssdDrive);
        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFile);

        //computer.listFiles();
        File file = computer.findFile("audio.mp3");
        System.out.println(file.getSize());
        System.out.println(file.getName());
        System.out.println(file);

    }
}