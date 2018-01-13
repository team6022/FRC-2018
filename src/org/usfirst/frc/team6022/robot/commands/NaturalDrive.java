package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6022.robot.Robot;


public class NaturalDrive extends Command {
	
	public NaturalDrive() 
	{
		requires(Robot.TankDrive);
	}

	protected void initialize() 
	{
	}

	protected void execute() 
	{
	Robot.TankDrive.NaturalDrive(Robot.oi.getJoystick());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}
