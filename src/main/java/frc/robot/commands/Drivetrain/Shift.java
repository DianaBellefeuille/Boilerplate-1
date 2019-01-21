package frc.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.DriverStation;

public class Shift extends Command{

  public boolean mIsFinished = true;
  
  public Shift() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_subsystem);
        DriverStation.reportError("Constructed Shift command", true);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {
        mIsFinished = false;
        DriverStation.reportError("Command called", true);
      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        if (Drivetrain.m_Shifter.get() == DoubleSolenoid.Value.kForward) {
            Drivetrain.m_Shifter.set(DoubleSolenoid.Value.kReverse);
        } else {
          Drivetrain.m_Shifter.set(DoubleSolenoid.Value.kForward);
        }
        mIsFinished = true;
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      protected boolean isFinished() {
        return mIsFinished;
      }
    
      // Called once after isFinished returns true
      @Override
      protected void end() {
      }
    
      // Called when another command which requires one or more of the same
      // subsystems is scheduled to run
      @Override
      protected void interrupted() {
      }
    }
    
