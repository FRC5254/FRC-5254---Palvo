package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechArmOff extends Command {

    public GearMechArmOff() {
    	requires(Robot.GearMech);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.GearMech.armMotorOff();
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
