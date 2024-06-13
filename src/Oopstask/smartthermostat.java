package Oopstask;

import Oopstask.abstractinterface.ismartthermostat;

public class smartthermostat extends abstractsmartdevice implements ismartthermostat {
	private double temperature;

    public smartthermostat(String deviceId, String devicename) {
        super(deviceId, devicename);
        this.temperature = 29.0; // Default temperature
    }

    @Override
    public void turnon() {
        System.out.println(getdevicename() + " is turned on.");
    }

    @Override
    public void turnoff() {
        System.out.println(getdevicename() + " is turned off.");
    }

    @Override
    public void settemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(getdevicename() + " temperature set to " + temperature);
    }

	public static void main(String[] args) {
		
	}

}
