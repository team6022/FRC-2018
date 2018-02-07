package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6022.robot.commands.ElevateCommand;
import org.usfirst.frc.team6022.robot.commands.Stop;
import org.usfirst.frc.team6022.robot.commands.NaturalDrive;
import org.usfirst.frc.team6022.robot.commands.CompressCommand;
import org.usfirst.frc.team6022.robot.commands.DeflateCommand;

public class OI 
{
final Joystick Branjoy = new Joystick(0);
Button Deflate = new JoystickButton (Branjoy,2);
Button Elevate = new JoystickButton(Branjoy,1);
Button Compress = new JoystickButton (Branjoy, 3);

	public OI() 
	{
		Deflate.whenPressed(new DeflateCommand());
		Elevate.whenPressed(new ElevateCommand());
		Compress.whenPressed(new CompressCommand());
	}
	
	public Joystick getJoystick()
	{
		return Branjoy;
	}
}
