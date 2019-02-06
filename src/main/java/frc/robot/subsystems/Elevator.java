package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Creates the elevator subsystem
public class Elevator extends Subsystem {

  // Motors
   private static WPI_TalonSRX mElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorAId);
   private static WPI_TalonSRX mElevatorMotorB  = new WPI_TalonSRX(RobotMap.kElevatorMotorBId);

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Drivetrain.class);

 // This method will set up the default settings of the elevator motor controllers
  public static void initDefaultSetup() {

    // Neutral Mode
     mElevatorMotorA.setNeutralMode(NeutralMode.Brake);
     mElevatorMotorB.setNeutralMode(NeutralMode.Brake);

     mElevatorMotorA.setInverted(true);
    // mElevatorMotorB.setInverted(true);
  }

  // Elevator Down
  public static void ElevatorDown() {
    mElevatorMotorA.set(-.1);
    mElevatorMotorB.set(-.1);
  }
  
  // Elevator Up
  public static void ElevatorUp() {
    mElevatorMotorA.set(.2);
    mElevatorMotorB.set(.2);
  }

  @Override
  public void initDefaultCommand() {
  }
}
