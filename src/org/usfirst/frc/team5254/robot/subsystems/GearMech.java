package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearMech extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Spark gearMechPivot = new Spark(RobotMap.GEAR_MECH_PIVOT);
	private Spark gearMechIntake = new Spark(RobotMap.GEAR_MECH_INTAKE);
	
	static AnalogPotentiometer pot = new AnalogPotentiometer(1,0,3);
	private double potAngle;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	// TODO does anything go here for start up?
    	
    }
    
    public void on(boolean intake) { //TODO does this work?
    	
    	if (intake == true) {
    		gearMechIntake.set(1.0);
    	} else {
    		gearMechIntake.set(-1.0);
    	}
    }
    
    public void off() {
    	gearMechIntake.set(0);
    }
    
    // This is where the gear mech is told to either go up or down
    public void activateMotorPower(boolean up, double setPoint) {
    	potAngle = pot.get();
    	
    	if (up == true) {
    		
    		if (potAngle < setPoint) {
    			gearMechPivot.set(1.0);
    		} else {
    			Robot.GearMech.disableMoterPower();
    		}
    	} else {
    		
    		if (potAngle > setPoint) {
    			gearMechPivot.set(-1.0);
    		} else {
    			Robot.GearMech.disableMoterPower(); // TODO is this how that works
    		}
    		
    	}
    }
    
    // This is the command that tells the gear mech to stop moving
    public void disableMoterPower() {
    	gearMechPivot.set(0);
    }
    
    public boolean gearMechSetPointReached() {
    	return potAngle < RobotMap.TOP_SET_POINT_ANGLE; //TODO this number needs tuning
    }
}

