
package org.usfirst.frc.team5254.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5254.robot.autos.*;
import org.usfirst.frc.team5254.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * ,:,,,,,,,,,,,,,,,:,;;:,,,,,,,,,;,,,,,,,,,:,,;:::;''';;;;;;;;;;;;;;;;;;;;;;;;;;;;''''''''''''';
,;,,,,,,,,,,,,,,,,::,:::,,,,:,,:,,,,,,,,,:,,::::;''';;;;;;;;;;;;;;;;;;;;;;;;;;;;'''''''''''';;
,;,,,,,,,,,,,,,,,,,,,:;;,,,:,,,:,,,,,,,IN THEORY;'''';;;;;;;;;;;;;;;;;;;;;;;;;;'''''''''''''';
,;,,,,,,,,,,,,:,,,,,,::;:,:,,,,:,,,,,,,THE CODE'+++++';;;;;;;;;;;;;;;;;;;;;;;;;;;;''''''''''';
,;,,,,,,,,,,,,,::,,,,,,,,:,,,,,:,,,,,WILL WORK NOW #####+;;;;;;;;;;;;;;;;;;;;;;;;;''''''''''';
,',,,,,,,,,,,,,,,:,,,,,,,,,,,,,:,,,,,,:++#################+'';;;;;;;;;;;;;;;;;;;;;''''''''''';
,;,,,,,,,,,,,,,,,,::,,,,,,,,,,,,,,,,,#+++###################+';;;;;;;;;;;;;;';'';'''''''''''';
,',,,,,,,,,,,,,,,,,,:,,,,,,,,,:,,,,'++++######################';;;;;;;;;''';';''''''''''''''';
,',,,,,,,,,,,,,,,,,,,:,,,,,,,,;,,,''+++++######################';;';;;;;;;;;;;;''''''''''''';;
,;,,,,,,,,,,,,,,,,,,,,::,,,,,,;,,:+#+++++######################+';;;;;;;;;;;;;;;''''''''''''';
,;,,,,,,,,,,,,,,,,,,,,,,:,,,,,',,++++++#########################+;;;;;;;;;;;;;;;;;;'''''''''';
,;,,,,,,,,,,,,,,,,,,,,,,,:,,,,;,'##++++##########################';;;;;;;;;;;;;;;;;'''''''''';
,:,,,,,,,,,,,,,,,,,,,,,,,,::,,;;###+++++##########################';;;;;''';';''''''''''''''''
,:,,,,,,,,,,,,,,,,,,,,,,,,,::,:#+++++++############################;'';'''';;''''';'''''''''''
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,,;+###+++#############################';';;;';'''''''''''''''''''
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,,'####++###############################;;;;;';;;;''''''''''''''''
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,,+##++++###############################';;';;;;''''''''''''''''''
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,:######################################';;;'';;''''''''''''''''';
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,'#++###################################+;;;'';;''''''''''''''''';
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,'#+#####################################;;;;;;'''''''''''''''''';
,,:,,,,,,,,,,,,,,,,,,,,,,,,,,'#;+###########+#######################+;';;;;'''''''''''''''''''
:,:,,,,,,,,,,,,,,,,,,,,,,,,,:;+::+########++++++++++################+;;;;;;'''''''''''''''''''
:;:,,,,,,,,,,,,,,,,,,,,,,,,:''+:,:+###+++++++++''''+#################;;'';;;';''''''''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,,'',,,:''''''''''''''''++################;;;';;;''''''''''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,:;::,:,:;;'''''''''''''++################';';;''''''''''''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,:;:::::::;;;;'''''''''''+################'';;;;;'''''';;''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,::;';;;;;;;;''''''''''''+################;''';;;''''''''''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,,:+++'';;;''''++++++'''''################'''''''''''''''''''''''';
,,';:,,,,,,,,,,,,,,,,,,,,,,,,,;'+##'''''+#####++++'''+++############+;';''''''''''''''''''''';
,,';:;,,,,,,,,,,,,,,,,,,,,,;;;;'++++'''+++++++'++++'''+++########+##+;''''''''''''''''''''''';
,,';:;,,,,,,,,,,,,,,,,,,,,,;;:;#+##+':'++++##++++'''''''+######+'''#';;'''''''''''''''''''''';
,,';,,,,,,,,,,,,,,,,,,,,,,,,;,:;''+';:''++++####+++'''''+####++''++#;';''''';'''''''''''''''';
,,',,,,,,,,,,,,,,,,,,,,,,,,,;,::;'''::''+'++++++++++''''+###+++''+++;';';';'''''''''''''''''';
,,',,,,,,,,,,,,,,,,,,,,,,,,,;,:::;;;,;''''+++''''''''''''###++'''+'';;''''''''''''''''''''''''
,,;,,,,,,,,,,,,,,,,,,,,,,,,,;,::::::,''''''''''''''''''''++''+++''''''''''''''''''''''''''''''
,,;:,,,,,,,,,,,,,,,,,,,,,,,,;,:::::,:''''''''''''''''''''''''+++''+'''''''''''''''''''''''''''
,,::,,,,,,,,,,,,,,,,,,,,,,,,;,;:::;:;'''+'''''''''''''''';'''+++''#';;''''''''''''''''''''''''
,,:;,,,,,,,,,,,,,,,,,,,,,,,,;,;::;;;'''+++''''''''''''''''''''''''#'';';;;;'''''''''''''''''''
,',;,,,,,,,,,,,,,,,,,,,,,,,,;,::;;;++++'++''''''''''''''''''+''''##''';;'';'';''''''''''''''''
':,;,,,,,,,,,,,,,,,,,,,,,,,,;,:;:;:'+++++';'''''++''''''''''''';#+#';;;'''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,:;;:::''+++'''''''++''''''''''''''+#';';''''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,:;::'''''''';''''''+'''''''''''''+++'';;;;''''''''''''''''''''''
,,,',,,,,,,,,,,,,,,,,,,,,,,,',:;:'+#++'''''''''''+''''''''';''''++';''''''''''''''''''''''''''
,,,',,,,,,,,,,,,,,,,,,,,,,,,',,;:+###++'''''''''''''''''''';'''''+;';;;;;'''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,,;'+#####+''+''''''''''''''''''''''';;''''''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,,;':+#+##+#+++''''''''''''''''''''''';;'''''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,,:';;:;;;+++++++''+''''''''''''''''''#'';'''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,,;,,,''''''++++++++'''''''''+''''''''''''#'''''''''''''''''''''''''
,,,;,,,,,,,,,,,,,,,,,,,,,,,::,::''+++++++++++++++'''+++++'''''''''''+#''''''''''''''''''''''''
,,,;:,,,,,,,,,,,,,,,,,,,,,,,::,::;;++##+++++++++++++++++++'''''''''''##+;;''''''''''''''''''''
,,,::,,,,,,,,,,,,,,,,,,,,,,,::,,:;;''++++'''''++++++++++++''''''''''+###+';'''''''''''''''''''
,,,::,,,,,,,,,,,,,,,,,,,,,,,:;:,+';;'''''''''+++++++++++++''''''''''+####+;'''''''''''''''''''
,,,::,,,,,,,,,,,,,,,,,::,,,::;,+++;'''+++++++++++++++++++++''++'''+#######''''''''''''''''''''
,,,:;,,,,,,:,,,,,,,,,,,:,,,::''++#++++++++++++++++++++++++++++'''##########'''''''''''''''''''
,,,:;,,,,,,,,,,,,,,,,:::::,::+++####+++++++++###+++++++++++++''+###########+''''''''''''''''''
,,,:;,,,,,,,,,,,,,,,,:::::,:;########+++##########++++++++++'+##############''''''''''''''''''
,,,:;,,,,,,:,,,,,,,,,:::,::;+##########+++########++++++++++#################'''''''''''''''''
,,,:;,,,,,,:,,,,,,,,,,::::;'############++#######+++++++++###################+''''''''''''''''
,,,:;,,,::::,,,,,,,,,,:::;:##+##########++++####++++++++######################''''''''''''''''
,,,:;:,,:::::::::,,:,:::;:+##############+++####++++++#########################'''''''''''''''
::::;:,,,::::,:::,,::::;:;####################+++++#############################''''''''''''''
::::;::::,:::::::,,::::::+#######################################################'''''''''''''
:::::;::::::::::,::,::,:##########################################################''''''''''''
 *Robot code Ft. K20 
 */
