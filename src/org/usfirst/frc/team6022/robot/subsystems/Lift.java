package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This controls the microswitches so when it's pressed it'll go one way, and if it's
 * not pressed it'll go the other way.
 */
public class Lift extends Subsystem {
	
	DigitalInput switch1 = new DigitalInput(0);
	DigitalInput switch2 = new DigitalInput(1);
	static VictorSP FirstLevel = new VictorSP(5); 
	static VictorSP SecondLevel = new VictorSP(6);
	static VictorSP ThirdLevel = new VictorSP(7);

    public Lift()
    {
    	super();
    }
	
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Up(Joystick Branjoy)
	{
		if (switch1.get()) 
		{
			FirstLevel.set(0.3);
		} 
		else 
		{
			if (switch2.get()) 
			{
				FirstLevel.set(0.0);
				SecondLevel.set(0.3);
			}
			else
			{
				SecondLevel.set(0.0);
				ThirdLevel.set(0.3);
			}
		}
	}
    public void stopMotor(Joystick Branjoy)
	{
		
    
	}

}

