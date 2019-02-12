 package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchCatcherSubsystem extends Subsystem{

    double openVal = 1;
    double closeVal = .2;
    boolean isFinished;

    Servo servo1 = new Servo(RobotMap.HATCH_SERVO1);
    Servo servo2 = new Servo(RobotMap.HATCH_SERVO2);
    Servo servo3 = new Servo(RobotMap.HATCH_SERVO3);


    DigitalInput limitSwitch = new DigitalInput(RobotMap.HATCH_LIMITSWITCH1);
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

    public void moveSystem(boolean value){
        //true is push false is pull
        systemSolenoid.set(value);
    }


    public void moveHatch(boolean value){
        //True is push false is pull
        hatchSolenoid.set(true);
    }

    //This methood calls other methods in the system to perform a grab sequence 
    public void grabHatch(){
        isFinished = false;
        moveSystem(true);
        if( limitSwitch.get() == true){
            closeServo();
            moveSystem(false);
            isFinished = true;
        }
    }
    
    // This methood calls other methods in the system to perform a release sequence
    public void releaseGear(){
        moveSystem(true);
        openServo();
        if (servo1.get() == openVal)
            moveHatch(true);
    }
    public void isFinishedSet(boolean value){
        isFinished = value;
    }
    public boolean isFinishedGet(){
        return isFinished;
    }
}