package org.usfirst.frc2632.MyRobot;


public class RobotMap{

    //     These are the constant values for the lfit 
    
    public static final double TOP_ELEVATOR_VAL = 5;
    public static final double MID_ELEVATOR_VAL = 5;
    public static final double BOT_ELEVATOR_VAL = 5;
    public static final double TOP_PLATFORM_VAL = 5;
    public static final double MID_PLATFORM_VAL = 5;
    public static final double SAFE_ELEVATOR_HEIGHT = 5;
    

    //PID Values for the lift
    public static double kfFrontLift = 5;    
    public static double kdFrontLift = 5;
    public static double kpFrontLift = 5;
    public static double kiFrontLift = 0;
    public static double kfMidLift = 5;
    public static double kdMidLift = 5;
    public static double kpMidLift = 5;
    public static double kiMidLift = 0;
    public static double kfRearLift = 5;
    public static double kdRearLift = 5;
    public static double kpRearLift = 5;
    public static double kiRearLift = 0;
    
    //     These are the port numbers


    //    CAN
    public static final int LFMOTORCONTROLLER = 4;
    public static final int LRMOTORCONTROLLER = 5;
    public static final int RFMOTORCONTROLLER = 6;
    public static final int RRMOTORCONTROLLER = 7;

    public static final int FRONT_LIFT_MOTOR = 9;
    public static final int MID_LIFT_MOTOR = 10;
    public static final int BACK_LIFT_MOTOR = 11;
    public static final int LIFT_WHEEL_MOTOR = 12;

    public static final int FRONT_LIFT_ENCODER_A = 500;
    public static final int FRONT_LIFT_ENCODER_B = 500;

    //NOT CAN
    public static final int HATCH_LIMITSWITCH1 = 7;

    public static final int HATCH_SERVO1 = 0;
    public static final int HATCH_SERVO2 = 1;
    public static final int HATCH_SERVO3 = 2;
    public static final int CAMERA_SERVO = 3;
    public static final int BALL_LEFT_SERVO = 18;
    public static final int BALL_RIGHT_SERVO = 19;

    public static final int GYRO = 11;

    public static final int ENCODER_CHANNEL_A = 12;
    public static final int ENCODER_CHANNEL_B = 13;

    public static final int SYSTEM_SOLENOID = 15;
    public static final int HATCH_SOLENOID = 16;
    public static final int BALL_SOLENOID = 17;
    

    public static final int CHOO_CHOO = 18;
    public static final int LIGHTS =    19;
}
