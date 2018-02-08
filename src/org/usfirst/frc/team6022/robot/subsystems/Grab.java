package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Grab extends Subsystem {

	DoubleSolenoid TestSolenoid = new DoubleSolenoid(0, 1);
	private double X = 0;

	public Grab()
	{
		super();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void Compressy(Joystick Branjoy)
    {
	    if (X == 0)
	    {
	    		TestSolenoid.set(DoubleSolenoid.Value.kReverse);
	    		X++;
	    }
	    else
	    {
	    	TestSolenoid.set(DoubleSolenoid.Value.kForward);
			X--;
	    }
    }
}
