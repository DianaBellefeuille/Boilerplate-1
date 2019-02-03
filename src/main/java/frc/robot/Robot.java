/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.*;

public class Robot extends TimedRobot {
  public static Drivetrain m_drivetrain = new Drivetrain();
  public static Elevator m_elevator = new Elevator();
  public static OI m_oi;
  // public static Limelight m_limelight = new Limelight();

  @Override
  public void robotInit() {
    m_oi = new OI();
    // Create the slave motors and brake mode of the Drivetrain
    Drivetrain.initDefaultSetup();
    // Set the neutral mode of the Elevator
    Elevator.initDefaultSetup();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  // @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
