/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 * Add your docs here.
 */
public class PIDLiftSystem extends PIDSubsystem {

  SpeedController frontLiftMotor = new WPI_TalonSRX(RobotMap.FRONT_LIFT_MOTOR);
  SpeedController midLiftMotor = new WPI_TalonSRX(RobotMap.MID_LIFT_MOTOR);
  SpeedController rearLiftMotor = new WPI_TalonSRX(RobotMap.BACK_LIFT_MOTOR);

  SpeedController wheelMotor = new WPI_TalonSRX(RobotMap.LIFT_WHEEL_MOTOR);

  public PIDLiftSystem() {
    // Intert a subsystem name and PID values here
    super("SubsystemName", 1, 2, 3, 4);
    // Use these to get going:
     //setSetpoint(reset);
    // to
    enable();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return 0.0;
  }

  @Override
  protected void usePIDOutput(double output) {
    rearLiftMotor.set(-output*.5);
    midLiftMotor.set(output*.5);
    frontLiftMotor.set(output);

  }

  public void reset(){
  }

  public void raiseFirstLevel(){
    disable();
    frontLiftMotor.set(0);
  }

  public void raiseSecondLevel(){
    midLiftMotor.set(0);

  }

}
