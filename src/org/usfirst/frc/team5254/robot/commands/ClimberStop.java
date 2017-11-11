package org.usfirst.frc.team5254.robot.commands;


import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberStop extends Command {

    public ClimberStop() {
    	requires(Robot.Climber);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.Climber.off();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
