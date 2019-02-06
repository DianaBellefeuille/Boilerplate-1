package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

  public static Joystick driverJoystick = new Joystick(RobotMap.kDriveJoystickId);
  public static Joystick operatorJoystick = new Joystick(RobotMap.kOperatorJoystickId);
  
  public Button mShift = new JoystickButton(driverJoystick, 1);

  public OI(){
    mShift.whenReleased(new Shift());
  }
}