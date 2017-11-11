package org.usfirst.frc.team5254.robot;

import org.usfirst.frc.team5254.robot.commands.ClimberGo;
import org.usfirst.frc.team5254.robot.commands.ClimberGoSlow;
import org.usfirst.frc.team5254.robot.commands.ClimberStop;
import org.usfirst.frc.team5254.robot.commands.DrivetrainDriveWithJoystick;
import org.usfirst.frc.team5254.robot.commands.DrivetrainShiftDown;
import org.usfirst.frc.team5254.robot.commands.DrivetrainShiftUp;
import org.usfirst.frc.team5254.robot.commands.DrivetrainSlowTurn;
import org.usfirst.frc.team5254.robot.commands.GearMechArmDown;
import org.usfirst.frc.team5254.robot.commands.GearMechArmOff;
import org.usfirst.frc.team5254.robot.commands.GearMechArmUp;
import org.usfirst.frc.team5254.robot.commands.GearMechOff;
import org.usfirst.frc.team5254.robot.commands.GearMechOn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	// Defining the controllers for the driver and operator (Xbox controllers)
	public Joystick driver = new Joystick(RobotMap.DRIVER_JOYSTICK);
	public XboxController operator = new XboxController(RobotMap.OPERATOR_JOYSTICK);

	// Defining driver buttons
	Button DriverButtonA = new JoystickButton(driver, 1);
	Button DriverButtonB = new JoystickButton(driver, 2);
	Button DriverButtonX = new JoystickButton(driver, 3);
	Button DriverButtonY = new JoystickButton(driver, 4);
	Button DriverButtonBumperLeft = new JoystickButton(driver, 5);
	Button DriverButtonBumperRight = new JoystickButton(driver, 6);
	Button DriverButtonBack = new JoystickButton(driver, 7);
	Button DriverButtonStart = new JoystickButton(driver, 8);
	Button DriverButtonLeftJoystickPress = new JoystickButton(driver, 9);
	Button DriverButtonRightJoystickPress = new JoystickButton(driver, 10);

	// Defining operator buttons
	Button OperatorButtonA = new JoystickButton(operator, 1);
	Button OperatorButtonB = new JoystickButton(operator, 2);
	Button OperatorButtonX = new JoystickButton(operator, 3);
	Button OperatorButtonY = new JoystickButton(operator, 4);
	Button OperatorButtonBumperLeft = new JoystickButton(operator, 5);
	Button OperatorButtonBumperRight = new JoystickButton(operator, 6);
	Button OperatorButtonBack = new JoystickButton(operator, 7);
	Button OperatorButtonStart = new JoystickButton(operator, 8);
	Button OperatorButtonLeftJoystickPress = new JoystickButton(operator, 9);
	Button OperatorButtonRightJoystickPress = new JoystickButton(operator, 10);

	public OI() {

		// Set driver buttons to activate commands
		DriverButtonA.whenPressed(new ClimberGoSlow(0.25));
		DriverButtonB.whenPressed(new ClimberStop());
		DriverButtonX.whenPressed(new ClimberGo(true));
		DriverButtonStart.whenPressed(new ClimberGoSlow(0.25)); // This number should be a positive
		DriverButtonBack.whenPressed(new ClimberGo(true));
		DriverButtonBumperRight.whenPressed(new DrivetrainShiftUp());
		DriverButtonBumperRight.whenReleased(new DrivetrainShiftDown());
		DriverButtonBumperLeft.whenPressed(new DrivetrainSlowTurn());
		DriverButtonBumperLeft.whenReleased(new DrivetrainDriveWithJoystick());

		// Set operator buttons to activate commands
		OperatorButtonA.whenPressed(new GearMechOn(true));
		OperatorButtonB.whenPressed(new GearMechArmOff());
		OperatorButtonB.whenPressed(new GearMechOff());
		OperatorButtonX.whenPressed(new GearMechArmDown());
		OperatorButtonY.whenPressed(new GearMechArmUp());
		OperatorButtonBumperRight.whenPressed(new GearMechOn(false));
		OperatorButtonBumperLeft.whenPressed(new GearMechOn(false));
	}

}