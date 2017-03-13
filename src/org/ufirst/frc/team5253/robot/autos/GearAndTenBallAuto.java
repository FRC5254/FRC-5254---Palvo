package org.ufirst.frc.team5253.robot.autos;

import org.usfirst.frc.team5253.robot.Robot;
<<<<<<< HEAD:src/org/ufirst/frc/team5253/robot/autos/GearAndTenBallAuto.java
import org.usfirst.frc.team5253.robot.autocommands.AutoSpinUp;
import org.usfirst.frc.team5253.robot.autocommands.AutoTurnRobot;
import org.usfirst.frc.team5253.robot.commands.GearHolderDropGear;
=======
>>>>>>> origin/master:src/org/usfirst/frc/team5253/robot/autocommands/GearAndTenBallAuto.java
import org.usfirst.frc.team5253.robot.commands.ShooterStartShooting;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearAndTenBallAuto extends CommandGroup {

<<<<<<< HEAD:src/org/ufirst/frc/team5253/robot/autos/GearAndTenBallAuto.java
    public GearAndTenBallAuto() {
    	
    	requires(Robot.Drivetrain);
    	requires(Robot.Shooter);
    	requires(Robot.GearHolder);
    	requires(Robot.HypeHat);
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
    	
//    	addSequential(new DriveToDistance(1.0, 54));
//    	addSequential(new GearHolderDropGear());
//    	addParallel(new DriveToDistance(1.0, 54));
    	addSequential(new GearCenterAuto());
    	addSequential(new AutoTurnRobot(90));//TODO find goochi value
    	addSequential(new AutoSpinUp());
    	addSequential(new ShooterStartShooting());
    }
=======
	public GearAndTenBallAuto() {

		requires(Robot.Drivetrain);
		requires(Robot.Shooter);
		requires(Robot.GearHolder);
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

		// addSequential(new DriveToDistance(1.0, 54));
		// addSequential(new GearHolderDropGear());
		// addParallel(new DriveToDistance(1.0, 54));
		addSequential(new GearCenterAuto());
		addSequential(new TurnRobot(90));// TODO find goochi value
		addSequential(new AutoSpinUp());
		addSequential(new ShooterStartShooting());
	}
>>>>>>> origin/master:src/org/usfirst/frc/team5253/robot/autocommands/GearAndTenBallAuto.java
}