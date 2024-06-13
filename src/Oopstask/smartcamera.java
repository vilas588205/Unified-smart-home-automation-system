package Oopstask;

import Oopstask.abstractinterface.ismartcamera;

public class smartcamera extends abstractsmartdevice implements ismartcamera {
	
	private boolean recording;

	
	
    public smartcamera(String deviceId, String devicename) {
        super(deviceId, devicename);
        this.recording = false;
    }

  //  @Override
    public void turnon() {
        System.out.println(getdevicename() + " is turned on.");
    }

  //  @Override
    public void turnoff() {
        System.out.println(getdevicename() + " is turned off.");
    }

    //@Override
    public void startrecording() {
        this.recording = true;
        System.out.println(getdevicename() + " started recording.");
    }

  //  @Override
    public void stoprecording() {
        this.recording = false;
        System.out.println(getdevicename() + " stopped recording.");
    }

	public static void main(String[] args) {
		

	}

}
