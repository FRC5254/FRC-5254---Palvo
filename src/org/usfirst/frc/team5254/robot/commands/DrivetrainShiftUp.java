package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DrivetrainShiftUp extends Command {

	public DrivetrainShiftUp() {
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.Drivetrain.shiftUp();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		end();
	}
}
