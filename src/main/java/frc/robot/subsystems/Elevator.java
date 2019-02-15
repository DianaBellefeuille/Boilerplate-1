package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.commands.Elevator.OpenLoop;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Creates the elevator subsystem
public class Elevator extends Subsystem {

  public enum SystemState {
    Autonomous,
    OpenLoop,
    Testing
  }

  private final WPI_TalonSRX mElevatorMotorA, mElevatorMotorB;

  private final SpeedControllerGroup mElevatorDrive;

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Elevator.class);

  // Elevator Down
  public void Down() {
    mElevatorMotorA.set(-0.2);
    mElevatorMotorB.set(-0.2);
    mLogger.info("Elevator Down");
  }
  
  // Elevator Up
  public void Up() {
    mElevatorMotorA.set(0.2);
    mElevatorMotorB.set(0.2);
    mLogger.info("Elevator Up");
  }

  // Elevator OpenLoop
  public void OpenLoop(double xElevator) {
    mElevatorDrive.set(xElevator);
  }

  public Elevator(WPI_TalonSRX ElevatorMotorA, WPI_TalonSRX ElevatorMotorB, SpeedControllerGroup ElevatorDrive) {
    mElevatorMotorA = ElevatorMotorA;
    mElevatorMotorB = ElevatorMotorB;

    mElevatorDrive = ElevatorDrive;

    mElevatorMotorA.setNeutralMode(NeutralMode.Brake);
    mElevatorMotorB.setNeutralMode(NeutralMode.Brake);

    mLogger.info("Elevator Created");
  }

  public static Elevator create() {
    WPI_TalonSRX ElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorAId);
    WPI_TalonSRX ElevatorMotorB  = new WPI_TalonSRX(RobotMap.kElevatorMotorBId);

    SpeedControllerGroup ElevatorDrive = new SpeedControllerGroup(ElevatorMotorA, ElevatorMotorB);

    return new Elevator(ElevatorMotorA, ElevatorMotorB, ElevatorDrive);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new OpenLoop());
  }
}
