package org.usfirst.frc.team5254.robot.subsystems;
import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;

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
		climberMotor.configNominalOutputVoltage(+0.0f, -0.0f);
		climberMotor.configPeakOutputVoltage(0.0f, 12.0f);
		climberMotor.reverseSensor(false); //TODO check
		climberMotor.reverseOutput(false); // TODO check this and other one
		
		climberMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
		climberMotor2.set(RobotMap.CLIMBER_MOTOR);
		climberMotor2.reverseOutput(true);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
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
    
}
