package Command;

public class TurnSpeakerOff implements Command {

	Device theDevice;
	
	public TurnSpeakerOff(Device newDevice) {
		
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		
		theDevice.off();
		
	}

}
