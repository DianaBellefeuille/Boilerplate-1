package frc.robot.commands.Limelight;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// A command for practicing translating data recieved from the limelight into 
public class LimelightSeeking extends Command{

  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  NetworkTableEntry tx = table.getEntry("tx");

  public LimelightSeeking() {
        // Use requires() here to declare subsystem dependencies
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {

      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
          
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
    
