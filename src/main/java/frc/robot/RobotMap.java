package frc.robot;

public class RobotMap {

  // Talon IDs for the drivetrain
  public static int kLeftLeaderId = 25;
  public static int kLeftFollerAId = 24;
  public static int kLeftFollwerBId   = 23;
  public static int kRightLeaderId = 10;
  public static int kRightFollowerAId = 11;
  public static int kRightFollowerBId  = 12;

  // Talon IDs for the elevator
  public static int kElevatorMotorAId = 22;
  public static int kElevatorMotorBId = 21;

  // Talon IDs for the manipulators
  public static int kCargoMotorID = 14;
  public static int kWristMotorID = 13;

  // Joysticks
  public static int kDriveJoystickId  = 0;
  public static int kOperatorJoystickId = 1;
  public static double kJoystickDeadband = 0.05;

  // Driver turning gain
  public static double kDriverZJoystickGain= -0.7;

  // Pneumatics port constants
  public static int kHighGearSolenoid = 0;
  public static int kLowGearSolenoid = 1;
  public static int kPCMId = 30;
}
