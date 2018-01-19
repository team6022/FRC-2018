package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This controls the microswitches so when it's pressed it'll go one way, and if it's
 * not pressed it'll go the other way.
 */
public class Lift extends Subsystem {

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
    	
    }
}

