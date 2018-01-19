package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.*;//"IterativeRobot";

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


import org.usfirst.frc.team6022.robot.autonomous.Auto;
import org.usfirst.frc.team6022.robot.commands.NaturalDrive;
import org.usfirst.frc.team6022.robot.subsystems.TankDrive;
import org.usfirst.frc.team6022.robot.subsystems.TestSubsystem;
import org.usfirst.frc.team6022.robot.subsystems.Lift;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

import org.opencv.imgproc.Imgproc;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;

import org.opencv.core.Core;
import org.opencv.core.CvType;
//import org.opencv.core.CvSink;
import org.opencv.core.Mat;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static TankDrive TankDrive;
	public static TestSubsystem TestSubsystem;
	public static Lift Lift;


	Command autonomousCommand;
	SendableChooser chooser;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */

	public void robotInit() {

		CameraServer.getInstance().startAutomaticCapture();
		// CameraServer.getInstance().startAutomaticCapture();

		
		
		
		
		
		// Matt did this		
//		new Thread(() -> {
//			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
//			camera.setResolution(640, 480);
//			
//			/*CvSink*/edu.wpi.cscore.CvSink cvSink = CameraServer.getInstance().getVideo();
//			CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640, 480);
//			
//			Mat source = new Mat();
//			Mat output = new Mat();
//			
//			while(!Thread.interrupted()) {
//				cvSink.grabFrame(source);
//				Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
//				outputStream.putFrame(output);
//			}
//			
//		}).start();
		// End Matt
		
		// Initialize subsystems
		// Initialize oi last to make work
		TankDrive = new TankDrive();
		TestSubsystem = new TestSubsystem();
		Lift = new Lift();
		oi = new OI();
		//Keep OI at the bottom

		chooser = new SendableChooser();
		chooser.addDefault("Default Auto", new NaturalDrive());
		chooser.addObject("My Auto", new Auto());
		SmartDashboard.putData("Auto mode", chooser);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	public void autonomousInit() {
		autonomousCommand = (Command) chooser.getSelected();

		autonomousCommand.start();

		autonomousCommand = new Auto();

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}

	public void operatorControl() {

		while (isOperatorControl() && isEnabled()) 
		{

			Timer.delay(0.005);
		}
	}
}
