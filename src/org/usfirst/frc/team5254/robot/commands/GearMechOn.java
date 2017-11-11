package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechOn extends Command {

	boolean intake;

	public GearMechOn(boolean intake) {
		requires(Robot.GearMech);

		this.intake = intake;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.GearMech.on(intake);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.GearMech.off();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
