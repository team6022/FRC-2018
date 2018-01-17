package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


import org.usfirst.frc.team6022.robot.commands.Stop;
import org.usfirst.frc.team6022.robot.commands.NaturalDrive;
import org.usfirst.frc.team6022.robot.commands.TestCommand;

public class OI 
{
final Joystick Branjoy = new Joystick(0);
Button Test = new JoystickButton(Branjoy,1);

	public OI() 
	{
		Test.cancelWhenPressed(new TestCommand());
	}
	
	public Joystick getJoystick()
	{
		return Branjoy;
	}
}
