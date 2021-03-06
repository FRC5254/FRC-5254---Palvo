package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDriveToDistanceFast extends Command {

	double throttle;
	double distance;

	public AutoDriveToDistanceFast(double throttle, double distance) {
		// TODO Requires DT?

		this.throttle = throttle;
		this.distance = distance;
	}

	@Override
	protected void initialize() {
		Robot.Drivetrain.autoDistanceDriveInit(throttle, distance);
	}

	@Override
	protected void execute() {
		Robot.Drivetrain.autoDistanceDriveFast();
	}

	@Override
	protected boolean isFinished() {
		return Robot.Drivetrain.driveAutoIsFinished();
	}

	@Override
	protected void end() {
		Robot.Drivetrain.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
