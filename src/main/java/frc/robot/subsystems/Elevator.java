package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;


// Creates the Elevator system
public class Elevator extends Subsystem {

  // Map the motors to the TalonSRX's
   public static WPI_TalonSRX mElevatorMotorA  = new WPI_TalonSRX(RobotMap.kElevatorMotorAId);
   public static WPI_TalonSRX mElevatorMotorB  = new WPI_TalonSRX(RobotMap.kElevatorMotorBId);

  // public static WPI_TalonSRX mCargoMotor = new WPI_TalonSRX(RobotMap.kCargoMotorID);

 // This method will set up the default settings of the elevator motor controllers
  public static void initDefaultSetup() {

    // Set brake mode
     mElevatorMotorA.setNeutralMode(NeutralMode.Brake);
     mElevatorMotorB.setNeutralMode(NeutralMode.Brake);

     mElevatorMotorA.setInverted(true);
    // mElevatorMotorB.setInverted(true);
  }

  // This is the method for moving the elevator down
  public static void ElevatorDown() {
    mElevatorMotorA.setNeutralMode(NeutralMode.Coast);
    mElevatorMotorB.setNeutralMode(NeutralMode.Coast);

    mElevatorMotorA.set(-.1);
    mElevatorMotorB.set(-.1);
  }
  // This is the method for moving the elevator up
  public static void ElevatorUp() {
    mElevatorMotorA.set(.2);
    mElevatorMotorB.set(.2);
  }

  @Override
  public void initDefaultCommand() {
  }
}
