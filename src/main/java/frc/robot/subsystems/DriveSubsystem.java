/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotMap;
//import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  double rotateToAngleRate;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDrive());
  }

  public void arcadeDrive(Joystick stick) {
    double move = stick.getRawAxis(1) * .8;
    double turn = stick.getRawAxis(4) * .8;
    RobotMap.driveTrain.arcadeDrive(move, turn);
  }

  public void drive(double m) {
    /*double target;
    double t;
    synchronized (Robot.imgLock) {
      target = Robot.target;
    }
    double turn = target - (Robot.IMG_WIDTH / 2);
    if (turn > 10) {
      t = .25;
    } else if (turn < -10) {
      t = -.25
    }
    RobotMap.driveTrain.arcadeDrive(m, t);*/
  }

  public void stopDriving() {
    RobotMap.driveTrain.arcadeDrive(0, 0);
  }

}
