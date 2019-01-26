/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;


// Creates the Elevator system
public class Elevator extends Subsystem {

  // Map the ??? motors to the TalonSRX's
  public static WPI_TalonSRX mElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorA);
  public static WPI_TalonSRX mElevatorMotorB  = new WPI_TalonSRX(RobotMap.kElevatorMotorB);

  // Add the motors to a speed controller
  public static SpeedControllerGroup mElevatorMotorGroup = new SpeedControllerGroup(mElevatorMotorA, mElevatorMotorB);

 // This method will set up the default settings of the elevator motor controllers
  public static void initDefaultSetup() {

    // Set brake mode
    mElevatorMotorA.setNeutralMode(NeutralMode.Brake);
    mElevatorMotorB.setNeutralMode(NeutralMode.Brake);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
