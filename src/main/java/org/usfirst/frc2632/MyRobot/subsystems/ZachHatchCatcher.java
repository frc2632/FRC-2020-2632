/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ZachHatchCatcher extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DigitalInput limitSwitch = new DigitalInput(RobotMap.HATCH_LIMITSWITCH);
  Solenoid systemSolenoid = new Solenoid(RobotMap.SYSTEM_SOLENOID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public boolean getLimitSwitch(){
    return limitSwitch.get();
  }
  
  public void moveSystem(boolean value) {
    // true is push false is pull
    systemSolenoid.set(value);
  }

}
