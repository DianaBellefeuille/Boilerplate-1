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
  public static WPI_VictorSPX mLeftFollowerA = new WPI_VictorSPX(RobotMap.kLeftFollowerA);
  public static WPI_VictorSPX mLeftFollowerB = new WPI_VictorSPX(RobotMap.kLeftFollowerB);
  public static WPI_TalonSRX mLeftLeader = new WPI_TalonSRX(RobotMap.kLeftLeader);
  public static WPI_VictorSPX mRightFollowerB = new WPI_VictorSPX(RobotMap.kRightFollowerB);
  public static WPI_VictorSPX mRightFollowerA= new WPI_VictorSPX(RobotMap.kRightFollowerA);
  public static WPI_TalonSRX mRightLeader = new WPI_TalonSRX(RobotMap.kRightLeader);

  // Add the motors to the speed controller groups and create the differential drivetrain
  public static SpeedControllerGroup leftDrive = new SpeedControllerGroup(mLeftLeader);
  public static SpeedControllerGroup rightDrive = new SpeedControllerGroup(mRightLeader);
  public static DifferentialDrive diffDrive = new DifferentialDrive(leftDrive, rightDrive);

  // Map the pneumatics for the drivetrain
  //public static DoubleSolenoid m_Shifter = new DoubleSolenoid(RobotMap.PCM, RobotMap.HIGH_GEAR_SOLENOID, RobotMap.LOW_GEAR_SOLENOID);

 // This method will set up the default settings of the motor controller  
 
  public static void initDefaultSetup() {
   // Set the front and middle motors to be the followers of the rear motors
   mRightFollowerA.set(ControlMode.Follower, RobotMap.kRightLeader);
   mRightFollowerB.set(ControlMode.Follower, RobotMap.kRightLeader);
   mLeftFollowerA.set(ControlMode.Follower, RobotMap.kLeftLeader);
   mLeftFollowerB.set(ControlMode.Follower, RobotMap.kLeftLeader);

   // Set brake mode

   mLeftLeader.setNeutralMode(NeutralMode.Coast);
   mLeftFollowerA.setNeutralMode(NeutralMode.Coast);
   mLeftFollowerB.setNeutralMode(NeutralMode.Coast);
   mRightLeader.setNeutralMode(NeutralMode.Coast);
   mRightFollowerA.setNeutralMode(NeutralMode.Coast);
   mRightFollowerB.setNeutralMode(NeutralMode.Coast);
   
   diffDrive.setSafetyEnabled(false);

  // Set the solenoids
  //m_Shifter.set(DoubleSolenoid.Value.kReverse);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoystick());
  }
}
