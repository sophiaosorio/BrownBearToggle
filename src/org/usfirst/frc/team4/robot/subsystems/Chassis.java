package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {

	VictorSP leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor;
	RobotDrive driveController;

	public boolean isArcadeDrive = true;

	public void initDefaultCommand() {
		leftFrontMotor = new VictorSP(RobotMap.leftFrontMotor);
		leftBackMotor = new VictorSP(RobotMap.rightBackMotor);
		rightFrontMotor = new VictorSP(RobotMap.rightFrontMotor);
		rightBackMotor = new VictorSP(RobotMap.rightBackMotor);

		driveController = new RobotDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
	}

	public void arcadeDrive(double moveValue, double rotateValue) {
		driveController.arcadeDrive(moveValue, rotateValue, true);
	}

	public void tankDrive(double left, double right) {
		driveController.tankDrive(left, right, true);
	}
}
