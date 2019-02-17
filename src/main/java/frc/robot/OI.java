package frc.robot;

import frc.robot.RobotMap;
import frc.robot.commands.Drivetrain.Shift;

import frc.robot.commands.Cargo.CargoPodOutput;
import frc.robot.commands.Cargo.CargoPodStop;
import frc.robot.commands.Cargo.CargoPodIntake;


// import frc.robot.commands.Wrist.WristDown;
// import frc.robot.commands.Wrist.WristUp;
// import frc.robot.commands.Wrist.WristStop;

import frc.robot.commands.PanelIntake.PanelIntakeShift;

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

  // private Button mWristUp = new JoystickButton(operatorJoystick, 3);
  // private Button mWristDown = new JoystickButton(operatorJoystick, 4);

  private Button mPanelShift = new JoystickButton(operatorJoystick, 5);

  // climber
  // right bumper deploys climber
  // right trigger spins climber wheels, moving the robot forward
  // pressing the bumper again raises the back side of the climber back up

  public OI(){

    mShift.whenPressed(new Shift());

    mPanelShift.whenPressed(new PanelIntakeShift());

    mCargoIn.whenPressed(new CargoPodIntake());
    mCargoOut.whenPressed(new CargoPodOutput());
    mCargoIn.whenReleased(new CargoPodStop());
    mCargoOut.whenReleased(new CargoPodStop());

    // mWristDown.whenPressed(new WristDown());
    // mWristUp.whenPressed(new WristUp());
    // mWristDown.whenReleased(new WristStop());
    // mWristUp.whenReleased(new WristStop());
  }
}