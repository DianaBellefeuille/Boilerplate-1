package frc.robot.commands.Manipulators;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.OI;

public class WristChange extends Command{

   //public static WPI_TalonSRX mWristMotor = new WPI_TalonSRX(RobotMap.kWristMotorID);
   //double hallsensor = mWristMotor.getSelectedSensorPosition();

  boolean isFinished = true;
  
  public WristChange() {
        // Use requires() here to declare subsystem dependencies
      }
    
      @Override
      protected void initialize() {
      //   // mWristMotor.set(0);
       isFinished = false;
      }
    
      @Override
      protected void execute() {
      //   while (hallsensor != 0) {
      //     // mWristMotor.set(.1);
      //   }
      //   while (hallsensor == 0) {
      //     // mWristMotor.set(-.1);
      //   }
       isFinished = true;
      }

      @Override
      protected boolean isFinished() {
        return isFinished;
      }
    
      @Override
      protected void end() {
        // mWristMotor.set(0);
      }
    
      @Override
      protected void interrupted() {
      }
    }
    
