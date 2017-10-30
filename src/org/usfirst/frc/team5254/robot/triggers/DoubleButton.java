package org.usfirst.frc.team5254.robot.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class DoubleButton extends Trigger {

	private Joystick joy;
	private int button1;
	private int button2;
	
	public DoubleButton(Joystick joy, int  driverButtonX, int driverButtonBumperRight) {
		this.joy = joy;
		this.button1 = driverButtonX;
		this.button2 = driverButtonBumperRight;
	}
	
    public boolean get() {
        return joy.getRawButton(button1) && joy.getRawButton(button2);
    }
}
