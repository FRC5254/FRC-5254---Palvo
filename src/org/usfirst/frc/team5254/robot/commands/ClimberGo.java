package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberGo extends Command {
	
	double climberspeed;
	
    public ClimberGo(boolean direction) {
    	requires(Robot.Climber);
    	
    	//TODO put this in the thing
    	if (direction == true) {
    		climberspeed = -1.0;
    	} else {
    		climberspeed = 1.0;
    	}
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.Climber.on(climberspeed); 
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
