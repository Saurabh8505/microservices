package solid.com.d;

public class Test {
	 public static void main(String[] args) {
	        
	        Switch lightSwitch = new Switch(new LightBulb());
	        lightSwitch.press(); 
	        lightSwitch.press(); 
	        Switch fanSwitch = new Switch(new Fan());
	        fanSwitch.press(); 
	        fanSwitch.press(); 
	    }
}
