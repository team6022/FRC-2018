package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6022.robot.commands.ElevateCommand;
import org.usfirst.frc.team6022.robot.commands.Stop;
import org.usfirst.frc.team6022.robot.commands.NaturalDrive;
import org.usfirst.frc.team6022.robot.commands.TestCommand;

public class OI 
{
final Joystick Branjoy = new Joystick(0);
Button Test = new JoystickButton(Branjoy,1);
Button Elevate = new JoystickButton(Branjoy,2);

	public OI() 
	{
		Test.whenPressed(new TestCommand());
		Elevate.whenPressed(new ElevateCommand());
	}
	
	public Joystick getJoystick()
	{
		return Branjoy;
	}
}
