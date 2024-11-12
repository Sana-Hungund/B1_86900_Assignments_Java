import java.util.Iterator;

public class Question4 {
	enum TrafficLight{
		RED(30),
	    GREEN(60),
	    YELLOW(5);

	    private final int duration;

	    TrafficLight(int duration) {
	        this.duration = duration;
	    }

	    public int getDuration() {
	        return duration;
	    }
	}
	

	public static void main(String[] args) {
		TrafficLight[] light = TrafficLight.values();
		for (int i = 0; i < light.length; i++) {
			System.out.println(light[i] + " light duration " + light[i].getDuration());
			
		}
		
		
	}

}
