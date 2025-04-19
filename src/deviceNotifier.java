import java.util.Map;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

public class deviceNotifier {
	
	public String sendNotif_singleDevice(String deviceToken, Map<String, String> messageBody) {
		try {
			FCMTokenInitialiser tokenInit = new FCMTokenInitialiser();
            FirebaseApp.initializeApp(tokenInit.getOptions());
            Notification notification = Notification.builder()
            		.setTitle("TBot")
            		.setBody("This is a test notification")
            		.build();
            
			 Message message = Message.builder()
					 .setNotification(notification)
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
            
            Notification notification = Notification.builder()
            		.setTitle("TBot")
            		.setBody("This is a test notification")
            		.build();
            
			Message message = Message.builder()
					.setNotification(notification)
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
