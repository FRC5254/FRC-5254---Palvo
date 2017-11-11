package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechArmDown extends Command {
	

    public GearMechArmDown() {
    	requires(Robot.GearMech);
    }

    protected void initialize() {
    }

    protected void execute() {
    		Robot.GearMech.armMotorDown();
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
