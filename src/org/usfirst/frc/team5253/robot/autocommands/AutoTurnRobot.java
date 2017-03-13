
package org.usfirst.frc.team5253.robot.autocommands;

import org.usfirst.frc.team5253.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class TurnRobot extends Command {

	double angle;

	public TurnRobot(double angle) {
		requires(Robot.Drivetrain);
		this.angle = angle;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.Drivetrain.disable();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.Drivetrain.setSetpoint(Robot.Drivetrain.getAngle() + this.angle);
		Robot.Drivetrain.enable();
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
		return Robot.Drivetrain.onTarget();
	}
}