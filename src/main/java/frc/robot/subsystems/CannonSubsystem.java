package frc.robot.subsystems;


import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CannonSubsystem extends SubsystemBase {
	private final Solenoid charge;
    private final Solenoid fire;
    public final static PneumaticHub pnumaticsHub = new PneumaticHub();

	public CannonSubsystem(int chargeID, int fireID) {
        charge = pnumaticsHub.makeSolenoid(chargeID);
        fire = pnumaticsHub.makeSolenoid(fireID);
	}

    public void ToggleFire()
    {
        fire.toggle();
    }
    public void setFire(boolean on)
    {
        fire.set(on);
    }
    public boolean getFire()
    {
        return fire.get();
    }

    public void toggleCharge()
    {
        charge.toggle();
    }
    public void setCharge(boolean on)
    {
        charge.set(on);
    }
    public boolean getCharge()
    {
        return charge.get();
    }
}

