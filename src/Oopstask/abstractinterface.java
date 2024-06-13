package Oopstask;

public class abstractinterface {
	public  interface ismartlight {
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
	}
	public static void main(String[] args) {
		

	}

}