public class Robot extends IterativeRobot {
	
	static Timer timer = new Timer();

	NetworkTable table;
	public static OI oi;
	public static Drivetrain Drivetrain = new Drivetrain();
	public static Climber Climber = new Climber();
	public static GearMech GearMech = new GearMech();
	
	public static PowerDistributionPanel pdp = new PowerDistributionPanel();

	// Auto modes
	private final String NothingAuto = "Nothing";
	private final String TestAuto = "Test Auto";
	private final String CrossBaseline = "Cross Baseline";
	private final String CenterGear = "Center Gear";
	private final String FeederSideGear = "Feeder Side Gear";
	private final String BoilerSideGear = "Boiler Side Gear";

	private final String[] AutoModes = {

			NothingAuto, TestAuto, CrossBaseline, CenterGear, FeederSideGear, BoilerSideGear

	};

	Command autonomousCommand;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();

		// Send auto modes
		NetworkTable table = NetworkTable.getTable("SmartDashboard");
		table.putStringArray("Auto List", AutoModes);

//		 Initialize cameras TODO get rio USB ports to work
		CameraServer.getInstance().startAutomaticCapture(1);
		CameraServer.getInstance().startAutomaticCapture(0);

	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		
	}
	public static void stopTimer(){
		System.out.println(timer.get());
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
		String autoSelected = SmartDashboard.getString("Auto Selector", NothingAuto);
		
		timer.reset();
		timer.start();
		
		System.out.format("Auto: %s '%s'%n", m_ds.getAlliance(), autoSelected);
		
		switch (autoSelected) {
		/*
		 * TenBall, GearBaseLine, GearTenBall, GearTenBallAndCross, OP
		 */
		
		case TestAuto:
			autonomousCommand = new TestAuto();
			break;

		default:
			autonomousCommand = new NothingAuto();
			break;
		
		case CrossBaseline:
			autonomousCommand = new CrossBaselineAuto();
			break;
			
		case CenterGear:
			autonomousCommand = new CenterGearAuto();
			break;
			
		case FeederSideGear:
			autonomousCommand = new FeederSideGearAuto();
			break;
			
		case BoilerSideGear:
			autonomousCommand = new BoilerSideAuto();
			break;
		
			
		}

		// schedule the autonomous command (example)
		if (autonomousCommand != null) {
			SmartDashboard.putString("DB/String 0", autoSelected);
			autonomousCommand.start();
		}
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
//
//		System.out.println("Channel 12 Front Left: " + pdp.getCurrent(12));
//		System.out.println("Channel 13 Back Left: " + pdp.getCurrent(13));
//		System.out.println("Channel 14 Front Right: " + pdp.getCurrent(14));
//		System.out.println("Channel 15 Back Right: " + pdp.getCurrent(15));
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}