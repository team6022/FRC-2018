package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.NaturalDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TankDrive extends Subsystem {
	
	static VictorSP SP1 = new VictorSP(0);
	static VictorSP SP2 = new VictorSP(1);
	static VictorSP SP3 = new VictorSP(2);
	static VictorSP SP4 = new VictorSP(3);
	static VictorSP Testing = new VictorSP(4);

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
		if (Branjoy.getY() >= .15 || Branjoy.getY() <= -.15)
		{
			
			SP1.set(Branjoy.getY()*0.85);
			SP2.set(Branjoy.getY()*0.85);
			SP3.set(-Branjoy.getY()*0.85);
			SP4.set(-Branjoy.getY()*0.85);
		}
		
		else
		{
			SP1.set(Branjoy.getX()*0.75);
			SP2.set(Branjoy.getX()*0.75);
			SP3.set(Branjoy.getX()*0.75);
			SP4.set(Branjoy.getX()*0.75);
		}
	}
	
	public void Lefty(double speed)
	{
		SP1.set(.5);
		SP2.set(.5);
		SP3.set(.5);
		SP4.set(.5);
	}
	
	public void Righty(double speed)
	{
		SP1.set(-.5);
		SP2.set(-.5);
		SP3.set(-.5);
		SP4.set(-.5);
	}
	
	public void TestMotor()
	{
		Testing.set(0.0);
	}
}


