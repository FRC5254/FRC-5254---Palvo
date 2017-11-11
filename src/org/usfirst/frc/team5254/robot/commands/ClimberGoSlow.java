package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberGoSlow extends Command {

	double percent;
	
    public ClimberGoSlow(double percent) {
    	requires(Robot.Climber);
    	
    	this.percent = percent;
    	
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.Climber.on(-(percent));
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
