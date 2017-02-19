
package org.usfirst.frc.team5253.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5253.robot.autocommands.CrossBaseLineAuto;
import org.usfirst.frc.team5253.robot.autocommands.GearAndTenBallAuto;
import org.usfirst.frc.team5253.robot.autocommands.GearBaseLineAuto;
import org.usfirst.frc.team5253.robot.autocommands.GearCenterAuto;
import org.usfirst.frc.team5253.robot.autocommands.GearTenBallAndCrossAuto;
import org.usfirst.frc.team5253.robot.autocommands.NothingAuto;
import org.usfirst.frc.team5253.robot.autocommands.RightGearAuto;
import org.usfirst.frc.team5253.robot.autocommands.TenBallAuto;
import org.usfirst.frc.team5253.robot.commands.LeftGearAuto;
import org.usfirst.frc.team5253.robot.subsystems.Drivetrain;
import org.usfirst.frc.team5253.robot.subsystems.GearHolder;
import org.usfirst.frc.team5253.robot.subsystems.HypeHat;
import org.usfirst.frc.team5253.robot.subsystems.Shooter;
import org.usfirst.frc.team5253.robot.subsystems.Intake;
import org.usfirst.frc.team5253.robot.subsystems.FuelTank;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	NetworkTable table;
	public static OI oi;
	public static Drivetrain Drivetrain = new Drivetrain();
	public static GearHolder GearHolder = new GearHolder();
	public static HypeHat HypeHat = new HypeHat();
	public static Shooter Shooter = new Shooter();
	public static Intake Intake = new Intake();
	public static FuelTank FuelTank= new FuelTank();
	
	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		
		chooser.addObject("Nothing", new NothingAuto());
		chooser.addObject("Center Gear", new GearCenterAuto());
		chooser.addObject("Cross Base Line", new CrossBaseLineAuto());
		chooser.addObject("Right Side Gear",new RightGearAuto());
		chooser.addObject("Gear and Baseline", new GearBaseLineAuto());
		chooser.addObject("Ten Ball Auto", new TenBallAuto());
		chooser.addObject("Gear and Ten Ball", new GearAndTenBallAuto());
		chooser.addObject("Gear, Shoot and Cross", new GearTenBallAndCrossAuto());
		chooser.addObject("Left Side Gear",new LeftGearAuto());
		//chooser.addObject();
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
		
		CameraServer.getInstance().startAutomaticCapture(0);
		//CameraServer.getInstance().startAutomaticCapture(1);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector", "Default"); 
		 * switch(autoSelected) { 
		 * case "My Auto": 
		 * autonomousCommand = new MyAutoCommand(); 
		 * break; 
		 * 
		 * case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); 
		 * break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
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
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
