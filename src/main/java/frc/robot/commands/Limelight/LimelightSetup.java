package frc.robot.commands.Limelight;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LimelightSetup extends Command{

    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");
    NetworkTableEntry ty = table.getEntry("ty");
    NetworkTableEntry ta = table.getEntry("ta");


  public LimelightSetup() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_limelight);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {

      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
          //read values periodically
            double x = tx.getDouble(0.0);
            double y = ty.getDouble(0.0);
            double area = ta.getDouble(0.0);

            //post to smart dashboard periodically
            // SmartDashboard.putNumber("LimelightX", x); 
            // SmartDashboard.putNumber("LimelightY", y);
            // SmartDashboard.putNumber("LimelightArea", area);
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
    
