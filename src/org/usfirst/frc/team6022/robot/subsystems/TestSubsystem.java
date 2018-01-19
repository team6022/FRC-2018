package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestSubsystem extends Subsystem {
	
	static VictorSP TestingMotor = new VictorSP(5); 

public TestSubsystem()
	{
		super();
	}




    public void initDefaultCommand() 
    {
    }
    
	public void StartTest(Joystick Branjoy)
	{
		TestingMotor.set(0.2);
	}
}

