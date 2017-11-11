package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDriveToDistanceFast extends Command {
	
	double throttle;
	double distance;
	
    public AutoDriveToDistanceFast(double throttle, double distance) {
    	//TODO Requires DT?
    	
    	this.throttle = throttle;
    	this.distance = distance;
    }

    protected void initialize() {
    	Robot.Drivetrain.autoDistanceDriveInit(throttle, distance);
    }

    protected void execute() {
    	Robot.Drivetrain.autoDistanceDriveFast();
    }

    protected boolean isFinished() {
        return Robot.Drivetrain.driveAutoIsFinished();
    }

    protected void end() {
    	Robot.Drivetrain.stop();
    }

    protected void interrupted() {
    	end();
    }
}
