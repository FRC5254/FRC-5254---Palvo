package org.usfirst.frc.team5254.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearMechInit extends CommandGroup {

	public GearMechInit() {
		addSequential(new GearMechOff());
		addParallel(new GearMechArmOff());
	}
}
