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
import frc.robot.commands.Drivetrain.DriveJoystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid;


// Creates the drivetrain
public class Drivetrain extends Subsystem {

  // Map the CIM motors to the TalonSRX's
  public static WPI_TalonSRX mLeftFollowerA  = new WPI_TalonSRX(RobotMap.kLeftFollowerAID);
  public static WPI_TalonSRX mLeftFollowerB  = new WPI_TalonSRX(RobotMap.kLeftFollowerBID);
  public static WPI_TalonSRX mLeftLeader     = new WPI_TalonSRX(RobotMap.kLeftLeaderID);
  public static WPI_TalonSRX mRightFollowerB = new WPI_TalonSRX(RobotMap.kRightFollowerBID);
  public static WPI_VictorSPX mRightFollowerA = new WPI_VictorSPX(RobotMap.kRightFollowerAID);
  public static WPI_VictorSPX mRightLeader    = new WPI_VictorSPX(RobotMap.kRightLeaderID);

  // Add the motors to the speed controller groups and create the differential drivetrain
  public static SpeedControllerGroup leftDrive = new SpeedControllerGroup(mLeftLeader);
  public static SpeedControllerGroup rightDrive = new SpeedControllerGroup(mRightLeader);
  public static DifferentialDrive diffDrive = new DifferentialDrive(leftDrive, rightDrive);

  // Map the pneumatics for the drivetrain
  public static DoubleSolenoid m_Shifter = new DoubleSolenoid(RobotMap.kPCM, RobotMap.kHighGearSolenoid, RobotMap.kLowGearSolenoid);

 // This method will set up the default settings of the drivetrain motor controllers 
 
  public static void initDefaultSetup() {
    // Set the front and middle motors to be the followers of the rear motors
    mRightFollowerA.set(ControlMode.Follower, RobotMap.kRightLeaderID);
    mRightFollowerB.set(ControlMode.Follower, RobotMap.kRightLeaderID);
    mLeftFollowerA.set(ControlMode.Follower, RobotMap.kLeftLeaderID);
    mLeftFollowerB.set(ControlMode.Follower, RobotMap.kLeftLeaderID);

    // Set brake mode
    mLeftLeader.setNeutralMode(NeutralMode.Brake);
    mLeftFollowerA.setNeutralMode(NeutralMode.Brake);
    mLeftFollowerB.setNeutralMode(NeutralMode.Brake);
    mRightLeader.setNeutralMode(NeutralMode.Brake);
    mRightFollowerA.setNeutralMode(NeutralMode.Brake);
    mRightFollowerB.setNeutralMode(NeutralMode.Brake);

    diffDrive.setSafetyEnabled(false);

    // Set the solenoids
    m_Shifter.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoystick());
  }
}
