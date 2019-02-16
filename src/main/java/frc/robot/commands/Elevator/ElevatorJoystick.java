package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElevatorJoystick extends Command {

  private final Logger mLogger = LoggerFactory.getLogger(ElevatorJoystick.class);

  public ElevatorJoystick() {
    requires(Robot.mElevator);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    // Get the joystick inputs
    double xElevator = -OI.operatorJoystick.getY();

    if (xElevator < 0.05 && xElevator > -0.05) {
      xElevator = 0.0;
    }

    // if (xElevator > 0.0 && xElevator < 1.0) {
    //   xElevator = xElevator * 0.4;
    // } else if (xElevator < 0.0 && xElevator > -1.0) {
    //   xElevator = xElevator * 0.2;
    // }

    if (xElevator > 1.0) {
      xElevator = 1.0;
      mLogger.info("Elevator speed counted over 1.0");
    } else if (xElevator < -1.0) {
      xElevator = -1.0;
      mLogger.info("Elevator speed counted under -1.0");
    }

    // if (xElevator > 1.0) {
    //   xElevator = 1.0;
    // } else if (xElevator < -1.0) {
    //   xElevator = -1.0;
    // }

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
