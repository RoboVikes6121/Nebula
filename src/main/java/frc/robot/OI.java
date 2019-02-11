/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.RocketLvl1Cargo;
import frc.robot.commands.RocketLvl2Cargo;
import frc.robot.commands.RocketLvl3Cargo;
import frc.robot.commands.RocketLvl1Hatch;
import frc.robot.commands.RocketLvl2Hatch;
import frc.robot.commands.RocketLvl3Hatch;
import frc.robot.commands.GrabCargoT;
import frc.robot.commands.ShootCargoT;
import frc.robot.commands.GrabHatchFloor;
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

  public static JoystickButton crl1Button;
  public static JoystickButton crl2Button;
  public static JoystickButton crl3Button;
  public static JoystickButton hrl1Button;
  public static JoystickButton hrl2Button;
  public static JoystickButton hrl3Button;
  public static JoystickButton grabCargoButton;
  public static JoystickButton shootCargoButton;
  public static JoystickButton grabHatchFloorButton;
  public static JoystickButton armsUpButton;
  public static JoystickButton deployArmsButton;
  public static JoystickButton retractArmsButton;
  public static JoystickButton shootHatchButton;
  public static JoystickButton operatorStopButton;
  public static JoystickButton elevatorUpButton;
  public static JoystickButton elevatorDownButton;
  public static JoystickButton driverStopButton;
  public static JoystickButton frontClimbButton;
  public static JoystickButton rearClimbButton;

  public OI() {

    driverJoystick = new Joystick(0);
    operatorJoystick = new Joystick(1);

    shootHatchButton = new JoystickButton(operatorJoystick, 1);
    shootHatchButton.whenPressed(new EjectHatch());

    operatorStopButton = new JoystickButton(operatorJoystick, 2);

    elevatorUpButton = new JoystickButton(operatorJoystick, 5);
    elevatorUpButton.whileHeld(new RaiseElevatorT());

    armsUpButton = new JoystickButton(operatorJoystick, 6);
    armsUpButton.whileHeld(new ArmsUp());

    shootCargoButton = new JoystickButton(operatorJoystick, 7);
    shootCargoButton.whileHeld(new ShootCargoT());

    grabCargoButton = new JoystickButton(operatorJoystick, 8);
    grabCargoButton.whileHeld(new GrabCargoT());

    grabHatchFloorButton = new JoystickButton(operatorJoystick, 9);
    grabHatchFloorButton.whileHeld(new GrabHatchFloor());

    elevatorDownButton = new JoystickButton(operatorJoystick, 10);
    elevatorDownButton.whileHeld(new LowerElevatorT());

    crl1Button = new JoystickButton(operatorJoystick, 11);
    crl1Button.whenPressed(new RocketLvl1Cargo());

    crl2Button = new JoystickButton(operatorJoystick, 12);
    crl2Button.whenPressed(new RocketLvl2Cargo());

    crl3Button = new JoystickButton(operatorJoystick, 13);
    crl3Button.whenPressed(new RocketLvl3Cargo());

    hrl3Button = new JoystickButton(operatorJoystick, 14);
    hrl3Button.whenPressed(new RocketLvl3Hatch());

    hrl2Button = new JoystickButton(operatorJoystick, 15);
    hrl2Button.whenPressed(new RocketLvl2Hatch());

    hrl1Button = new JoystickButton(operatorJoystick, 16);
    hrl1Button.whenPressed(new RocketLvl1Hatch());

    driverStopButton = new JoystickButton(driverJoystick, 2);

    frontClimbButton = new JoystickButton(driverJoystick, 5);
    frontClimbButton.toggleWhenPressed(new FrontClimb());

    rearClimbButton = new JoystickButton(driverJoystick, 6);
    rearClimbButton.toggleWhenPressed(new RearClimb());

  }
}
