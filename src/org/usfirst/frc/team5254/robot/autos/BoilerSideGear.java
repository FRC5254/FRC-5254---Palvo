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
public class BoilerSideGear extends CommandGroup {

    public BoilerSideGear() {
    	
double angle = 60;
    	
    	if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
    		angle = -angle;
    	} // TODO test
    	
    	addSequential(new AutoDriveToDistance(0.75, 83.0));
    	addSequential(new AutoPIDTurn(60)); 
    	addSequential(new AutoDriveToDistance(0.75, 28.0));// TODO tune
    	addSequential(new AutoDropGear(1));
    	addSequential(new AutoDriveToDistance(-0.75, 20.0));// TODO BS numbers
    	addSequential(new GearMechArmUp());
    	
    }
}
