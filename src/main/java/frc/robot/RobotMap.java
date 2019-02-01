/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public class RobotMap {

  // Talon IDs for the drivetrain
  public static int kLeftLeaderID = 10;
  public static int kLeftFollowerAID = 11;
  public static int kLeftFollowerBID   = 12;
  public static int kRightLeaderID = 25;
  public static int kRightFollowerAID = 24;
  public static int kRightFollowerBID  = 23;
  
  // public static int kCargoMotorID = ?;
  // public static int kWristMotorID = ?;

  // public static int kElevatorMotorAID = ?;
  // public static int kElevatorMotorBID = ?;

  // Joysticks
  public static int kDriveJoystickID  = 0;
  public static int kOperatorHoystickID = 1;

  // Driver turning gain
  public static double kDriverZJoystickGain= 0.7;

  // Pneumatics port constants
  public static int kHighGearSolenoid = 0;
  public static int kLowGearSolenoid = 1;
  public static int kPCM = 30;
}
