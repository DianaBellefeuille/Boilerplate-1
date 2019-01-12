/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.robot.RobotMap;
import frc.robot.commands.DriveJoystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {

  // Map the CIM motors to the TalonSRX's
  public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.DRIVETRAIN_FRONT_LEFT_MOTOR);
  public static WPI_TalonSRX rearLeft = new WPI_TalonSRX(RobotMap.DRIVETRAIN_REAR_LEFT_MOTOR);
  public static WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.DRIVETRAIN_FRONT_RIGHT_MOTOR);
  public static WPI_TalonSRX rearRight = new WPI_TalonSRX(RobotMap.DRIVETRAIN_REAR_RIGHT_MOTOR);


  // Add the motors to the speed controller groups and create the differential drivetrain
  public static SpeedControllerGroup leftDrive = new SpeedControllerGroup(frontLeft, rearLeft);
  public static SpeedControllerGroup rightDrive = new SpeedControllerGroup(frontRight, rearRight);
  public static DifferentialDrive diffDrive = new DifferentialDrive(frontLeft, frontRight);

  
  // Setup the default motor controller setup
  
  
  public static void initControllerSetup() {
    // This method will setup the default settings of the motor controllers.
  
    // Set the front motors to be the followers of the rear motors
    frontLeft.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_LEFT_MOTOR);
    frontRight.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_RIGHT_MOTOR);

    // Set the neutral output mode to Brake/Coast/
    rearLeft.setNeutralMode(NeutralMode.Brake);
    rearRight.setNeutralMode(NeutralMode.Brake);

    // Disable the motor-safety
    diffDrive.setSafetyEnabled(false);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoystick());
  }
}
