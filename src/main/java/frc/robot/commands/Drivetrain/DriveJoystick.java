/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveJoystick extends Command {

  public DriveJoystick() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // Get the joystick inputs
    double xSpeed = -OI.driverJoystick.getY();
    double zRotation = -(OI.driverJoystick.getX() * RobotMap.kDriverZJoystickGain);

    // Apply a joystick deadband;
    if (xSpeed < 0.05 && xSpeed > -0.05) {
        xSpeed = 0.0;
    }
    if (zRotation < 0.05 && zRotation > -0.05) {
        zRotation = 0.0;
    }
    // Blake likes the arcade drive best.
    Drivetrain.diffDrive.arcadeDrive(xSpeed, zRotation);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
