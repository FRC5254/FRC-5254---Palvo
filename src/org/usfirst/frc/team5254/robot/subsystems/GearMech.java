package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.GearMechInit;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearMech extends Subsystem {
	
	private Spark gearMechArm  = new Spark(RobotMap.GEAR_MECH_ARM);
	private Spark gearMechIntake = new Spark(RobotMap.GEAR_MECH_INTAKE);
	public DigitalInput topButton = new DigitalInput(RobotMap.TOP_ARM_LIMIT_SWITCH);
	public DigitalInput bottomButton = new DigitalInput(RobotMap.BOTTOM_ARM_LIMIT_SWITCH);
	static AnalogPotentiometer pot = new AnalogPotentiometer(1, 360, 30);
	private double potAngle;
	
	
	double fastSpeed = 0.50;
	double slowSpeed  = 0.20;
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new GearMechInit());
    }
    
    //Gear Mech Intake
    public void on(boolean intake) {
    	
    	if (intake == true) {
    		gearMechIntake.set(1.0);
    	} else {
    		gearMechIntake.set(-1.0);
    	}
    }
    
    public void off() {
    	gearMechIntake.set(0);
    }
    
    
    //Gear Mech Arm
    public void armMotorUp() {
    	
    	// full speed when button isn't pressed
    	if (topButton.get() == false) {
	    		gearMechArm.set(-slowSpeed); 
	    // Half speed when button is pressed
    		} else {
    			gearMechArm.set(-fastSpeed);
	    	}
    }
    
    public void armMotorDown() {
    	// full speed when button isn't pressed
    	if (bottomButton.get() == false) {
	    		gearMechArm.set(slowSpeed);
	    	} else {
	    		gearMechArm.set(fastSpeed);
	    	}
    }
    
    // This is the command that tells the gear mech to stop moving
    public void armMotorOff() {
    	gearMechArm.set(0.0);
    }
    
    //Potentiometer code
    // This is where the gear mech is told to either go up or down, with a pot
    public void setArmAngle(boolean direction, double setPoint) {
    	potAngle = pot.get();
    	
    	if (direction == true) {
    		
   		if (potAngle < setPoint) {
    			gearMechArm.set(.25);
    		} else {
    			Robot.GearMech.armMotorOff();
    		}
    	} else {
    		
    		if (potAngle > setPoint) {
    			gearMechArm.set(-.25);
    		} else {
    			Robot.GearMech.armMotorOff();; // TODO is this how that works
    		}
    	}
    }
    
    public boolean gearMechSetPointReached() {
    	return potAngle < RobotMap.TOP_SET_POINT_ANGLE; //TODO this number needs tuning
    }
    
    public void printPotValue(){
    	System.out.println("Potentiometer Value: " + pot.get());
    }
    
    //TODO fix this code it doesnt work
    
//    public void armUp(double Throttle) {
//    	gearMecharm.set(Throttle);
//    }
//    
//    public void driveArmMotor(double power) {
//    	gearMechArm.set(power);
//    }
    
    public boolean gearMechStop() {// TODO does this work? no it doesnt
    	return Math.abs(gearMechArm.getRaw()) > 5;// TODO Needs to be tuned 
    }
    

}


