package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class KillAll extends Command {

	private double Time;
	public KillAll(double inputTime) {
		requires(Robot.TankDrive);
		Time = inputTime;

	}

	protected void initialize() {
		Robot.TankDrive.TestMotor();
		setTimeout(Time);
	}

	protected void execute() {
		Robot.TankDrive.TestMotor();
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.TankDrive.TestMotor();
	}

	protected void interrupted(){
	}
}