package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.CannonSubsystem;

public class FireAll extends ParallelCommandGroup {
	public FireAll(CannonSubsystem[] cannons) {
		// TODO: Add your sequential commands in the super() call, e.g.
		//           super(new OpenClawCommand(), new MoveArmCommand());
		super();
        addRequirements(cannons[0]);
        addCommands(
                new FireCannon(cannons[0]),
                new FireCannon(cannons[1]),
                new FireCannon(cannons[2]),
                new FireCannon(cannons[3])
        );
	}
}