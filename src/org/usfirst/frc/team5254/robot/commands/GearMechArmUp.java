package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechArmUp extends Command {

    public GearMechArmUp() {
    	requires(Robot.GearMech);
    }

    protected void initialize() {
    }

    protected void execute() { 
    		Robot.GearMech.armMotorUp();	
    }

    protected boolean isFinished() {
       return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}
