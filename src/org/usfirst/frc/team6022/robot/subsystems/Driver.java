
package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Driver extends Subsystem 
{
	
static VictorSP Vector = new VictorSP(0);
static VictorSP whenwillyoulearn = new VictorSP(1);
static VictorSP Oranges = new VictorSP(2);
static VictorSP skrrt = new VictorSP(3);

public Driver()
{
		super();
}
	
	public void initDefaultCommand() 
	{

	}
	
	public void StickyDrive(Joystick Branjoy)
	{
		whenwillyoulearn.set(0.0);
	}
	public void OffyDrive(Joystick Branjoy)
	{
		Vector.set(0.0);
	}
	public void BoT(Joystick Branjoy)
	{
		Oranges.set(0.0);
	}
	public void Vegetables(Joystick Branjoy)
	{
		skrrt.set(0.5);
	}
	public void AllOff(Joystick Branjoy)
	{
		whenwillyoulearn.set(0);
		Vector.set(0);
		Oranges.set(0);
		skrrt.set(0);
	}
}
