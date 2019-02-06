package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;
import frc.robot.commands.Elevator.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

  public static Joystick driverJoystick = new Joystick(RobotMap.kDriveJoystickId);
  public static Joystick operatorJoystick = new Joystick(RobotMap.kOperatorJoystickId);
  
  public Button mShift = new JoystickButton(driverJoystick, 1);

  public Button mElevatorUp = new JoystickButton(driverJoystick, 2);
  public Button mElevatorDown = new JoystickButton(driverJoystick, 3);

  public OI(){
    mShift.whenReleased(new Shift());

   // mElevatorUp.whileHeld(new ElevatorUp());
   // mElevatorDown.whileHeld(new ElevatorDown());
  }
}