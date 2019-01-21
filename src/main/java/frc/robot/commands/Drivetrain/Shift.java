package frc.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

public class Shift extends Command{
    public Shift() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_subsystem);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {
      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        // if (self.robot.DrivePneumatics.solenoid.get() == DoubleSolenoid.Value.kForward)
        //     {self.robot.DrivePneumatics.solenoid.set(DoubleSolenoid.Value.kReverse;)}
        // else(self.robot.intakePneumatics.solenoid.set(DoubleSolenoid.Value.kForward);
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      protected boolean isFinished() {
        return false;
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
    
