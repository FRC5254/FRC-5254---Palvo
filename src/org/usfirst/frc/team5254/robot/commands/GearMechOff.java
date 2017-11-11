package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechOff extends Command {

    public GearMechOff() {
    	requires(Robot.GearMech);
    }

    protected void initialize() {
    	Robot.GearMech.off();
    }

    protected void execute() {
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
