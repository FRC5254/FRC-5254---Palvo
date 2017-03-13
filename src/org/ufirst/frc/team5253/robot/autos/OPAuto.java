package org.ufirst.frc.team5253.robot.autos;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class OPAuto extends CommandGroup {

<<<<<<< HEAD:src/org/ufirst/frc/team5253/robot/autos/OPAuto.java
    public OPAuto() {
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new AutoDriveToDistance(.75, -132.5));//0.6 OG
    	
    	addSequential(new AutoRedBullWingsExtend());
    	addParallel(new AutoSpinUpThenShoot());
    	
    	addSequential(new AutoTimerTurn(-1, 0.35)); //0.2 OG
//    	addSequential(new TurnRobot(-35));
    	
    	addSequential(new AutoStopRobot());
//    	addSequential(new TurnRobot(10)); //famboyent effect
//    	addSequential(new DriveToDistance(.5, 5)); //get into optimal shooting spot #wish we had vision
//    	addSequential(new TurnRobot(5));
//        addSequential(new AutoStartShooting());
    }
=======
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

		addSequential(new DriveToDistance(.75, -132.5));// 0.6 OG

		addSequential(new AutoRedBullWingsExtend());
		addParallel(new SpinUpThenShoot());

		addSequential(new TimerTurn(-1, 0.35)); // 0.2 OG
		// addSequential(new TurnRobot(-35));

		addSequential(new StopRobot());
		// addSequential(new TurnRobot(10)); //famboyent effect
		// addSequential(new DriveToDistance(.5, 5)); //get into optimal
		// shooting spot #wish we had vision
		// addSequential(new TurnRobot(5));
		// addSequential(new AutoStartShooting());
	}
>>>>>>> origin/master:src/org/usfirst/frc/team5253/robot/autocommands/OPAuto.java
}