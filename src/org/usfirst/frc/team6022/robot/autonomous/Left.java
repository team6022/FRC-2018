package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Left extends Command {
	
	private double Speed;
	private double Time;
	
    public Left(double inputSpeed, double inputTime) {
    	requires(Robot.Driver);
		Speed = inputSpeed;	
		Time = inputTime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Driver.Lefty(Speed);
    	setTimeout(Time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Driver.Lefty(Speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
