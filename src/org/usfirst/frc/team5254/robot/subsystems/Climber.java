package org.usfirst.frc.team5254.robot.subsystems;
import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;
<<<<<<< HEAD
import org.usfirst.frc.team5254.robot.commands.ClimberStopClimbing;
=======
>>>>>>> refs/remotes/origin/Untested-Code

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

/**
 *
 */
public class Climber extends Subsystem {
	
	private CANTalon climberMotor = new CANTalon (RobotMap.CLIMBER_MOTOR);
	private CANTalon climberMotor2 = new CANTalon (RobotMap.CLIMBER_MOTOR2);
	
	public Climber () {
		
		climberMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		climberMotor.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
<<<<<<< HEAD
		climberMotor.configNominalOutputVoltage(+0.0f,-0.0f);
		climberMotor.configPeakOutputVoltage(+12.0f,-0.0f);
		climberMotor.reverseSensor(false);
		climberMotor.reverseOutput(true);
		
		climberMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
		climberMotor2.set(RobotMap.CLIMBER_MOTOR);
		climberMotor2.reverseOutput(false);
=======
		climberMotor.configNominalOutputVoltage(+0.0f, -0.0f);
		climberMotor.configPeakOutputVoltage(0.0f, 12.0f);
		climberMotor.reverseSensor(false); //TODO check
		climberMotor.reverseOutput(false); // TODO check this and other one
		
		climberMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
		climberMotor2.set(RobotMap.CLIMBER_MOTOR);
		climberMotor2.reverseOutput(true);
>>>>>>> refs/remotes/origin/Untested-Code
	}
	@Override
    public void initDefaultCommand() {
        setDefaultCommand(new ClimberStopClimbing());
    }
    
<<<<<<< HEAD
	public void on (double percent) {
		climberMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		climberMotor.configPeakOutputVoltage(+12.0f,-0.0f);
		climberMotor.set(percent);
		
		
	}
	public void off() {
		climberMotor.set(0);
	}
=======
    public void on(boolean go) {
    	
    	if (go == true) {
    		Robot.Climber.climberMotor.set(1.0);
    	} else {
    		Robot.Climber.climberMotor.set(-1.0);
    	}
    }
    
    public void off() {
    	Robot.Climber.climberMotor.set(0);
    }
    
>>>>>>> refs/remotes/origin/Untested-Code
}
