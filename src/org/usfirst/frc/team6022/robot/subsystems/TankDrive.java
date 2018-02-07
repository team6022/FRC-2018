package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.NaturalDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TankDrive extends Subsystem {
	
	static Spark SP1 = new Spark(0);
	static Spark SP2 = new Spark(1);
	static Spark SP3 = new Spark(2);
	static Spark SP4 = new Spark(3);
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
	
	public void Righty(double speed)
	{
		SP1.set(speed);
		SP2.set(speed);
		SP3.set(speed);
		SP4.set(speed);
	}
	
	public void Lefty(double speed)
	{
		SP1.set(-speed);
		SP2.set(-speed);
		SP3.set(-speed);
		SP4.set(-speed);
	}
	
	public void Straighty(double speed)
	{
		SP1.set(0.55);
		SP2.set(0.55);
		SP3.set(-speed);
		SP4.set(-speed);
//		System.out.println("Straighty Is Working");
	}
	
	public void Backy(double speed)
	{
		SP1.set(speed);
		SP2.set(speed);
		SP3.set(speed);
		SP4.set(speed);
	}
	public void TestMotor()
	{
		SP1.set(0);
		SP2.set(0);
		SP3.set(0);
		SP4.set(0);
	}
}


