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
  // Drivetrain
  public static int DRIVETRAIN_REAR_LEFT_MOTOR  = 10;
  public static int DRIVETRAIN_MIDDLE_LEFT_MOTOR = 1;
  public static int DRIVETRAIN_FRONT_LEFT_MOTOR   = 2;
  public static int DRIVETRAIN_REAR_RIGHT_MOTOR = 15;
  public static int DRIVETRAIN_MIDDLE_RIGHT_MOTOR = 14;
  public static int DRIVETRAIN_FRONT_RIGHT_MOTOR  = 13;

  // Joysticks
  public static int DRIVER_JOYSTICK   = 0;
  public static int OPERATOR_JOYSTICK = 1;

  // Driver turning gain
  public static double DRIVER_Z_ROTATION_GAIN = 0.7;

  // Pneumatics port constants
  public static int HIGH_GEAR_SOLENOID = 0;
  public static int LOW_GEAR_SOLENOID = 1;
}
