package speechToTextDemo;

import java.util.Locale;
import javax.speech.*;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class SpeechToTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String help = "";
		 
		try
		{
			System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
			Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
			Synthesizer synt = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
			synt.allocate();
			synt.resume();
			synt.speakPlainText(help , null);
			synt.waitEngineState(synt.QUEUE_EMPTY);
			synt.deallocate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
