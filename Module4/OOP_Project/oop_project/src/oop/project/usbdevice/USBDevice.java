package oop.project.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
