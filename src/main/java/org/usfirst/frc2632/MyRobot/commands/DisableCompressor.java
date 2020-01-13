/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.commands;

import org.usfirst.frc2632.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DisableCompressor extends Command {

  boolean finished = false;
  public DisableCompressor() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.compressorSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    if(!(Robot.compressorSubsystem.isOn())){
      Robot.compressorSubsystem.startCompressor();
    }
    else{
      Robot.compressorSubsystem.stopCompressor();
    }
    //SmartDashboard.putBoolean("Compressor On: ", Robot.compressorSubsystem.isOn());
    finished = true;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
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
