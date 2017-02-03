package org.usfirst.frc.team5253.robot.subsystems;

import org.usfirst.frc.team5253.robot.RobotMap;
import org.usfirst.frc.team5253.robot.commands.DriveWithJoystick;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;

public class Drivetrain extends Subsystem{
	
	static ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	public static RobotDrive myRobot = new RobotDrive(2, 3, 0, 1);
	static Solenoid shiftingPiston = new Solenoid(RobotMap.SHIFTING_PISTON);
	public static Encoder encoder = new Encoder(2, 3, false, Encoder.EncodingType.k4X);
	
	private double angle;
	public double DKp = 0.07;
	public double TKp = 0.3;
	private static double finalModifier;
	private static double distance;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveWithJoystick());
	}
	
	public void drive(double Throttle, double Turn){
		myRobot.arcadeDrive(Throttle, Turn);
		
	}
	
	public static void shiftUp() {
		shiftingPiston.set(true);
	}
	
	public static void shiftDown() {
		shiftingPiston.set(false);
	}
	
	public void resetGyro() {
		gyro.reset();
	}
	
	public double getAngle() {
		return gyro.getAngle();
	}
	
	public void initEncoder() {
		encoder.reset();
		encoder.setMaxPeriod(0.1);
		encoder.setMinRate(1);
		encoder.setDistancePerPulse(1);
		encoder.setReverseDirection(true);
		encoder.setSamplesToAverage(7);
	}
	
	public void autoDrive(double Throttle, double Turn, double distance) {
		
		double wheelDiameter = RobotMap.WHEEL_DIAMETER;
		double gearRatio = RobotMap.GEAR_RATIO;
		final double pi = 3.1415926535;
		double encoderTicks = 256;
		finalModifier = (distance/(wheelDiameter * pi))  * encoderTicks * gearRatio ;
		this.distance = distance;
		if (encoder.get() <= finalModifier) {
			myRobot.drive(Throttle, Turn);
		}
	}
	
	public void autoTurn(double turnSpeed, double angle) {
		if (gyro.getAngle() >= angle) {
			myRobot.drive(0.0, turnSpeed);
		} else if (gyro.getAngle() <= angle +5) {
			myRobot.drive(0.0, -turnSpeed);
		}
		
	}
	
	public boolean driveAutoIsFinished() {
		return Math.abs(encoder.get()) >= finalModifier;
	}
	
	public boolean turnAutoIsFinished() {
		return (gyro.getAngle() >= angle);
	}

	public void stop() {
		myRobot.arcadeDrive(0.0, 0.0);
		
	}
}