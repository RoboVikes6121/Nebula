/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.GrabCargo;
import frc.robot.commands.ShootCargo;
import frc.robot.commands.ArmsDown;
import frc.robot.commands.ArmsUp;
import frc.robot.commands.EjectHatch;
import frc.robot.commands.RaiseElevatorT;
import frc.robot.commands.LowerElevatorT;
import frc.robot.commands.FrontClimb;
import frc.robot.commands.RearClimb;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public static Joystick driverJoystick;
  public static Joystick operatorJoystick;

  public static JoystickButton grabCargoButton;
  public static JoystickButton shootCargoButton;
  public static JoystickButton grabHatchFloorButton;
  public static JoystickButton armsUpButton;
  public static JoystickButton shootHatchButton;
  public static JoystickButton elevatorUpButton;
  public static JoystickButton elevatorDownButton;
  public static JoystickButton frontClimbButton;
  public static JoystickButton rearClimbButton;
  public static JoystickButton armsRSButton;
  public static JoystickButton armsLSButton;

  public OI() {

    driverJoystick = new Joystick(0);
    operatorJoystick = new Joystick(1);

    shootHatchButton = new JoystickButton(operatorJoystick, 1);
    shootHatchButton.toggleWhenPressed(new EjectHatch());

    rearClimbButton = new JoystickButton(operatorJoystick, 2);
    rearClimbButton.whileHeld(new RearClimb());

    grabHatchFloorButton = new JoystickButton(operatorJoystick, 3);
    grabHatchFloorButton.whileHeld(new ArmsDown(-.6));

    armsUpButton = new JoystickButton(operatorJoystick, 4);
    armsUpButton.whileHeld(new ArmsUp(.6));

    elevatorUpButton = new JoystickButton(operatorJoystick, 5);
    elevatorUpButton.whileHeld(new RaiseElevatorT());

    armsRSButton = new JoystickButton(operatorJoystick, 6);
    armsRSButton.whileHeld(new ArmsUp(.3));

    shootCargoButton = new JoystickButton(operatorJoystick, 7);
    shootCargoButton.whileHeld(new ShootCargo());

    grabCargoButton = new JoystickButton(operatorJoystick, 8);
    grabCargoButton.whileHeld(new GrabCargo());

    armsLSButton = new JoystickButton(operatorJoystick, 9);
    armsLSButton.whileHeld(new ArmsDown(-.3));

    elevatorDownButton = new JoystickButton(operatorJoystick, 10);
    elevatorDownButton.whileHeld(new LowerElevatorT());

    frontClimbButton = new JoystickButton(driverJoystick, 5);
    frontClimbButton.whileHeld(new FrontClimb());

  }
}
