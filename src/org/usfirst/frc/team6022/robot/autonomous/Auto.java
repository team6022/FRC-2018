package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6022.robot.autonomous.Left;
import org.usfirst.frc.team6022.robot.autonomous.Right;

public class Auto extends CommandGroup {

	String gameData;
	
	public Auto()
	{
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'L')
		{
			addSequential(new Left(0.5, 1));
		} 
		else 
		{
			addSequential(new Right(0.5,1));
		}
	}
}
