package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.GearHolderRaiseGear;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearHolder extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	// private DoubleSolenoid gearPiston = new
	// DoubleSolenoid(RobotMap.GEAR_HOLDER_PISTON_EXTEND,
	// RobotMap.GEAR_HOLDER_PISTON_RETRACT);
	private Solenoid gearIntake = new Solenoid(RobotMap.GEAR_INTAKE_PISTION);

	public GearHolder() {
	}

	public void drop() {
		// gearPiston.set(DoubleSolenoid.Value.kReverse);
	}

	public void floorIntakeIn() {

	}

	public void In() {
		gearIntake.set(false);
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new GearHolderRaiseGear());
	}

	public void Out() {
		gearIntake.set(true);
	}

	public void raise() {
		// gearPiston.set(DoubleSolenoid.Value.kForward);
	}
}
