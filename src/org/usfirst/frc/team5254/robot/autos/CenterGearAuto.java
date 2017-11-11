package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.AutoDropGear;
import org.usfirst.frc.team5254.robot.commands.GearMechArmUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CenterGearAuto extends CommandGroup {

	public CenterGearAuto() {
		addSequential(new AutoDriveToDistance(0.85, 85.6));
		addSequential(new AutoDropGear(1));
		addSequential(new AutoDriveToDistance(-0.75, 34.5));
		addParallel(new GearMechArmUp());
	}
}
