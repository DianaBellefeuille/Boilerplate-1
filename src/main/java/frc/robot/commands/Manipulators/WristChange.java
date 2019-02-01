package frc.robot.commands.Manipulators;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;

public class WristChange extends Command{

  // public static WPI_TalonSRX mWristMotor = new WPI_TalonSRX(RobotMap.kWristMotor);
  boolean isFinished = false;
  
  public WristChange() {
        // Use requires() here to declare subsystem dependencies
      }
    
      @Override
      protected void initialize() {
        
      }
    
      @Override
      protected void execute() {
      }

      @Override
      protected boolean isFinished() {
        return false;
      }
    
      @Override
      protected void end() {
      }
    
      @Override
      protected void interrupted() {
      }
    }
    
