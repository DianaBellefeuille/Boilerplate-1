package frc.robot.commands.Manipulators;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;

public class CargoIntake extends Command{

  public static WPI_TalonSRX mCargoIntakeMotor = new WPI_TalonSRX(RobotMap.kCargoIntakeMotor);
  
  public CargoIntake() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_subsystem);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {
        mCargoIntakeMotor.set(0);
      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        mCargoIntakeMotor.set(.5);
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      protected boolean isFinished() {
        return false;
      }
    
      // Called once after isFinished returns true
      @Override
      protected void end() {
        mCargoIntakeMotor.set(0);
      }
    
      // Called when another command which requires one or more of the same
      // subsystems is scheduled to run
      @Override
      protected void interrupted() {
      }
    }
    
