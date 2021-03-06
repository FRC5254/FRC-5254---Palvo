package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearMechArmDown extends Command {

	public GearMechArmDown() {
		requires(Robot.GearMech);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.GearMech.armMotorDown();
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
		end();
	}
}
