/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.RobotMap;
import frc.robot.commands.DriveJoystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/*
 * Creates the drivetrain
 */
public class Drivetrain extends Subsystem {

  // Map the CIM motors to the TalonSRX's
  public static WPI_VictorSPX frontLeft = new WPI_VictorSPX(RobotMap.DRIVETRAIN_FRONT_LEFT_MOTOR);
  public static WPI_VictorSPX midLeft = new WPI_VictorSPX(RobotMap.DRIVETRAIN_MIDDLE_LEFT_MOTOR);
  public static WPI_TalonSRX rearLeft = new WPI_TalonSRX(RobotMap.DRIVETRAIN_REAR_LEFT_MOTOR);
  public static WPI_VictorSPX frontRight = new WPI_VictorSPX(RobotMap.DRIVETRAIN_FRONT_RIGHT_MOTOR);
  public static WPI_VictorSPX midRight = new WPI_VictorSPX(RobotMap.DRIVETRAIN_MIDDLE_LEFT_MOTOR);
  public static WPI_TalonSRX rearRight = new WPI_TalonSRX(RobotMap.DRIVETRAIN_REAR_RIGHT_MOTOR);

  // Add the motors to the speed controller groups and create the differential drivetrain
  public static SpeedControllerGroup leftDrive = new SpeedControllerGroup(frontLeft, midLeft, rearLeft);
  public static SpeedControllerGroup rightDrive = new SpeedControllerGroup(frontRight, midRight, rearRight);
  public static DifferentialDrive diffDrive = new DifferentialDrive(leftDrive, rightDrive);

  // Map the pneumatics for the drivetrain
  public static DoubleSolenoid m_Shifter = new DoubleSolenoid(RobotMap.HIGH_GEAR_SOLENOID, RobotMap.LOW_GEAR_SOLENOID);

 // This method will set up the default settings of the motor controller  
 
  public static void initDefaultSetup() {
   // Set the front and middle motors to be the followers of the rear motors
   frontLeft.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_LEFT_MOTOR);
   frontRight.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_RIGHT_MOTOR);
   midLeft.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_LEFT_MOTOR);
   midRight.set(ControlMode.Follower, RobotMap.DRIVETRAIN_REAR_RIGHT_MOTOR);

   // Set brake mode
   rearLeft.setNeutralMode(NeutralMode.Brake);
   rearRight.setNeutralMode(NeutralMode.Brake);

   diffDrive.setSafetyEnabled(false);

  // Set the solenoids
  m_Shifter.set(DoubleSolenoid.Value.kForward);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoystick());
  }
}
