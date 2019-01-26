package org.usfirst.frc2632.MyRobot.subsystems;

import org.usfirst.frc2632.MyRobot.Robot;
import org.usfirst.frc2632.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
/*
public class PIDPixyCam{

    double forwardDistance = 5;
    
    double angleKp = 0;
    double angleKi = 0;
    double angleKd = 0;
    double angleFF = 0;
    AnalogGyro gyro = new AnalogGyro(RobotMap.GYRO);

    final PIDController anglePidController = new PIDController(angleKp, angleKi, angleKd, gyro, new AnglePIDOutput()); 

    double distanceKp = 0;
    double distanceKi = 0;
    double distanceKd = 0;
    double distanceFF = 0;
    Encoder encoder = new Encoder(RobotMap.ENCODER_CHANNEL_A, RobotMap.ENCODER_CHANNEL_B);

    final PIDController distancePidController = new PIDController(angleKp, angleKi, angleKd, encoder, new DistancePIDOutput());

    public double getRotation(double horizontalDistance){
        //angle is the measurement of the angle that the robot needs to turn at, converted to degrees
        //plus the value the the gyro had at the moment the method was called
        double angle = (Math.toDegrees(Math.atan(horizontalDistance/forwardDistance)) + gyro.getAngle());
        return angle;
    }

    public double getDistance(double horizontalDistance){
        double distance = Math.sqrt((horizontalDistance*horizontalDistance) + (forwardDistance*forwardDistance));
        return distance;
    }

    public double getCenterX(double leftTapeX, double rightTapeX){
        double center = (leftTapeX + rightTapeX)/2;
        return center;
    }



}

class AnglePIDOutput implements PIDOutput{
    @Override
    public void pidWrite(double output) {
        Robot.driveTrainSubsystem.arcade(output, 0);
    }

}

class DistancePIDOutput implements PIDOutput{
    @Override
    public void pidWrite(double output) {
        Robot.driveTrainSubsystem.arcade(0, output);
    }

}
*/