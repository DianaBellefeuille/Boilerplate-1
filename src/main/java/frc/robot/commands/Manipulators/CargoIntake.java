package frc.robot.commands.Manipulators;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;

public class CargoIntake extends Command{

  // public static WPI_TalonSRX mCargoMotor = new WPI_TalonSRX(RobotMap.kCargoMotorID);
  
  public CargoIntake() {
        // Use requires() here to declare subsystem dependencies
      }
    
      @Override
      protected void initialize() {
        // mCargoMotor.set(0);
      }
    
      @Override
      protected void execute() {
        // mCargoMotor.set(.5);
      }
    
      @Override
      protected boolean isFinished() {
        return false;
      }
    
      @Override
      protected void end() {
        // mCargoMotor.set(0);
      }
    
      @Override
      protected void interrupted() {
      }
    }
    
