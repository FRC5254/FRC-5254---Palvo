package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberGo extends Command {

	double climberspeed;

	public ClimberGo(boolean direction) {
		requires(Robot.Climber);

		// TODO put this in the thing
		if (direction == true) {
			climberspeed = -1.0;
		} else {
			climberspeed = 1.0;
		}
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.Climber.on(climberspeed);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
