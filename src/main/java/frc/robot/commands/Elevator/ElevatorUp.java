package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;

public class ElevatorUp extends Command{

  public ElevatorUp() {
        requires(Robot.mElevator);
      }
    
      @Override
      protected void initialize() {
        Elevator.mElevatorMotorA.set(0);
        Elevator.mElevatorMotorB.set(0);
        setTimeout(1.0);
      }
    
      @Override
      protected void execute() {
        Elevator.ElevatorUp();
      }
    
      @Override
      protected boolean isFinished() {
        return isTimedOut();
      }
    
      @Override
      protected void end() {
        Elevator.mElevatorMotorA.set(0);
        Elevator.mElevatorMotorB.set(0);
      }
    
      @Override
      protected void interrupted() {
        end();
      }
    }
    
