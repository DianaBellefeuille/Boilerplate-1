/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Limelight.LimelightGetData;;


// Creates the Limelight system
public class Limelight extends Subsystem {

 // This method will set up the default settings of the elevator motor controllers
  public static void initDefaultSetup() {

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new LimelightGetData());
  }
}
