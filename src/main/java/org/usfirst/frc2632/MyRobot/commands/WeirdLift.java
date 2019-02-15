/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.commands;

import org.usfirst.frc2632.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class WeirdLift extends Command {
  double frontStartingValue;
  double midStartingValue;
  double rearStartingValue;
  double setpoint;

  public WeirdLift(double inputSetpoint) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.liftSystem);
    setpoint = inputSetpoint;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    frontStartingValue = Robot.liftSystem.getFront();
    midStartingValue = Robot.liftSystem.getMid();
    rearStartingValue = Robot.liftSystem.getRear();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(frontStartingValue!=setpoint){
      if(frontStartingValue > setpoint){

      }
      else if (frontStartingValue < setpoint) {

      }
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
