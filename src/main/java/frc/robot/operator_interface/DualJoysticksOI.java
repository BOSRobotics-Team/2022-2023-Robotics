package frc.robot.operator_interface;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants;

/** Class for controlling the robot with two Xbox controllers. */
public class DualJoysticksOI implements OperatorInterface {
  private final CommandJoystick translateJoystick;
  private final CommandJoystick rotateJoystick;
  private final Trigger[] translateJoystickButtons;
  private final Trigger[] rotateJoystickButtons;
  protected boolean tests[][] = new boolean[3][20];

  public DualJoysticksOI(int translatePort, int rotatePort) {
    translateJoystick = new CommandJoystick(translatePort);
    rotateJoystick = new CommandJoystick(rotatePort);

    // buttons use 1-based indexing such that the index matches the button number; leave index 0 set
    // to null
    this.translateJoystickButtons = new Trigger[13];
    this.rotateJoystickButtons = new Trigger[13];

    for (int i = 1; i < translateJoystickButtons.length; i++) {
      translateJoystickButtons[i] = translateJoystick.button(i);
      rotateJoystickButtons[i] = rotateJoystick.button(i);
    }
  }

  public void testController(CommandJoystick contrl, boolean[] test) {
    for (int testNum = 0; testNum < test.length; ++testNum) {
      if (!test[testNum]) {
        switch (testNum) {
          case 0:
            test[testNum] = MathUtil.applyDeadband(contrl.getY(), Constants.STICK_DEADBAND) > 0.0;
            break;
          case 1:
            test[testNum] = MathUtil.applyDeadband(contrl.getX(), Constants.STICK_DEADBAND) > 0.0;
            break;
          case 2:
            test[testNum] = MathUtil.applyDeadband(contrl.getTwist(), Constants.STICK_DEADBAND) > 0.0;
            break;
          case 3:
            test[testNum] = MathUtil.applyDeadband(contrl.getThrottle(), Constants.STICK_DEADBAND) > 0.0;
            break;
          case 4:
            test[testNum] = contrl.button(0).getAsBoolean();
            break;
          case 5:
            test[testNum] = contrl.button(1).getAsBoolean();
            break;
          case 6:
            test[testNum] = contrl.button(2).getAsBoolean();
            break;
          case 7:
            test[testNum] = contrl.button(3).getAsBoolean();
            break;
          case 8:
            test[testNum] = contrl.button(4).getAsBoolean();
            break;
          case 9:
            test[testNum] = contrl.button(5).getAsBoolean();
            break;
          default:
            test[testNum] = true;
            break;
        }
      }
    }
  }

  @Override
  public void testOI(int mode) {
    for (int testNum = 0; testNum < tests[mode].length; ++testNum) {
      if (mode == DRIVER) {
        tests[0][testNum] = false;
        tests[1][testNum] = false;
      } else if (mode == OPERATOR) {
        tests[2][testNum] = false;
      }
    }
  }

  @Override
  public boolean testResults(int mode) {
    boolean result = true;
    if (mode == DRIVER) {
      testController(translateJoystick, tests[0]);
      testController(rotateJoystick, tests[1]);

      for (boolean test : tests[0]) {
        result = result && test;
      }
      for (boolean test : tests[1]) {
        result = result && test;
      }
    }
    return result;
  }

  @Override
  public double getTranslateX() {
    return -translateJoystick.getY();
  }

  @Override
  public double getTranslateY() {
    return -translateJoystick.getX();
  }

  @Override
  public double getRotate() {
    return -rotateJoystick.getX();
  }

  @Override
  public double getDriveScaling() {
    return translateJoystick.getThrottle();
  }

  @Override
  public double getRotateScaling() {
    return rotateJoystick.getThrottle();
  }

  @Override
  public Trigger getRobotRelative() {
    return translateJoystickButtons[3];
  }

  @Override
  public Trigger getResetGyroButton() {
    return rotateJoystickButtons[3];
  }

  @Override
  public Trigger getXStanceButton() {
    return translateJoystickButtons[1];
  }
}
