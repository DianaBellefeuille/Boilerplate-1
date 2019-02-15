package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

  // this joystick controls the drivetrain
  public static Joystick driverJoystick = new Joystick(RobotMap.kDriveJoystickId);
  // this joystick controls the elevator
  public static Joystick operatorJoystick = new Joystick(RobotMap.kOperatorJoystickId);
  
  // this shifts the drivetrain between low gear and high gear
  public Button mShift = new JoystickButton(driverJoystick, 1);

  public OI(){
    mShift.whenReleased(new Shift());
  }
}