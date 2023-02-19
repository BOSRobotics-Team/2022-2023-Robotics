package frc.robot.subsystems.arm;

public final class ArmConstants {
  // PID coefficients
  public static final double armLiftKP = 0.1;
  public static final double armLiftKI = 0.0;
  public static final double armLiftKD = 0.0;
  public static final double armLiftKIZ = 0.0;
  public static final double armLiftKFF = 0.000156;
  public static final double armLiftMaxOutput = 0.4;
  public static final double armLiftMinOutput = -0.4;
  public static final double armLiftMaxRPM = 5700.0;
  public static final double armLiftMinPosition = 0.0;
  public static final double armLiftMaxPosition = 240.0;
  public static final double armLiftPosition0 = 0;
  public static final double armLiftPosition1 = 72;
  public static final double armLiftPosition2 = 200;
  public static final double armLiftPosition3 = 228;

  public static final double armExtendKP = 0.2;
  public static final double armExtendKI = 0.0;
  public static final double armExtendKD = 0.0;
  public static final double armExtendKIZ = 0.0;
  public static final double armExtendKFF = 0.000156;
  public static final double armExtendMaxOutput = 0.85;
  public static final double armExtendMinOutput = -0.85;
  public static final double armExtendMaxRPM = 5700.0;
  public static final double armExtendMinPosition = 0.0;
  public static final double armExtendMaxPosition = 500.0;
  public static final double armExtendPosition0 = 0;
  public static final double armExtendPosition1 = 50;
  public static final double armExtendPosition2 = 80;
  public static final double armExtendPosition3 = 495;

  public static final double[][] armLiftProfile = {{ 8.0, 92.0 },
                                                    { 11.0, 180.0 }, 
                                                    { 15.0, 230,0 },
                                                    { 20.0, 350.0 },
                                                    { 23.0, 480.0 },
                                                    { 26.0, 550.0 }};

  public static final double[][] armPositionCone = {{ 0.0, 0.0 },
                                                    { 72.0, 50.0 }, 
                                                    { 200.0, 80,0 },
                                                    { 228.0, 495.0 }};
  public static final double[][] armPositionCube = { { 0.0, 0.0 },
                                                    { 72.0, 50.0 }, 
                                                    { 200.0, 80,0 },
                                                    { 228.0, 495.0 } };
}
