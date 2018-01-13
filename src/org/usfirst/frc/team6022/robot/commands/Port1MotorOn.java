package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6022.robot.Robot;


public class Port1MotorOn extends Command {
	
	public Port1MotorOn() 
	{
		requires(Robot.Driver);
	}

	protected void initialize() 
	{
	}

	protected void execute() 
	{
	Robot.Driver.OffyDrive(Robot.oi.getJoystick());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}
