package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.commands.Elevator.ElevatorJoystick;
// import edu.wpi.first.wpilibj.SpeedControllerGroup;
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

  public static WPI_TalonSRX mElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorAId);
  public static WPI_TalonSRX mElevatorMotorB = new WPI_TalonSRX(RobotMap.kElevatorMotorBId);

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Elevator.class);


public static void initDefaultSetup() {
    mElevatorMotorA.setNeutralMode(NeutralMode.Brake);
    mElevatorMotorB.setNeutralMode(NeutralMode.Brake);

    mElevatorMotorB.set(ControlMode.Follower, RobotMap.kElevatorMotorAId);
}

  // Elevator Down
  public void Down() {
    mElevatorMotorA.set(-0.2);
    mLogger.info("Elevator Down");
  }
  
  // Elevator Up
  public void Up() {
    mElevatorMotorA.set(0.2);
    mLogger.info("Elevator Up");
  }

  // Elevator OpenLoop
  public void OpenLoop(double xElevator) {
    mElevatorMotorA.set(xElevator);
    // mElevatorMotorB.set(xElevator);s
  }

  // public Elevator(WPI_TalonSRX ElevatorMotorA, WPI_TalonSRX ElevatorMotorB, SpeedControllerGroup ElevatorDrive) {
  //   mElevatorMotorA = ElevatorMotorA;
  //   mElevatorMotorB = ElevatorMotorB;

  //   mElevatorMotorA.setNeutralMode(NeutralMode.Coast);
  //   mElevatorMotorB.setNeutralMode(NeutralMode.Coast);

  //   // mElevatorMotorB.set(ControlMode.Follower, RobotMap.kElevatorMotorAId);

  //   mLogger.info("Elevator Created");
  // }

  // public static Elevator create() {
  //   WPI_TalonSRX ElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorAId);
  //   WPI_TalonSRX ElevatorMotorB  = new WPI_TalonSRX(RobotMap.kElevatorMotorBId);

  //   SpeedControllerGroup ElevatorDrive = new SpeedControllerGroup(ElevatorMotorA, ElevatorMotorB);

  //   return new Elevator(ElevatorMotorA, ElevatorMotorB, ElevatorDrive);
  // }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ElevatorJoystick());
  }
}
