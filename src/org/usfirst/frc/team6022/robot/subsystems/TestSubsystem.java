package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestSubsystem extends Subsystem {
	
	DigitalInput switch1 = new DigitalInput(0);
	static VictorSP TestingMotor = new VictorSP(5); 

public TestSubsystem()
	{
		super();
	}


    public void initDefaultCommand() {
    }
    
	public void StartTest(Joystick Branjoy) {
		if (switch1.get()) {
			TestingMotor.set(0.3);
		} else {
			TestingMotor.set(-0.3);
		}
	}
	
	public void stopMotor(Joystick Branjoy) {
		TestingMotor.set(0);
	}
}


