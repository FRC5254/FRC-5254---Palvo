package org.usfirst.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.AutoDriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.AutoPIDTurn;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class BoilerSideGearAndCrossFieldAuto extends CommandGroup { // TODO requires for all autos

	public BoilerSideGearAndCrossFieldAuto() {

		double angle1 = 60.0;
		double angle2 = (-45.0);

		if (DriverStation.getInstance().getAlliance() == DriverStation.Alliance.Blue) {
			angle1 = -angle1;
			angle2 = -angle2;
		}

		addSequential(new BoilerSideGearAuto());
		addSequential(new AutoPIDTurn(angle1));// Right
		addSequential(new AutoDriveToDistance(1.0, 150.0));
		addSequential(new AutoPIDTurn(angle2));// Left
		addSequential(new AutoDriveToDistance(1.0, 250.0));
	}
}
