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

  public void elevatorUp() {
    RobotMap.elevatorMotor.set(.66);
  }

  public void elevatorDown() {
    RobotMap.elevatorMotor.set(-.66);
  }

  public void elevatorOff() {
    RobotMap.elevatorMotor.set(0);
  }

  public void cargoIntakeIn() {
      RobotMap.intakeMotor1.set(.5);
      RobotMap.intakeMotor2.set(-.5);
  }

  public void cargoIntakeOut() {
    RobotMap.intakeMotor1.set(-.5);
    RobotMap.intakeMotor2.set(.5);
  }

  public void cargoIntakeOff() {
    RobotMap.intakeMotor1.set(0);
    RobotMap.intakeMotor2.set(0);
  }

  public void pickUpHatch() {
    RobotMap.rotateMotor.set(.5);
  }

  public void bringArmsUp() {
    RobotMap.rotateMotor.set(-.5);
  }

  public void rotateMotorOff() {
    RobotMap.rotateMotor.set(0);
    System.out.println(RobotMap.rotationEncoder.get());
  }

  public void hatchEjection() {
    RobotMap.hatchSolenoid.set(true);
  }

  public void hatchSolenoidStop() {
    RobotMap.hatchSolenoid.set(false);
  }

}
