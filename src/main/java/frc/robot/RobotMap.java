/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static DifferentialDrive driveTrain;

  public static Victor elevatorMotor;
  public static Victor intakeMotor1;
  public static Victor intakeMotor2;
  public static Victor climbMotor;

  public static Solenoid hatchSolenoid1;
  public static Solenoid hatchSolenoid2;
  public static Solenoid hatchSolenoid3;
  public static DoubleSolenoid armSolenoid1;
  public static DoubleSolenoid armSolenoid2;
  public static DoubleSolenoid rotateSolenoid;

  public static void init() {

    WPI_TalonSRX leftMotor = new WPI_TalonSRX(1);
    WPI_TalonSRX rightMotor = new WPI_TalonSRX(0);

    WPI_TalonSRX leftSlave = new WPI_TalonSRX(3);
    WPI_TalonSRX rightSlave = new WPI_TalonSRX(2);

    driveTrain = new DifferentialDrive(leftMotor, rightMotor);

    leftSlave.follow(leftMotor);
    rightSlave.follow(rightMotor);

    elevatorMotor = new Victor(4);
    intakeMotor1 = new Victor(5);
    intakeMotor2 = new Victor(6);
    climbMotor = new Victor(7);

    hatchSolenoid1 = new Solenoid(0);
    hatchSolenoid2 = new Solenoid(1);
    hatchSolenoid3 = new Solenoid(2);
    armSolenoid1 = new DoubleSolenoid(3, 4);
    armSolenoid2 = new DoubleSolenoid(5, 6);
    rotateSolenoid = new DoubleSolenoid(7, 8);

  }
}
