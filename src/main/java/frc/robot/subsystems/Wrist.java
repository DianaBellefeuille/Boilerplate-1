package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.commands.Wrist.WristJoystick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Creates the elevator subsystem
public class Wrist extends Subsystem {

  public enum SystemState {
    Autonomous,
    OpenLoop,
    Testing
  }

  public static WPI_TalonSRX mWristMotor = new WPI_TalonSRX(RobotMap.kWristMotorID);

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Wrist.class);

  public static void initDefaultSetup() {
    mWristMotor.setNeutralMode(NeutralMode.Brake);
  }

  // public void WristUp() {
  //   mWristMotor.set(.5);
  //   mLogger.info("UP");
  // }

  // public void WristDown() {
  //   mWristMotor.set(-.5);
  //   mLogger.info("DOWN");
  // }

  public void WristStop() {
    mWristMotor.set(0.0);
    mLogger.info("STOP");
  }

  public void OpenLoop(double xWrist) {
    mWristMotor.set(xWrist);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new WristJoystick());
  }
}
