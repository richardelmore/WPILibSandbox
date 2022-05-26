// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WinchSubsystem extends SubsystemBase {

  private static final int MAX_CURRENT = 13;


  private CANSparkMax motor;
  
  /** Creates a new ExampleSubsystem. */
  public WinchSubsystem(int motorCANID) {
    motor = new CANSparkMax(motorCANID, MotorType.kBrushless);
    motor.setInverted(true);
    motor.setIdleMode(IdleMode.kCoast);
    motor.setSmartCurrentLimit(MAX_CURRENT);

    motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void setPower(double power)
  {
    motor.set(power);
  }
}
