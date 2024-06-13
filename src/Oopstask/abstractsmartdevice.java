package Oopstask;

public abstract class abstractsmartdevice {
	protected String deviceId;
    protected String devicename;

    public abstractsmartdevice(String deviceId, String devicename) {
        this.deviceId = deviceId;
        this.devicename = devicename;
    }

    public String getdeviceId() {
        return deviceId;
    }

    public String getdevicename() {
        return devicename;
    }

    public abstract void turnon();
    public abstract void turnoff();

 /*public  interface ismartlight {
    void turnon();
    void turnoff();
    void setbrightness(int level);
    void setcolor(String color);
}

public interface ismartthermostat {
    void turnon();
    void turnoff();
    void settemperature(double temperature);
}

public interface ismartcamera {
    void turnon();
    void turnoff();
    void startrecording();
    void stoprecording();
    */

	public static void main(String[] args) {
		
	}
}


