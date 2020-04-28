 package Command;

public class SoundSpeaker implements Device {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("Speaker is ON");
		
	}

	@Override
	public void off() {
		System.out.println("Speaker is OFF");
		
	}

	@Override
	public void volumeUp() {
		
		volume++;
		System.out.println("Speaker is at "+ volume);
		
	}

	@Override
	public void volumeDown() {
		
		volume--;
		System.out.println("Speaker is at "+ volume);
		
	}

}
