package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6022.robot.commands.Port3MotorOn;
import org.usfirst.frc.team6022.robot.commands.Port4MotorOn;

public class Right extends CommandGroup
{
public void RunThat()
{
	addParallel(new Port3MotorOn());
	addParallel(new Port4MotorOn());
}
}