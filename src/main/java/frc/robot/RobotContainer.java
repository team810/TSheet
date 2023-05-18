// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.FireAll;
import frc.robot.subsystems.CannonSubsystem;
import frc.robot.subsystems.DrivetrainSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer
{
    private final Joystick left;
    private final Joystick right;

    private final CannonSubsystem[] cannons = {
            new CannonSubsystem(0,1),
            new CannonSubsystem(1,2),
            new CannonSubsystem(2,3),
            new CannonSubsystem(4,5)
    };
    public RobotContainer()
    {
        left = new Joystick(0);
        right = new Joystick(1);
        // Configure the trigger bindings

        DrivetrainSubsystem.getInstance().setDefaultCommand(new RunCommand(() ->DrivetrainSubsystem.getInstance().set(
                left.getY(),right.getY()
        )));
        configureBindings();
    }
    
    
    /** Use this method to define your trigger->command mappings. */
    private void configureBindings()
    {
        new Trigger(() -> left.getTrigger()).onTrue(new FireAll(cannons));
    }
    
    
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand()
    {
        // TODO: Implement properly
        return null;
    }
}
