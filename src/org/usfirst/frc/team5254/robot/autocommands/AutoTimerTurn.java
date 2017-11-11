package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoTimerTurn extends Command {

	Timer timer = new Timer();

	double time, turn;

	public AutoTimerTurn(double turn, double time) {
		this.turn = turn;
		this.time = time;
	}

	@Override
	protected void initialize() {
		timer.reset();
		timer.start();
	}

	@Override
	protected void execute() {
		Robot.Drivetrain.drive(0, turn);
	}

	@Override
	protected boolean isFinished() {
		return timer.get() > time;
	}

	@Override
	protected void end() {
		Robot.Drivetrain.disable();
		timer.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
