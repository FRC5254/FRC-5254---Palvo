package org.usfirst.frc.team5253.robot.autos;

import org.usfirst.frc.team5253.robot.Robot;
import org.usfirst.frc.team5253.robot.autocommands.AutoDriveToDistanceFast;
import org.usfirst.frc.team5253.robot.autocommands.AutoDropGear;
import org.usfirst.frc.team5253.robot.autocommands.AutoSpinUp;
import org.usfirst.frc.team5253.robot.autocommands.AutoStartShooting;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestAuto extends CommandGroup {

    public TestAuto() {
    	requires(Robot.Drivetrain);
    	requires(Robot.Shooter);
    	requires(Robot.HypeHat);
    	requires(Robot.GearMech);
    	requires(Robot.FuelTank);//just in case
    	requires(Robot.Climber);//you never know...
    	
    	 Timer timer = new Timer();
    	 
    	 timer.reset();
    	 timer.start();
    	 
    	addSequential(new AutoSpinUp(2, true));
 		addSequential(new AutoStartShooting(2, true));
    	 
//    	 addSequential(new AutoDriveToDistanceFast(0.75, 18));
//    	 addSequential(new AutoDropGear());
//    	 addSequential(new AutoDriveToDistanceFast(-0.75, 18));
    	 
    	 System.out.println("Timer " + timer.get());
    	
    }
}
