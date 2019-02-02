
package org.usfirst.frc2632.MyRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2632.MyRobot.Robot;

/**
 *
 */
public class HatchCatcherOpen extends Command {

    public HatchCatcherOpen() {

        requires(Robot.hatchCatcherSubsystem);
    

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        Robot.hatchCatcherSubsystem.openServo();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        //Robot.HatchCatcherSubsystem.arcade(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        //Robot.driveTrainSubsystem.arcade(0, 0);
    }
}
