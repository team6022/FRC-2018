package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GoUp extends Command {
private double Speed;
private double Time;
	
    public GoUp(double inputSpeed, double inputTime)
    {
       requires(Robot.Lift);
       Speed = inputSpeed;
       Time = inputTime;  
    }

  
    protected void initialize()
    {
    	Robot.Lift.GoUppy(Speed);
    	setTimeout(Time);
    }

    
    protected void execute()
    {
    	Robot.Lift.GoUppy(Speed);
    }

    
    protected boolean isFinished() 
    {
        return isTimedOut();
    }

    protected void end() 
    {
    	Robot.Lift.NoUppy();
    }

    protected void interrupted() {
    }
}
