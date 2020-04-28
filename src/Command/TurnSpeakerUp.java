package Command;

public class TurnSpeakerUp implements Command {

	Device theDevice;
	
	public TurnSpeakerUp(Device newDevice) {
		
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		
		theDevice.volumeUp();
		
	}

}
