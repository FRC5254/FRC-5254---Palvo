
package org.usfirst.frc.team5253.robot.autocommands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5253.robot.Robot;
/**
 *
 */
public class  TurnRobot extends Command {
	
	double angle;

    public TurnRobot(double angle) {
        requires(Robot.Drivetrain);
        this.angle = angle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Drivetrain.setSetpoint(Robot.Drivetrain.getAngle() + this.angle);
        Robot.Drivetrain.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.Drivetrain.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.Drivetrain.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}