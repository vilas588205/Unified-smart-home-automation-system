package Oopstask;

import Oopstask.abstractinterface.ismartlight;

public class smartlight extends abstractsmartdevice implements ismartlight {
	private int brightness;
    private String color;

    public smartlight(String deviceId, String devicename) {
        super(deviceId, devicename);
        this.brightness = 60; // Default brightness
        this.color = "red"; // Default color
    }

    @Override
    public void turnon() {
        System.out.println(getdevicename() + " is turned on.");
    }

    @Override
    public void turnoff() {
        System.out.println(getdevicename() + " is turned off.");
    }

   // @Override
    public void setbrightness(int level) {
        this.brightness = level;
        System.out.println(getdevicename() + " brightness set to " + level);
    }

  //  @Override
    public void setcolor(String color) {
        this.color = color;
        System.out.println(getdevicename() + " color set to " + color);
    }

	public static void main(String[] args) {
		

	}

}
