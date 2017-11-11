package org.usfirst.frc.team5254.robot.autocommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoSecondWait extends Command {

	double time;
	Timer timer = new Timer();

	public AutoSecondWait(double time) {

		this.time = time;
	}

	@Override
	protected void initialize() {
		timer.reset();
		timer.start();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return timer.get() > time;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
