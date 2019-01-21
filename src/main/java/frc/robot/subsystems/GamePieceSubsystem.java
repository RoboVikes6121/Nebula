/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * Add your docs here.
 */
public class GamePieceSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_VictorSPX inMotor1 = RobotMap.intakeMotor1;
  WPI_VictorSPX inMotor2 = RobotMap.intakeMotor2;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void elevator(double s) {
    RobotMap.elevatorMotor.set(s);
  }

  public void cargoIntake(double s) {
    if (RobotMap.limitSwitch.get()) {
      RobotMap.intakeMotor1.set(s);
      RobotMap.intakeMotor2.set(-s);
    } else {
      RobotMap.intakeMotor1.set(0);
      RobotMap.intakeMotor2.set(0);

      /* WPI_VictorSPX inMotor1 = new WPI_VictorSPX(4);
      WPI_VictorSPX inMotor2 = new WPI_VictorSPX(5);
      if (RobotMap.limitSwitch.get()) {
        inMotor1.set(s);
        inMotor2.set(-s);
      } else {
        inMotor1.set(0);
        inMotor2.set(0);*/
    }
  }

  public void hatchEjection() {
    RobotMap.hatchSolenoid1.set(true);
  }

  public void hatchSolenoidStop() {
    RobotMap.hatchSolenoid1.set(false);
  }

  public void deployArms() {
    RobotMap.armSolenoid1.set(DoubleSolenoid.Value.kForward);
    RobotMap.armSolenoid2.set(DoubleSolenoid.Value.kForward);
  }

  public void retractArms() {
    RobotMap.armSolenoid1.set(DoubleSolenoid.Value.kReverse);
    RobotMap.armSolenoid2.set(DoubleSolenoid.Value.kReverse);
  }

  public void armSolenoidsOff() {
    RobotMap.armSolenoid1.set(DoubleSolenoid.Value.kOff);
    RobotMap.armSolenoid2.set(DoubleSolenoid.Value.kOff);
  }

  public void pickUpHatch() {
    RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void bringArmsUp() {
    RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void rotateSolenoidOff() {
    RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kOff);
  } 
}
