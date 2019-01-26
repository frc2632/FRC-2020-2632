/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.RobotMap;
import org.usfirst.frc2632.MyRobot.commands.CameraRotate;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class CameraSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Servo cameraServo = new Servo(RobotMap.CAMERA_SERVO);
  CameraServer camera;
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new CameraRotate());
  }

  public void rotateCamera(XboxController controller){
    cameraServo.set(cameraServo.get() + (controller.getTriggerAxis(Hand.kRight)*.1) - (controller.getTriggerAxis(Hand.kLeft)*.1));
  } 
}
