package oop.project;

import oop.project.drive.Drive;
import oop.project.drive.HDDDrive;
import oop.project.usbdevice.MemoryStick;
import oop.project.usbdevice.Mouse;
import oop.project.usbdevice.USBDevice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell");
        Drive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);
//        hddDrive.addFile(new File("photo.jpg"));
//        hddDrive.listFiles();
//        computer.addFile(new File("file.png"));
//        computer.listFiles();

        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive");

        computer.addUSBDevice(mouse);
        computer.addUSBDevice(memoryStick);

//        List<USBDevice> usbDevices = computer.getUsbDevices();
//
//        for (USBDevice device : usbDevices) {
//            System.out.println(device.getName());
//        }

        computer.removeUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);

    }
}