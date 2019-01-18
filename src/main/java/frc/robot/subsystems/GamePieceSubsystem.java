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
public class GamePieceSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void raiseElevator(double s) {
    RobotMap.elevatorMotor.set(s);
  }

  public void lowerElevator(double s) {
    RobotMap.elevatorMotor.set(s);
  }

  public void cargoIntake(double s) {
    RobotMap.intakeMotor1.set(s);
    RobotMap.intakeMotor2.set(-s);
  }

  public void placeCargo(double s) {
    RobotMap.intakeMotor1.set(s);
    RobotMap.intakeMotor2.set(-s);
  }
}
