package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimerTurn extends Command {

	Timer timer = new Timer();
	double time, turn;

	public TimerTurn(double turn, double time) {
		requires(Robot.Drivetrain);
		this.turn = turn;
		this.time = time;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.Drivetrain.disable();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.Drivetrain.drive(0, turn);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		timer.reset();
		timer.start();
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
		return timer.get() > time;
	}
}
