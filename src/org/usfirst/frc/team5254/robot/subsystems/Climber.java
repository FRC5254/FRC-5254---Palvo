package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.ClimberStop;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

public class Climber extends Subsystem {
	
	private CANTalon climberMotor = new CANTalon (RobotMap.CLIMBER_MOTOR);
	private CANTalon climberMotor2 = new CANTalon (RobotMap.CLIMBER_MOTOR2);
	
	public Climber () {
		climberMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		climberMotor.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		climberMotor.configNominalOutputVoltage(+0.0f,-0.0f);
		climberMotor.configPeakOutputVoltage(+12.0f,-0.0f);
		climberMotor.reverseSensor(false);
		climberMotor.reverseOutput(true);
		
		climberMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
		climberMotor2.set(RobotMap.CLIMBER_MOTOR);
		climberMotor2.reverseOutput(false);
	}
	
	@Override
    public void initDefaultCommand() {
        setDefaultCommand(new ClimberStop());
    }
    
	public void on (double percent) {
		climberMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		climberMotor.configPeakOutputVoltage(+12.0f,-0.0f);
		climberMotor.set(percent);
	}

	public void off() {
		climberMotor.set(0);
	}
}
