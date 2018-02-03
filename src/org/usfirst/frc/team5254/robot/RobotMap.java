''
package org.usfirst.frc.team5254.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Solenoids
	public static final int SHIFTING_PISTON = 0;

	// Sensors
	public static final int DRIVE_ENCODER_LEFT1 = 0;
	public static final int DRIVE_ENCODER_RIGHT1 = 2;
	public static final int DRIVE_ENCODER_LEFT2 = 1;
	public static final int DRIVE_ENCODER_RIGHT2 = 3;

	// Joysticks
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	public static final int DRIVER_THROTTLE_AXIS = 1;
	public static final int DRIVER_TURN_AXIS = 4;
	public static final int OPERATIOR_THROTTLE_AXIS = 0;

	// Gyro
	public static final int GYRO = 1;

	// CAN Talons
	

	// Drivetrain
	public static final int WHEEL_DIAMETER = 0;
	public static final int ENCODER_TICKS = 0;
	public static final double GEAR_RATIO = 0.0;
	public static final double Kp = 0.0;
	public static final double  TURN_P = 0.0;
	public static final double  TURN_I = 0.0;
	public static final double  TURN_D = 0.0;
	
	//Climber
	public static final int CLIMBER_MOTOR = 11;
	public static final int CLIMBER_MOTOR2 = 10;
	
	//Gearmech
	public static final int GEAR_MECH_PIVOT = 5;
	public static final int GEAR_MECH_INTAKE = 4;
	public static final int TOP_SET_POINT_ANGLE = 0;
}