
package ilite.us.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.SampleRobot;


public class Robot extends SampleRobot {
private CANTalon backRight, frontRight;
private CANTalon backLeft, frontLeft;
private Joystick leftStick, rightStick;

	public Robot() 
	{
		robotInit();
    }
    
    public void robotInit() 
    {
    	frontRight = new CANTalon(4);
    	frontLeft = new CANTalon(1);
    	backRight = new CANTalon(2);
    	backLeft = new CANTalon(3);
    	leftStick = new Joystick(0);
    	rightStick = new Joystick(1);
    }

    public void autonomous() 
    {
    }

    public void operatorControl() 
    {
	while(true){
	    	updateLeft(leftStick.getAxis(AxisType.kY));
	    	updateRight(rightStick.getAxis(AxisType.kY));
		try{
			Thread.sleep(5);
		}
		catch(Exception e){}
	}
    }

    public void test() 
    {
    	
    }
    
    public void updateLeft(double speed){
    	frontLeft.set(speed);
    	backLeft.set(speed);
    }
    
    public void updateRight(double speed){
    	frontRight.set(speed);
    	backRight.set(speed);
    }
}
