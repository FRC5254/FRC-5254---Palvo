package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberGoSlow extends Command {

	double percent;

	public ClimberGoSlow(double percent) {
		requires(Robot.Climber);

		this.percent = percent;

	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.Climber.on(-(percent));
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
