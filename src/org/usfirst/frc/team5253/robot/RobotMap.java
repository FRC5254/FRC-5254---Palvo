package org.usfirst.frc.team5253.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Solenoids
	public static final int SHIFTING_PISTON = 5;
	public static final int GEAR_HOLDER_PISTON_EXTEND = 2;
	public static final int GEAR_HOLDER_PISTON_RETRACT = 3;

	// Sensors
	public static final int DRIVE_ENCODER_LEFT1 = 0;
	public static final int DRIVE_ENCODER_RIGHT1 = 2;
	public static final int DRIVE_ENCODER_LEFT2 = 1;
	public static final int DRIVE_ENCODER_RIGHT2 = 3;


	// Joysticks
	public static final int DRIVER_JOYSTICK= 0;
	public static final int OPERATOR_JOYSTICK = 1;
	public static final int DRIVER_THROTTLE_AXIS = 1;
	public static final int DRIVER_TURN_AXIS = 4;
		
	// Gyro
	public static final int GYRO = 1;
		
	// PDP
	public static final int DRIVE_MOTOR_LEFT1 = 0;
	public static final int DRIVE_MOTOR_LEFT2 = 1;
	public static final int DRIVE_MOTOR_RIGHT1 = 2;//14
	public static final int DRIVE_MOTOR_RIGHT2 = 3;//15

	//CAN Talons
	public static final int SHOOTER_MOTOR_TOP_LEFT = 1;
	public static final int SHOOTER_MOTOR_TOP_RIGHT = 2;
	public static final int INDEXER_MOTOR = 3;
	public static final int SHOOTER_MOTOR_BOTTOM = 4; 
	public static final int INTAKE_MOTOR =  5;	
	//RPMs
	public static final double SHOOTER_RPM = 4300;
	
	//Misc
	public static final int WHEEL_DIAMETER = 4;
	public static final int GEAR_RATIO = 9;
}
