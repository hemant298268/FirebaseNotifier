import java.util.List;
import java.util.Map;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

public class deviceNotifier {
	
	public String sendNotif_singleDevice(String deviceToken, Map<String, String> messageBody) {
		try {
			FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            FirebaseApp.initializeApp(tokenInit.getOptions());
            
			 Message message = Message.builder()
					 .putAllData(messageBody)
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
	
	public String sendNotif_topic(String topic, Map<String, String> messageBody) {
		try {
			FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            FirebaseApp.initializeApp(tokenInit.getOptions());
            
			Message message = Message.builder()
					.putAllData(messageBody)
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
