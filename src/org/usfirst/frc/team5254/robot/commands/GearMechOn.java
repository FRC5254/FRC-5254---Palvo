package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechOn extends Command {

	boolean intake;
	
    public GearMechOn(boolean intake) {
        requires(Robot.GearMech);
        
        this.intake = intake;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.GearMech.on(intake);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.GearMech.off();
    }

    protected void interrupted() {
    	end();
    }
}
