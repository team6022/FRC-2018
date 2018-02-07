package org.usfirst.frc.team6022.robot.commands;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class derpymcsherpscrotes extends Command {

	private double Sppedd;
	private double Ties;
	
    public derpymcsherpscrotes(double gottagofast, double fortworth) {
        requires(Robot.Lift);
        Sppedd = gottagofast;
        Ties = fortworth;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Lift.addchild(Sppedd);
    	setTimeout(Ties);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Lift.addchild(Sppedd);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Lift.addchildren();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
