package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ControllerConstantsT {
	public static Joystick driveController;
	public static final int CONTROLLER_DRIVE = 0;

	public static JoystickButton driveA;
	public static JoystickButton driveB;
	public static JoystickButton driveY;
	public static JoystickButton driveX;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;

	public static final int AXIS_LEFT_Y = 1;
	public static final int AXIS_LEFT_X = 0;

	public static final int AXIS_RIGHT_Y = 5;
	public static final int AXIS_RIGHT_X = 4;

	public static final int BUMPER_LEFT_1 = 5;
	public static final int BUMPER_RIGHT_1 = 6;
	public static final int TRIGGER_LEFT_2 = 2;
	public static final int TRIGGER_RIGHT_2 = 3;
	public static final int BUTTON_LEFT_3 = 9;
	public static final int BUTTON_RIGHT_3 = 10;
	public static final int BUTTON_SELECT = 7;
	public static final int BUTTON_START = 8;

	public static void init() {
		// Drive Controller
		driveController = new Joystick(CONTROLLER_DRIVE);
		driveA = new JoystickButton(driveController, BUTTON_A);
		driveB = new JoystickButton(driveController, BUTTON_B);
		driveX = new JoystickButton(driveController, BUTTON_X);
		driveY = new JoystickButton(driveController, BUTTON_Y);

	}
}
