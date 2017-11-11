package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.*;
import org.usfirst.frc.team5254.robot.commands.*;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class FeederSideGearAuto extends CommandGroup {

    public FeederSideGearAuto() {
    	
    	double angle = 60.0;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
    		angle = -angle;
    	}
    	
    	addSequential(new AutoDriveToDistance(0.75, 85.0));
    	addSequential(new AutoPIDTurn(angle)); 
    	addSequential(new AutoDriveToDistance(0.75, 26.0));
    	addSequential(new AutoDropGear(1)); 
    	addSequential(new AutoDriveToDistance(-0.75, 20.0));
    	addSequential(new GearMechArmUp());
    }
}
