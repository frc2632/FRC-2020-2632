/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modifi+ed and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.commands;

import org.usfirst.frc2632.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ZachHatchGrab extends Command {
  boolean finished;
  public ZachHatchGrab() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.hatchCatcherSubsystem);
    requires(Robot.liftSystem);
    finished = false;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.hatchCatcherSubsystem.moveSystem(true);
    if (!Robot.hatchCatcherSubsystem.getLimitSwitch()) {
      Robot.liftSystem.liftElevator(Robot.liftSystem.getElevatorHeight() + 10);
    }
    if (Robot.hatchCatcherSubsystem.getLimitSwitch()) {
      Robot.hatchCatcherSubsystem.moveSystem(false);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return finished;
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
