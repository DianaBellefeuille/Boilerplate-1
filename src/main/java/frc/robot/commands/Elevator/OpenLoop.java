package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;

public class OpenLoop extends Command {

  public OpenLoop() {
    requires(Robot.mElevator);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    // Get the joystick inputs
    double xElevator = OI.operatorJoystick.getY();

    if (xElevator < 0.05 && xElevator > -0.05) {
      xElevator = 0.0;
    }

    if (xElevator > 0.0 && xElevator < 1.0) {
      xElevator = xElevator * 0.3;
    } else if (xElevator < 0.0 && xElevator > -1.0) {
      xElevator = xElevator * 0.1;
    }

    Robot.mElevator.OpenLoop(xElevator);
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
