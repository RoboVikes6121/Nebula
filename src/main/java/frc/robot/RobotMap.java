/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

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

  public static WPI_VictorSPX elevatorMotor;
  public static Victor intakeMotor1;
  public static Victor intakeMotor2;
  public static Victor rotateMotor;

  public static Solenoid hatchSolenoid;
  public static Solenoid frontClimbSolenoid;
  public static Solenoid rearClimbSolenoid;

  public static Gyro gyro;
  public static Counter rotationEncoder;

  public static void init() {

    WPI_TalonSRX leftMotor = new WPI_TalonSRX(1);
    WPI_TalonSRX rightMotor = new WPI_TalonSRX(0);

    WPI_TalonSRX leftSlave = new WPI_TalonSRX(3);
    WPI_TalonSRX rightSlave = new WPI_TalonSRX(2);

    driveTrain = new DifferentialDrive(leftMotor, rightMotor);

    leftSlave.follow(leftMotor);
    rightSlave.follow(rightMotor);

    elevatorMotor = new WPI_VictorSPX(4);
    rotateMotor = new Victor(0);
    intakeMotor1 = new Victor(1);
    intakeMotor2 = new Victor(2);

    hatchSolenoid = new Solenoid(0);
    frontClimbSolenoid = new Solenoid(1);
    rearClimbSolenoid = new Solenoid(2);

    gyro = new AnalogGyro(1);
    rotationEncoder = new Counter(new DigitalInput(3));

  }
}
