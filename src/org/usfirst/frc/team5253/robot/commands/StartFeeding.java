package org.usfirst.frc.team5253.robot.commands;

import org.usfirst.frc.team5253.robot.Robot;
import org.usfirst.frc.team5253.robot.subsystems.HypeHat;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartFeeding extends Command {

    public StartFeeding() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.HypeHat);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.HypeHat.startSpinning();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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