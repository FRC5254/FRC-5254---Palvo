package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.AutoPIDTurn;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CenterGearAndCrossFieldAuto extends CommandGroup {

    public CenterGearAndCrossFieldAuto() {
        
    	double angle1 = (-75.0);
    	double angle2 = 75.0;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
    		angle1 = -angle1;
    		angle2 = -angle2;
    	}
    	
    	addSequential(new CenterGearAuto());
    	addSequential(new AutoPIDTurn(angle1));// Left
    	addSequential(new AutoDriveToDistance(1.0, 80));
    	addSequential(new AutoPIDTurn(angle2));// Right
    	addSequential(new AutoDriveToDistance(1.0, 340));
    }
}
