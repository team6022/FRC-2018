package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6022.robot.autonomous.Right;
import org.usfirst.frc.team6022.robot.autonomous.Left;
import org.usfirst.frc.team6022.robot.autonomous.Straight;
import org.usfirst.frc.team6022.robot.autonomous.Backwards;

public class Auto extends CommandGroup {

	String gameData;
	
	public Auto()
	{
		// gameData = DriverStation.getInstance().getGameSpecificMessage();
		// if(gameData.charAt(0) == 'L')
	//	{
			addSequential(new Straight(0.5, 2));
			//addSequential(new Right(0.5, 0.681));
			addSequential(new KillAll(0.5));
	//	} 
		// else 
	//	{
		// } 
	}
}