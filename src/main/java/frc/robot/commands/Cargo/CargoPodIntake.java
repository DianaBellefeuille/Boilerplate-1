package frc.robot.commands.Cargo;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CargoPodIntake extends Command {

  private final Logger mLogger = LoggerFactory.getLogger(CargoPodIntake.class);

  public CargoPodIntake() {
    requires(Robot.mCargo);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.mCargo.CargoIntake();
  }

  @Override
  protected boolean isFinished() {
    return true;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
