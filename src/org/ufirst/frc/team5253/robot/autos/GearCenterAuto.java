package org.ufirst.frc.team5253.robot.autos;

import org.usfirst.frc.team5253.robot.Robot;
import org.usfirst.frc.team5253.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5253.robot.autocommands.AutoDropGear;
import org.usfirst.frc.team5253.robot.autocommands.AutoStopRobot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearCenterAuto extends CommandGroup {
<<<<<<< HEAD:src/org/ufirst/frc/team5253/robot/autos/GearCenterAuto.java
	
    public GearCenterAuto() {
    	
    	requires(Robot.Drivetrain);
    	requires(Robot.GearHolder);
    	
    	
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


    	addSequential(new AutoDriveToDistance(1.0, 69));
    	addSequential(new AutoDropGear());
    	addSequential(new AutoDriveToDistance(1.0, -24));
    	addSequential(new AutoStopRobot());
			
    }
=======

	public GearCenterAuto() {

		requires(Robot.Drivetrain);
		requires(Robot.GearHolder);

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

		addSequential(new DriveToDistance(1.0, 69));
		addSequential(new DropGearAuto());
		addSequential(new DriveToDistance(1.0, -24));
		addSequential(new StopRobot());

	}
>>>>>>> origin/master:src/org/usfirst/frc/team5253/robot/autocommands/GearCenterAuto.java
}