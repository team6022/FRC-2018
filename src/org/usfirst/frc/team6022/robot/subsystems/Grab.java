package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class Grab extends Subsystem {
	Compressor CompLeft = new Compressor(0);
	Compressor CompRight = new Compressor(1);
    public Grab()
    {
    	super ();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void Compressy(Joystick Branjoy) 
    {
    	if (CompLeft.getClosedLoopControl() == false)
    	{
    		CompLeft.setClosedLoopControl(true);
    		CompRight.setClosedLoopControl(true);
    	}
    	else
    	{
    		CompLeft.setClosedLoopControl(false);
    		CompRight.setClosedLoopControl(false);
    	}
    }
}

