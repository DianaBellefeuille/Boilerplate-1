/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/*
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // Talon IDs for the drivetrain
  public static int kLeftLeader = 10;
  public static int kLeftFollowerA = 11;
  public static int kLeftFollowerB   = 12;
  public static int kRightLeader = 25;
  public static int kRightFollowerA = 24;
  public static int kRightFollowerB  = 23;
  
  // public static int kCargoMotor = ?;

  // public static int kElevatorMotorA = ?;
  // public static int kElevatorMotorB = ?;

  // Joysticks
  public static int DRIVER_JOYSTICK   = 0;
  public static int OPERATOR_JOYSTICK = 1;

  // Driver turning gain
  public static double DRIVER_Z_ROTATION_GAIN = 0.7;

  // Pneumatics port constants
  public static int HIGH_GEAR_SOLENOID = 0;
  public static int LOW_GEAR_SOLENOID = 1;
  public static int PCM = 30;
}
