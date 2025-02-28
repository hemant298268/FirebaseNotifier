import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseOptions;

public class FCMTokenInitialiser {

	private static String jsonLocation = "/Users/apple/Documents/tBot/app/test_1.json";
	
	public String getAccessToken() throws IOException {
		GoogleCredentials googleCredentials = GoogleCredentials
				.fromStream(new FileInputStream(jsonLocation))
				.createScoped(Arrays.asList("https://www.googleapis.com/auth/firebase.messaging"));
		googleCredentials.refreshIfExpired();
		return googleCredentials.getAccessToken().getTokenValue();
	}
	
	public FirebaseOptions getOptions() throws IOException {
		FileInputStream serviceAccount = new FileInputStream(jsonLocation);
		
		return new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
	}
}
