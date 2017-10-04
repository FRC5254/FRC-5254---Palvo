package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearMechPivotActivate extends Command {
	
boolean up;

    public GearMechPivotActivate(boolean up) {
    	// eg. requires(chassis);
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.GearMech);
    	this.up = up;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.GearMech.pivotMotorOn(up);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return Robot.GearMech.gearMechStop();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
