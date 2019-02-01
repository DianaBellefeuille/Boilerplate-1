package frc.robot.commands.Limelight;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

// A command for practicing translating data recieved from the limelight into 
public class LimelightDataStream extends Command{

  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  Double tx;
  Double tv;

  public LimelightDataStream() {
        // Use requires() here to declare subsystem dependencies
        // requires(Robot.m_limelight);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {
      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        tx = table.getEntry("tx").getDouble(0.0);
        tv = table.getEntry("tv").getDouble(0.0);
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
    
