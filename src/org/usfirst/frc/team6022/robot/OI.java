package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


import org.usfirst.frc.team6022.robot.commands.Stop;
import org.usfirst.frc.team6022.robot.commands.NaturalDrive;

public class OI 
{
final Joystick Branjoy = new Joystick(0);

Button DriveyButton = new JoystickButton(Branjoy, 1);
Button OffyButton = new JoystickButton(Branjoy, 2);
Button SweetCaroline = new JoystickButton(Branjoy, 3);
Button CrazyFrog = new JoystickButton(Branjoy, 4);
Button Kill = new JoystickButton(Branjoy, 5);

	public OI() 
	{
		
	}
	
	public Joystick getJoystick()
	{
		return Branjoy;
	}
}
