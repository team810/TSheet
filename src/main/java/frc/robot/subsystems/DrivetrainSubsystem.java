package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
    private final Spark left1, left2;
    private final Spark right1, right2;
    private final MotorControllerGroup left;
    private final MotorControllerGroup right;
    private final DifferentialDrive drive;
	private static DrivetrainSubsystem INSTANCE;

	@SuppressWarnings("WeakerAccess")
	public static DrivetrainSubsystem getInstance() {
		if (null == DrivetrainSubsystem.INSTANCE) {
            INSTANCE = new DrivetrainSubsystem();
		}
		return INSTANCE;
	}
	private DrivetrainSubsystem() {
        left1 = new Spark(0);
        left2 = new Spark(1);
        right1 = new Spark(2);
        right2 = new Spark(3);

        left = new MotorControllerGroup(left1, left2);
        right = new MotorControllerGroup(right1, right2);

        drive = new DifferentialDrive(left, right);
	}
    public void set(double left, double right)
    {
        drive.tankDrive(left, right, true);
    }
}

