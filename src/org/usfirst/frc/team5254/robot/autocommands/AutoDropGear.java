package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoDropGear extends Command {
	
	Timer timer = new Timer();
	double time;

    public AutoDropGear(double time) {
    	requires(Robot.GearMech);
    	
    	this.time = time;
    }

    protected void initialize() {
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	 Robot.GearMech.armMotorDown();
    }

    protected boolean isFinished() {
        return timer.get() > time;
    }

    protected void end() {
    	timer.stop();
    }

    protected void interrupted() {
    	end();
    }
}
