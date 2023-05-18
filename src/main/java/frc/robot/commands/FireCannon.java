package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.CannonSubsystem;

public class FireCannon extends SequentialCommandGroup {
	public FireCannon(CannonSubsystem cannon) {
		// TODO: Add your sequential commands in the super() call, e.g.
		//           super(new OpenClawCommand(), new MoveArmCommand());
		super();
        addRequirements(cannon);
        addCommands(
                new InstantCommand(() -> cannon.setCharge(true)),
                new WaitCommand(.25),
                new InstantCommand(() -> cannon.setCharge(false)),
                new InstantCommand(() -> cannon.setFire(true)),
                new WaitCommand(1),
                new InstantCommand(() -> cannon.setFire(false))
        );
	}
}