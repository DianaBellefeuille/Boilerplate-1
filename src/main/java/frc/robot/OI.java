/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;
import frc.robot.commands.Manipulators.*;
import frc.robot.commands.Elevator.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

  public static Joystick driverJoystick = new Joystick(RobotMap.kDriveJoystickID);
  public static Joystick operatorJoystick = new Joystick(RobotMap.kOperatorHoystickID);
  
  public Button mShift = new JoystickButton(driverJoystick, 1);

  public Button mWristChange = new JoystickButton(driverJoystick, 2);

  public Button mIntake = new JoystickButton(driverJoystick, 3);
  public Button mOutput = new JoystickButton(driverJoystick, 4);

  public Button mElevatorUp = new JoystickButton(driverJoystick, 5);
  public Button mElevatorDown = new JoystickButton(driverJoystick, 6);

  public Button mLimelight = new JoystickButton(driverJoystick, 7);

  public OI(){
    mShift.whenReleased(new Shift());

    mWristChange.whenPressed(new WristChange());

    mIntake.whileHeld(new CargoIntake());
    mOutput.whileHeld(new CargoOutput());

    mElevatorUp.whileHeld(new ElevatorUp());
    mElevatorDown.whileHeld(new ElevatorDown());
  }
}