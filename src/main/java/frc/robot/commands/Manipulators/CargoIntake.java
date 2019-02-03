package frc.robot.commands.Manipulators;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.subsystems.Elevator;

public class CargoIntake extends Command{
  
  public CargoIntake() {
        // Use requires() here to declare subsystem dependencies
      }
    
      @Override
      protected void initialize() {
        // Elevator.mCargoMotor.set(0);
      }
    
      @Override
      protected void execute() {
        // Elevator.mCargoMotor.set(.2);
      }
    
      @Override
      protected boolean isFinished() {
        return false;
      }
    
      @Override
      protected void end() {
       //  Elevator.mCargoMotor.set(0);
      }
    
      @Override
      protected void interrupted() {
      }
    }
    
