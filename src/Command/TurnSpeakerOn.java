package Command;

public class TurnSpeakerOn implements Command {

	Device theDevice;
	
	public TurnSpeakerOn(Device newDevice) {
		
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		
		theDevice.on();
		
	}

}
