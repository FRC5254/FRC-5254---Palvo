package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberStop extends Command {

	public ClimberStop() {
		requires(Robot.Climber);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.Climber.off();
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
