package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.ControllerConstantsT;
import org.usfirst.frc.team4.robot.commands.ToggleDrive;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public OI() {
		ControllerConstantsT.driveA.toggleWhenPressed(new ToggleDrive());
	}

	public double driveLeftX(Joystick cont) {
		return cont.getRawAxis(ControllerConstantsT.AXIS_LEFT_X);
	}

	public double driveLeftY(Joystick cont) {
		return cont.getRawAxis(ControllerConstantsT.AXIS_LEFT_Y);
	}

	public double driveRightX(Joystick cont) {
		return cont.getRawAxis(ControllerConstantsT.AXIS_RIGHT_X);
	}

	public double driverRightY(Joystick cont) {
		return cont.getRawAxis(ControllerConstantsT.AXIS_RIGHT_Y);
	}
}
