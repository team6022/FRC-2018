package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.NaturalDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TankDrive extends Subsystem {
	
	static VictorSP drive = new VictorSP(0);
	static VictorSP drive1 = new VictorSP(1);
	static VictorSP drive2 = new VictorSP(2);
	static VictorSP drive3 = new VictorSP(3);

	public TankDrive() 
	{
		super();
	}

    public void initDefaultCommand() 
    {
    	setDefaultCommand(new NaturalDrive());
    }
  

	public void NaturalDrive(Joystick Branjoy) 
	{

	}
	
}

