package Command;
import java.util.ArrayList;
import java.util.List;

public class UseController {
	
	public static void main(String[] args) {
		
		Device newDevice = SpeakerController.getDevice();
		
		TurnSpeakerOn onCommand = new TurnSpeakerOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		
		//---------------------------------------------------------------
		
		TurnSpeakerOff offCommand = new TurnSpeakerOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		//---------------------------------------------------------------
		
		TurnSpeakerUp volumeUpCommand = new TurnSpeakerUp(newDevice);
		
		onPressed = new DeviceButton(volumeUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		//---------------------------------------------------------------
		
		TurnSpeakerDown volumeDownCommand = new TurnSpeakerDown(newDevice);
		
		onPressed = new DeviceButton(volumeDownCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
	}

}
