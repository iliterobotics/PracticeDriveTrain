
package ilite.us.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SampleRobot;


public class Robot extends SampleRobot {
private CANTalon drive;

	public Robot() {
    }
    
    public void robotInit() {
    	drive = new CANTalon(0);
    }

    public void autonomous() {
    	drive.set(1);
    }

    public void operatorControl() {
    }

    public void test() {
    }
}
