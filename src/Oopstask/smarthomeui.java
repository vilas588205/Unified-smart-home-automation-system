package Oopstask;

import java.util.Scanner;

public class smarthomeui {
	private smarthomecontroller controller;
    private Scanner scanner;

    public smarthomeui() {
        controller = new smarthomecontroller();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Device");
            System.out.println("2. Remove Device");
            System.out.println("3. Turn All Devices On");
            System.out.println("4. Turn All Devices Off");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    adddevice();
                    break;
                case 2:
                    removeDevice();
                    break;
                case 3:
                    controller.turnAllDevicesOn();
                    break;
                case 4:
                    controller.turnAllDevicesoff();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void adddevice() {
        System.out.println("Enter device type (light/thermostat/camera): ");
        String type = scanner.nextLine();
        System.out.println("Enter device ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter device name: ");
        String name = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "light":
                controller.addDevice(new smartlight(id, name));
                break;
            case "thermostat":
                controller.addDevice(new smartthermostat(id, name));
                break;
            case "camera":
                controller.addDevice(new smartcamera(id, name));
                break;
            default:
                System.out.println("Invalid device type.");
        }
    }

    private void removeDevice() {
        System.out.println("Enter device ID to remove: ");
        String id = scanner.nextLine();
        controller.removeDevice(id);
    }

    public static void main(String[] args) {
        new smarthomeui().start();
    }
}

