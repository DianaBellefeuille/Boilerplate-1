package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;

public class ElevatorDown extends Command{

  public ElevatorDown() {
        requires(Robot.mElevator);
      }
    
      @Override
      protected void initialize() {
        setTimeout(1.0);
      }
    
      @Override
      protected void execute() {
        Elevator.ElevatorDown();
      }
    
      @Override
      protected boolean isFinished() {
        return isTimedOut();
      }
    
      @Override
      protected void end() {
      }
    
      @Override
      protected void interrupted() {
        end();
      }
    }
    
