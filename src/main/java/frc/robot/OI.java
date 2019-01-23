/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;
import frc.robot.commands.Manipulators.CargoIntake;
import frc.robot.commands.Manipulators.CargoOutput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public static Joystick driverJoystick = new Joystick(RobotMap.DRIVER_JOYSTICK);
  public static Joystick operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK);
  
  public Button mShift = new JoystickButton(driverJoystick, 1);
  public Button mIntake = new JoystickButton(driverJoystick, 2);
  public Button mOutput = new JoystickButton(driverJoystick, 3);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
// }

  public OI(){
    mShift.whenReleased(new Shift());
    mIntake.whileHeld(new CargoIntake());
    mOutput.whileHeld(new CargoOutput());
  }
}