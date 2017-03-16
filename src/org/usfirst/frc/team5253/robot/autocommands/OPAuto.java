package org.usfirst.frc.team5253.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * TODO bleh
 */
public class OPAuto extends CommandGroup {

	public OPAuto() {
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

		addSequential(new AutoDriveToDistance(.75, -130));// 0.6 OG

		addSequential(new AutoRedBullWingsExtend());
		addParallel(new AutoSpinUpThenShoot());

		addSequential(new AutoTimerTurn(-1, 0.35)); // 0.2 OG
		
		addSequential(new AutoStopRobot());
	}
}
