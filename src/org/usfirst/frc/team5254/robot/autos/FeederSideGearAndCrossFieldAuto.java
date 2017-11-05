package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.AutoPIDTurn;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FeederSideGearAndCrossFieldAuto extends CommandGroup {

    public FeederSideGearAndCrossFieldAuto() {
    	
    	double angle = 60.0;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
    		angle = -angle;
    	}
    	
    	addSequential(new FeederSideGearAuto());
    	addSequential(new AutoPIDTurn(angle));
    	addSequential(new AutoDriveToDistance(1.0, 600.0));
    }
}
