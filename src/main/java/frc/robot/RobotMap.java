/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public class RobotMap {

  // Talon IDs for the drivetrain
  public static int kLeftLeaderId = 25;
  public static int kLeftFollerAId = 24;
  public static int kLeftFollwerBId   = 23;
  public static int kRightLeaderId = 10;
  public static int kRightFollowerAId = 11;
  public static int kRightFollowerBId  = 12;
  
  // public static int kCargoMotorID = ?;

   //public static int kWristMotorID = ?;

  public static int kElevatorMotorAId = 22;
  public static int kElevatorMotorBId = 21;

  // Joysticks
  public static int kDriveJoystickId  = 0;
  public static int kOperatorJoystickId = 1;

  // Driver turning gain
  public static double kDriverZJoystickGain= 0.7;

  // Pneumatics port constants
  public static int kHighGearSolenoId = 0;
  public static int kLowGearSolenoId = 1;
  public static int kPCMId = 30;
}
