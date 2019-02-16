package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Creates the elevator subsystem
public class Panel extends Subsystem {

  public enum SystemState {
    Autonomous,
    OpenLoop,
    Testing
  }

  private static DoubleSolenoid mPanelShifter = new DoubleSolenoid(RobotMap.kPCMId, RobotMap.kHighGearSolenoid , RobotMap.kLowGearSolenoid);

  private boolean mPanelClosed;

  // Logger
  private final Logger mLogger = LoggerFactory.getLogger(Panel.class);

  public void initDefaultSetup() {
      mPanelShifter.set(DoubleSolenoid.Value.kReverse);
      mLogger.info("Panel Intake subsystem created");
  }

  /**
   Shifts the panel intake to the opposite position (i.e, if currently open will close)
   **/
  public void shiftPanelIntake(boolean wantsPanelClosed) {
    if (wantsPanelClosed == true) {
      mPanelShifter.set(DoubleSolenoid.Value.kForward);
      mPanelClosed = true;
    } else if (wantsPanelClosed == false) {
      mPanelShifter.set(DoubleSolenoid.Value.kReverse);
      mPanelClosed = false;
    }
    mLogger.info("Panel shifted");
   }

 public boolean isPanelClosed() {
   return mPanelClosed;
 }

// //   public Panel(DoubleSolenoid PanelShifter) {
// //     mPanelShifter = PanelShifter;
// //     mPanelShifter.set(DoubleSolenoid.Value.kReverse);
// //     mPanelClosed = false;

// //     mLogger.info("Panel Manipulator Created");
// //   }

// //   public static Panel create() {
// //     DoubleSolenoid PanelShifter = new DoubleSolenoid(RobotMap.kPCMId, RobotMap.kHighGearSolenoid, RobotMap.kLowGearSolenoid);

// //     return new Panel(PanelShifter);
// //   }

  @Override
  public void initDefaultCommand() {
  }
}
