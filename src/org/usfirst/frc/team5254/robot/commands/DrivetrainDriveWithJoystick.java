package org.usfirst.frc.team5254.robot.commands;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DrivetrainDriveWithJoystick extends Command {

	public DrivetrainDriveWithJoystick() {
		requires(Robot.Drivetrain);
	}

	@Override
	protected void initialize() {
		Robot.Drivetrain.shiftDown();
	}

	@Override
	protected void execute() {
		Robot.Drivetrain.drive(Robot.oi.driver.getRawAxis(RobotMap.DRIVER_THROTTLE_AXIS),
				Robot.oi.driver.getRawAxis(RobotMap.DRIVER_TURN_AXIS));
	}

	@Override
	protected boolean isFinished() {
		return false;
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
