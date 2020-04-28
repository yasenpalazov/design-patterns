package Command;

public class TurnSpeakerDown implements Command {

	Device theDevice;
	
	public TurnSpeakerDown(Device newDevice) {
		
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		
		theDevice.volumeDown();
		
	}

}
