import java.util.List;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

public class deviceNotifier {
	
	public String sendNotif_singleDevice(String deviceToken, Message message) {
		try {
			FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            FirebaseApp.initializeApp(tokenInit.getOptions());
            
			 message = Message.builder()
				    .setToken(deviceToken)
				    .build();

				// Send a message to the device corresponding to the provided
				// registration token.
				String response = FirebaseMessaging.getInstance().send(message);
				// Response is a message ID string.
				System.out.println("Successfully sent message: " + response);
				return response;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String sendNotif_topic(String topic, Message message) {
		try {
			FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            FirebaseApp.initializeApp(tokenInit.getOptions());
            
			message = Message.builder()
				    .putData("score", "853")
				    .setTopic("TESTNOTIF")
				    .build();

				// Send a message to the device corresponding to the provided
				// registration token.
				String response = FirebaseMessaging.getInstance().send(message);
				// Response is a message ID string.
				System.out.println("Successfully sent message: " + response);
				return response;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
