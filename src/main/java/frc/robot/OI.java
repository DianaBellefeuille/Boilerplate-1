package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;

import frc.robot.commands.Cargo.CargoPodOutput;
import frc.robot.commands.Cargo.CargoPodStop;
import frc.robot.commands.Cargo.CargoPodIntake;

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

  private Button mCargoIn = new JoystickButton(operatorJoystick, 1);
  private Button mCargoOut = new JoystickButton(operatorJoystick, 2);

  public OI(){
    mShift.whenPressed(new Shift());
   
    mCargoIn.whenPressed(new CargoPodIntake());
    mCargoOut.whenPressed(new CargoPodOutput());

    mCargoIn.whenReleased(new CargoPodStop());
    mCargoOut.whenReleased(new CargoPodStop());
  }
}