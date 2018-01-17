package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class KillAll extends Command {

	private double Time;
	public KillAll(double inputTime) {
		requires(Robot.Driver);
		Time = inputTime;

	}

	protected void initialize() {
		Robot.Driver.TestMotor();
		setTimeout(Time);
	}

	protected void execute() {
		Robot.Driver.TestMotor();
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.Driver.TestMotor();
	}

	protected void interrupted(){
	}
}