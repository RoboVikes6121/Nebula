/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ArmsSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void resetEncoder() {
    //RobotMap.rotationEncoder.reset();
  }

  public void lowerArms() {
    RobotMap.rotateMotor.set(-.75);
  }

  public void bringArmsUp() {
    RobotMap.rotateMotor.set(.75);
  }

  public void rotateMotorOff() {
    RobotMap.rotateMotor.set(0);
    System.out.println("This is using the get() method");
    System.out.println(RobotMap.rotationEncoder.get());
    System.out.println("This is using the getDistance() method");
    System.out.println(RobotMap.rotationEncoder.getDistance());
  }

  public void hatchPosition() {
    if (RobotMap.rotationEncoder.getDistance() % 1222.06734 < 10 || RobotMap.rotationEncoder.getDistance() % 1222.06734 > 23) {
      RobotMap.rotateMotor.set(.75);
    } else {
      RobotMap.rotateMotor.set(0);
    }
    //1222.06734      112.66797000000001
  }

  public void cargoPosition() {
    
  }

}
