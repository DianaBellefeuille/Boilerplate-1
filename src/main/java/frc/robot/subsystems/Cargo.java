package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Creates the elevator subsystem
public class Cargo extends Subsystem {

  public enum SystemState {
    Autonomous,
    OpenLoop,
    Testing
  }

  WPI_TalonSRX mCargoMotor = new WPI_TalonSRX(RobotMap.kCargoMotorID);

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Cargo.class);

  public void initDefaultSetup() {
    mCargoMotor.setNeutralMode(NeutralMode.Coast);
  }

  public void CargoIntake() {
      mCargoMotor.set(.2);
  }

  public void CargoOutput() {
    mCargoMotor.set(-.2);
  }

  public void CargoStop() {
    mCargoMotor.set(0.0);
  }

//   public Cargo(WPI_TalonSRX cargomotor) {
  
//     mCargoMotor = cargomotor;
//     mCargoMotor.setNeutralMode(NeutralMode.Coast);
//     mLogger.info("Cargo Manipulator Created");
//   }

//   public static Cargo create() {
//     WPI_TalonSRX cargomotor  = new WPI_TalonSRX(RobotMap.kCargoMotorID);
//     return new Cargo(cargomotor);
//   }

  @Override
  public void initDefaultCommand() {
  }
}
