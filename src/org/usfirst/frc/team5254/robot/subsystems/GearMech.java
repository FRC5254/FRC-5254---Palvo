package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.GearMechInit;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearMech extends Subsystem {

	private Spark gearMechArm = new Spark(RobotMap.GEAR_MECH_ARM);
	private Spark gearMechIntake = new Spark(RobotMap.GEAR_MECH_INTAKE);
	public DigitalInput topButton = new DigitalInput(RobotMap.TOP_ARM_LIMIT_SWITCH);
	public DigitalInput bottomButton = new DigitalInput(RobotMap.BOTTOM_ARM_LIMIT_SWITCH);

	static AnalogPotentiometer pot = new AnalogPotentiometer(1, 360, 30);

	double fastSpeedDown = 0.70;
	double fastSpeedUp = 0.70;

	double slowSpeedBottom = 0.15;
	double slowSpeedTop = 0.15;

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new GearMechInit());
	}

	// Gear Mech Intake
	public void on(boolean intake) {

		if (intake == true) {
			gearMechIntake.set(1.0);
		} else {
			gearMechIntake.set(-1.0);
		}
	}

	public void off() {
		gearMechIntake.set(0);
	}

	// Gear Mech Arm
	public void armMotorUp() {

		// full speed when button isn't pressed
		if (topButton.get() == false) {
			gearMechArm.set(-slowSpeedTop);
			// Half speed when button is pressed
		} else {
			gearMechArm.set(-fastSpeedUp);
		}
	}

	public void armMotorDown() {
		// full speed when button isn't pressed
		if (bottomButton.get() == false) {
			gearMechArm.set(slowSpeedBottom);
		} else {
			gearMechArm.set(fastSpeedDown);
		}
	}

	// This is the command that tells the Gear Mech to stop moving
	public void armMotorOff() {
		gearMechArm.set(0.0);
	}
}
