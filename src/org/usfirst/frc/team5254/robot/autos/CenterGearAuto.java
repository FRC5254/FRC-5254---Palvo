package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.*;
import org.usfirst.frc.team5254.robot.commands.*;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * 
 */
public class CenterGearAuto extends CommandGroup {

    public CenterGearAuto() {
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
    	addSequential(new AutoDriveToDistance(0.5, 67.0));//TODO tune
    	addSequential(new GearMechArmDown());// TODO does this finish
    	addSequential(new AutoDriveToDistance(-0.5, 34.5)); //TODO tune
    	
//    	addSequential(new AutoDropGear(1));// TODO this is back up code
//    	addSequential(new AutoDriveToDistance(-0.5, 10.0)); // TODO BS #s
    	
    }
}
