package org.usfirst.frc.team5253.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class OPAuto extends CommandGroup {

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
    	
    	addSequential(new DriveToDistance(.25, 96));
    	addSequential(new AutoTurn(90)); //TODO find best value
    	//timer insert or wiggle robot
    	addParallel(new DriveToDistance(.25, 2));
    	addParallel(new AutoSpinUp());
    	addSequential(new AutoStartShooting());
    	
    	/*
    	 * addSequential(new DriveToDistance(.25, 80));
    	 * addSequential(new AutoTurn(10)); //famboyent effect
    	 * addSequential(new DriveToDistance(?,?)); //get into optimal shooting spot #wish we had vision
    	 * addSequential(new AutoSpinUp());
    	 * addSequential(new AutoStartShooting());
    	 * */
    }
}