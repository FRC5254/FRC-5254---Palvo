package org.usfirst.frc.team5253.robot.commands;

import org.usfirst.frc.team5253.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearMechOn extends Command {

	double gearSpeed;

	public GearMechOn(boolean direction) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);

		if (direction = true) {
			gearSpeed = 1;
		} else {
			gearSpeed = -1;
		}
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.GearMech.on(gearSpeed);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}
}