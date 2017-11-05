package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.AutoDropGear;
import org.usfirst.frc.team5254.robot.autocommands.AutoPIDTurn;
import org.usfirst.frc.team5254.robot.commands.GearMechArmUp;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BoilerSideGearAuto extends CommandGroup {

    public BoilerSideGearAuto() {
    	
    	double angle = 60.0;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Red) {
    		angle = -angle;
    	} // TODO test
    	
    	addSequential(new AutoDriveToDistance(0.75, 90.0));
    	addSequential(new AutoPIDTurn(angle)); 
    	addSequential(new AutoDriveToDistance(0.75, 18.0));
    	addSequential(new AutoDropGear(1)); 
    	addSequential(new AutoDriveToDistance(-0.75, 20.0));
    	addSequential(new GearMechArmUp());
    }
}
