package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.subsystems.Elevator;

public class ElevatorDown extends Command{

  
  public ElevatorDown() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_elevator);
      }
    
      // Called just before this Command runs the first time
      @Override
      protected void initialize() {
      //  Elevator.mElevatorMotorA.set(0);
      //  Elevator.mElevatorMotorB.set(0);
      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        // Depends on how we want it to work. Likely will be:
          // Elevator.mElevatorMotorA.set(-.5);
          // Elevator.mElevatorMotorB.set(-.5);
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      protected boolean isFinished() {
        return false;
      }
    
      // Called once after isFinished returns true
      @Override
      protected void end() {
      //  Elevator.mElevatorMotorA.set(0);
      //  Elevator.mElevatorMotorB.set(0);
      }
    
      // Called when another command which requires one or more of the same
      // subsystems is scheduled to run
      @Override
      protected void interrupted() {
      }
    }
    
