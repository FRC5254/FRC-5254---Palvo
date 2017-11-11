package org.usfirst.frc.team5254.robot.autocommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoSecondWait extends Command {

	double time;
	Timer timer = new Timer();

	public AutoSecondWait(double time) {
		
		this.time = time;
	}

	protected void initialize() {
		timer.reset();
		timer.start();
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return timer.get() > time;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
