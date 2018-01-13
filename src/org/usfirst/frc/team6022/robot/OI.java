package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


import org.usfirst.frc.team6022.robot.commands.Port2MotorOn;
import org.usfirst.frc.team6022.robot.commands.Port3MotorOn;
import org.usfirst.frc.team6022.robot.commands.Port4MotorOn;
import org.usfirst.frc.team6022.robot.commands.Stop;
import org.usfirst.frc.team6022.robot.commands.Port1MotorOn;
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
	 DriveyButton.whenPressed(new Port2MotorOn());
	 OffyButton.whenPressed(new Port1MotorOn());
	 SweetCaroline.whenPressed(new Port3MotorOn());
	 CrazyFrog.whenPressed(new Port4MotorOn());
	 Kill.whenPressed(new Stop());
	 }
	
	public Joystick getJoystick()
	{
		return Branjoy;
	}
}
