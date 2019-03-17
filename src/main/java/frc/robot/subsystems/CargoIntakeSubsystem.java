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
public class CargoIntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void cargoIntakeIn() {
      RobotMap.intakeMotor1.set(.75);
      RobotMap.intakeMotor2.set(-.75);
  }

  public void cargoIntakeOut() {
    RobotMap.intakeMotor1.set(-.75);
    RobotMap.intakeMotor2.set(.75);
  }

  public void cargoIntakeOff() {
    RobotMap.intakeMotor1.set(0);
    RobotMap.intakeMotor2.set(0);
  }

}
