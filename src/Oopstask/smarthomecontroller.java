package Oopstask;

import java.util.ArrayList;
import java.util.List;

public class smarthomecontroller {
	private List<abstractsmartdevice> devices;

    public smarthomecontroller() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(abstractsmartdevice device) {
        devices.add(device);
        System.out.println("Device added: " + device.getdevicename());
    }

    public void removeDevice(String deviceId) {
        devices.removeIf(device -> device.getdeviceId().equals(deviceId));
        System.out.println("Device removed: " + deviceId);
    }

    public void turnAllDevicesOn() {
        for (abstractsmartdevice device : devices) {
            device.turnon();
        }
    }

    public void turnAllDevicesoff() {
        for (abstractsmartdevice device : devices) {
            device.turnoff();
        }
    }

	public static void main(String[] args) {
		

	}

}
