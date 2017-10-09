package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.*;
import org.usfirst.frc.team5254.robot.commands.*;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * 
 */
public class SideGearAuto extends CommandGroup {

    public SideGearAuto() {
    	
    	double angle = 45;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
    		angle = -angle;
    	} // TODO test
    	
    	addSequential(new AutoDriveToDistance(0.5, 10.0));// TODO tune
    	addSequential(new AutoPIDTurn(angle)); // TODO get vlaues from previous code (SASSY)
    	addSequential(new AutoDriveToDistance(0.5, 5.0));// TODO tune
    	addSequential(new GearMechArmDown());// TODO do other placing method (drop and outtake)
//    	addSequential(new AutoDropGear(1)); //TODO this is back up code
    	addSequential(new AutoDriveToDistance(-0.5, 10.0));// TODO BS numbers
    }
}
