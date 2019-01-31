 package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchCatcherSubsystem extends Subsystem{

    //DigitalInput limitSwitch1 = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);
    //DigitalInput limitSwitch2 = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);

    Servo servo1 = new Servo(RobotMap.HATCH_SERVO1);
    Servo servo2 = new Servo(RobotMap.HATCH_SERVO2);
    Servo servo3 = new Servo(RobotMap.HATCH_SERVO3);
    double openVal = 1;
    double closeVal = .2;

    Solenoid systemSolenoid = new Solenoid(RobotMap.SYSTEM_SOLENOID);
    Solenoid hatchSolenoid = new Solenoid(RobotMap.HATCH_SOLENOID);


    public void initDefaultCommand() {
        
        // Set the default command for a subsystem here.
        //setDefaultCommand(new HatchCatcher());
    }

    public void getLimitSwitch(){
        //return limitSwitch1;
    }

    public void openServo(){
        servo1.set(openVal);
        servo2.set(openVal);
        servo3.set(openVal);
    }

    public void closeServo(){
        servo1.set(closeVal);
        servo2.set(closeVal);
        servo3.set(closeVal);
    }
    
    public void rotateServo(double value){
        servo1.set(value);
        servo2.set(value);
        servo3.set(value);
    }

    public void pushSystem(){
        systemSolenoid.set(true);
    }

    public void pullSystem(){
        systemSolenoid.set(false);
    }

    public void pushHatch(){
        hatchSolenoid.set(true);
    }

    public void pullHatch(){
        hatchSolenoid.set(false);
    }
}

