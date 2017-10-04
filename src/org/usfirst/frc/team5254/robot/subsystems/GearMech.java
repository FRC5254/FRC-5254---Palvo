package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.GearMechInit;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearMech extends Subsystem {
	//TODO clean up subsystem
	

	private Spark gearMechPivot  = new Spark (RobotMap.GEAR_MECH_PIVOT);
	private Spark gearMechIntake = new Spark (RobotMap.GEAR_MECH_INTAKE);
	static AnalogPotentiometer pot = new AnalogPotentiometer(1, 360, 30);
	private double potAngle;
	
    public void initDefaultCommand() {
    	setDefaultCommand(new GearMechInit());
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
    public void setPivotAngle(boolean direction, double setPoint) {
    	potAngle = pot.get();
    	
    	if (direction == true) {
    		
   		if (potAngle < setPoint) {
    			gearMechPivot.set(.25);
    		} else {
    			Robot.GearMech.disableMoterPower();
    		}
    	} else {
    		
    		if (potAngle > setPoint) {
    			gearMechPivot.set(-.25);
    		} else {
    			Robot.GearMech.disableMoterPower(); // TODO is this how that works
    		}
    		
    	}
    }
    
    // This is the command that tells the gear mech to stop moving
    public void disableMoterPower() {
    	gearMechPivot.set(0);
    }
    
    public void printPotValue(){
    	System.out.println("Potentiometer Value: " + pot.get());
    }
    
    public boolean gearMechSetPointReached() {
    	return potAngle < RobotMap.TOP_SET_POINT_ANGLE; //TODO this number needs tuning
    }
    
    public void drivePivotMotor(double power) {
    	gearMechPivot.set(power);
    	
    }
    
    public boolean gearMechStop() {// TODO does this work?
    	return (Math.abs(gearMechPivot.getRaw()) > 30);// TODO Needs to be tuned 
    }
    
    
    ///TODO jaank code below
//    public void pivotUp(double Throttle) {
//    	gearMechPivot.set(Throttle);
//    }
    
    public void pivotMotorOn(boolean up) {
        System.out.println(gearMechPivot.getRaw());// TODO remove line when unneeded

    	if (up == true) {
    		
    		gearMechPivot.set(-0.5);
    	} else {
    		gearMechPivot.set(0.5);
    		
    		}
    }
    
    public void pivotMotorOff() {
    	gearMechPivot.set(0.0);
    }
}


