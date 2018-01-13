package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6022.robot.Robot;


public class Port2MotorOn extends Command {
	
	public Port2MotorOn() 
	{
		requires(Robot.Driver);
	}

	protected void initialize() 
	{
	}

	protected void execute() 
	{
	Robot.Driver.StickyDrive(Robot.oi.getJoystick());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}
