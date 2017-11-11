
package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class AutoPIDTurn extends Command {

	double angle;

	public AutoPIDTurn(double angle) {
		this.angle = angle;
	}

	@Override
	protected void initialize() {
		Robot.Drivetrain.setSetpoint(Drivetrain.gyro.getAngle() + this.angle); // TODO did i do a bad here
		Robot.Drivetrain.enable();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return Robot.Drivetrain.onTarget();
	}

	@Override
	protected void end() {
		Robot.Drivetrain.disable();
	}

	@Override
	protected void interrupted() {
		end();
	}
}