package org.usfirst.frc.team5253.robot.subsystems;

import org.usfirst.frc.team5253.robot.RobotMap;
import org.usfirst.frc.team5253.robot.commands.StopShooting;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon shooterMotorTopLeft = new CANTalon(RobotMap.SHOOTER_MOTOR_TOP_LEFT);
	CANTalon shooterMotorTopRight = new CANTalon(RobotMap.SHOOTER_MOTOR_TOP_RIGHT);
	CANTalon shooterMotorBottom = new CANTalon(RobotMap.SHOOTER_MOTOR_BOTTOM);
	
	public Shooter() {
		
		shooterMotorTopLeft.changeControlMode(CANTalon.TalonControlMode.Speed);
		shooterMotorTopLeft.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		shooterMotorTopLeft.configNominalOutputVoltage(+0.0f, -0.0f);
		shooterMotorTopLeft.configPeakOutputVoltage(0.0f,-12.0f);
		shooterMotorTopLeft.reverseSensor(false);
		shooterMotorTopLeft.reverseOutput(true);
		shooterMotorTopLeft.setF(0);
		shooterMotorTopLeft.setPID(0.0, 0.0, 0.0);
		
		shooterMotorTopRight.changeControlMode(CANTalon.TalonControlMode.Follower);
		shooterMotorTopRight.set(RobotMap.SHOOTER_MOTOR_TOP_LEFT);
		shooterMotorTopRight.reverseOutput(true);
		
		shooterMotorBottom.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		shooterMotorBottom.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		shooterMotorBottom.configNominalOutputVoltage(+0.0f, -0.0f);
		shooterMotorBottom.configPeakOutputVoltage(0.0f,-12.0f);
		shooterMotorBottom.reverseSensor(false);
		shooterMotorBottom.reverseOutput(true);
		shooterMotorBottom.setF(0.025);
		shooterMotorBottom.setPID(0.0, 0.0, 0.0);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new StopShooting());
    }
    
    public void spinUp(int RPM) {
    	
    	shooterMotorTopLeft.changeControlMode(CANTalon.TalonControlMode.Speed);
		shooterMotorTopLeft.configPeakOutputVoltage(0.0f,-12.0f);
    	shooterMotorTopLeft.set(RPM);
    	
    	shooterMotorBottom.set(0.0);
    }
    
    public void startShooting(int RPM) {
    	
    	shooterMotorTopLeft.changeControlMode(CANTalon.TalonControlMode.Speed);
		shooterMotorTopLeft.configPeakOutputVoltage(0.0f,-12.0f);
    	shooterMotorTopLeft.set(RPM);
    	System.out.println(shooterMotorTopLeft.getSpeed());
    	
//    	shooterMotorBottom.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
//    	shooterMotorBottom.configPeakOutputVoltage(0.0f, -12.0f);
//    	shooterMotorBottom.set(-0.75);
    }
    
    public void stopShooting() {
    	shooterMotorTopLeft.set(0.0);
    	
    	shooterMotorBottom.set(0.0);
    }
}

