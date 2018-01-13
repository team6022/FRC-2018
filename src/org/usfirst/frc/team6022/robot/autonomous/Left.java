package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6022.robot.commands.Port1MotorOn;
import org.usfirst.frc.team6022.robot.commands.Port2MotorOn;

public class Left extends CommandGroup
{
	public void RunIt()
	{
	addParallel(new Port1MotorOn());
	addParallel(new Port2MotorOn());
	}
}