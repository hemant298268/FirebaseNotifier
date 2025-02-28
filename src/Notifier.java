import java.io.FileInputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

public class Notifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There");
		
		try {
			//FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            //FirebaseApp.initializeApp(tokenInit.getOptions());
            
			Message message = Message.builder()
				    .putData("score", "853")
				    .build();
			
			deviceNotifier devNotif = new deviceNotifier();
			devNotif.sendNotif_singleDevice("", message);
			devNotif.sendNotif_topic("TESTNOTIF", message);

				// Send a message to the device corresponding to the provided
				// registration token.
				String response = FirebaseMessaging.getInstance().send(message);
				// Response is a message ID string.
				System.out.println("Successfully sent message: " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
