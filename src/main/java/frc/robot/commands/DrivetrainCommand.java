package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;


public class DrivetrainCommand extends CommandBase {
	private final DrivetrainSubsystem drivetrainSubsystem = DrivetrainSubsystem.getInstance();

	public DrivetrainCommand() {

		addRequirements(this.drivetrainSubsystem);
	}

	@Override
	public void initialize() {

	}

	@Override
	public void execute() {

	}

	@Override
	public boolean isFinished() {

		return false;
	}

	@Override
	public void end(boolean interrupted) {

	}
}
