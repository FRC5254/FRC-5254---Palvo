package org.usfirst.frc.team5254.robot.autocommands;

import org.usfirst.frc.team5254.robot.Robot;
import org.usfirst.frc.team5254.robot.commands.HypeHatStartSpinning;
import org.usfirst.frc.team5254.robot.commands.ShooterStartShooting;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TenBallAuto extends CommandGroup {

	public TenBallAuto() {

		requires(Robot.Drivetrain);
		requires(Robot.Shooter);
		requires(Robot.HypeHat);
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.

		addSequential(new HypeHatStartSpinning());// cause
		addParallel(new AutoSpinUp());
		addSequential(new ShooterStartShooting());
	}
}
