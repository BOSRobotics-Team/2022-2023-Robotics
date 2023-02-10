package frc.robot.subsystems.arm;

public final class ArmConstants {
  // PID coefficients
  public static final double armLiftKP = 0.1;
  public static final double armLiftKI = 0.0;
  public static final double armLiftKD = 0.0;
  public static final double armLiftKIZ = 0.0;
  public static final double armLiftKFF = 0.000156;
  public static final double armLiftMaxOutput = 0.15;
  public static final double armLiftMinOutput = -0.15;
  public static final double armLiftMaxRPM = 5700.0;
  public static final double armLiftMinPosition = 0.0;
  public static final double armLiftMaxPosition = 60.0;
  public static final double armLiftPosition0 = 10;
  public static final double armLiftPosition1 = 40;
  public static final double armLiftPosition2 = 50;

  public static final double armExtendKP = 0.2;
  public static final double armExtendKI = 0.0;
  public static final double armExtendKD = 0.0;
  public static final double armExtendKIZ = 0.0;
  public static final double armExtendKFF = 0.000156;
  public static final double armExtendMaxOutput = 0.5;
  public static final double armExtendMinOutput = -0.5;
  public static final double armExtendMaxRPM = 5700.0;
  public static final double armExtendMinPosition = 0.0;
  public static final double armExtendMaxPosition = 485.0;
  public static final double armExtendPosition0 = 50;
  public static final double armExtendPosition1 = 350;
  public static final double armExtendPosition2 = 485;
  public static final String armLiftProfile = "5.0:20.0,10.0:80.0,20.0:150.0,25.0:300.0,30.0:500.0";
}