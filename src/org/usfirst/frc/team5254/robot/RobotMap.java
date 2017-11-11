
package org.usfirst.frc.team5254.robot;

public class RobotMap {

	// Solenoids
	public static final int SHIFTING_PISTON = 0;

	// Sensors
	public static final int DRIVE_ENCODER_LEFT1 = 0;
	public static final int DRIVE_ENCODER_RIGHT1 = 2;
	public static final int DRIVE_ENCODER_LEFT2 = 1;
	public static final int DRIVE_ENCODER_RIGHT2 = 3;
	public static final int TOP_ARM_LIMIT_SWITCH = 4;
	public static final int BOTTOM_ARM_LIMIT_SWITCH = 5;

	// Joysticks
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	public static final int DRIVER_THROTTLE_AXIS = 1;
	public static final int DRIVER_TURN_AXIS = 4;
	public static final int OPERATIOR_THROTTLE_AXIS = 0;

	// Gyro
	public static final int GYRO = 1;

	// CAN Talons
	public static final int CLIMBER_MOTOR = 11;
	public static final int CLIMBER_MOTOR2 = 10;

	// Sparks
	public static final int GEAR_MECH_ARM = 5;
	public static final int GEAR_MECH_INTAKE = 4;

	// Drivetrain
	public static final double WHEEL_DIAMETER = 3.25;
	public static final int ENCODER_TICKS = 256;
	public static final double GEAR_RATIO = (100.0 / 31.0) * (100.0 / 96.0);
	public static final double Kp = 0.2;
	public static final double TURN_P = 0.2;
	public static final double TURN_I = 0.02;
	public static final double TURN_D = 0.4;
	public static final int ACCELERATION_FACTOR = 10; // Make this # smaller if you want the robot to drive faster in
														// the end of its driving

	// Gearmech
	public static final int TOP_SET_POINT_ANGLE = 0;
}