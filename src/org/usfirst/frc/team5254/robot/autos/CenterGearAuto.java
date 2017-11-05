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
    	
    	addSequential(new AutoDriveToDistance(0.85, 85.6));
    	addSequential(new AutoDropGear(1));
    	addSequential(new AutoDriveToDistance(-0.75, 34.5));
//    	addSequential(new AutoPIDTurn(140));// TODO not the right #
//    	addSequential(new AutoDriveToDistance(-0.75, 100.0));//TODO test
//    	addSequential(new AutoPIDTurn(60));
//    	addSequential(new AutoDriveToDistance(0.75, 200));
    	addParallel(new GearMechArmUp());
    	
    }
}
