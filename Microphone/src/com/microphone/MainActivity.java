package com.microphone;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView myMicrophone;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myMicrophone = (TextView) this.findViewById(R.id.text_Microphone);

		AudioManager audio = (AudioManager) this
				.getSystemService(Context.AUDIO_SERVICE);
		if (audio.isMicrophoneMute()) {
			myMicrophone.setText("Microphone Muted");

		} else {
			myMicrophone.setText("Microphone On");

		}
		
	}

}
