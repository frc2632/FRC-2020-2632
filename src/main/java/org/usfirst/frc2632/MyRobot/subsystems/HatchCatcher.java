 package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;

public class HatchCatcher{

    DigitalInput limitSwitch1 = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);
    DigitalInput limitSwitch2 = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);
    DigitalInput limitSwitch3 = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);

    Servo servo1 = new Servo(RobotMap.HATCH_SERVO1);
    Servo servo2 = new Servo(RobotMap.HATCH_SERVO1);
    Servo servo3 = new Servo(RobotMap.HATCH_SERVO1);
    int openVal = 0;
    int closeVal = 1;

    public DigitalInput getLimitSwitch(){
        return limitSwitch1;
    }

    public void closeServo(){
        servo1.set(openVal);
        servo2.set(openVal);
        servo3.set(openVal);
    }

    public void openServo(){
        servo1.set(closeVal);
        servo2.set(closeVal);
        servo3.set(closeVal);
    }
    
    public void rotateServo(double value){
        servo1.set(value);
        servo2.set(value);
        servo3.set(value);
    }
}

