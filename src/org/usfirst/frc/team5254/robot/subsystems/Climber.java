package org.usfirst.frc.team5254.robot.subsystems;
import org.usfirst.frc.team5254.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	private CANTalon climberMotor = new CANTalon (RobotMap.CLIMBER_MOTOR);
	private CANTalon climberMotor2 = new CANTalon (RobotMap.CLIMBER_MOTOR2);
	
	public Climber () {
		climberMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}
