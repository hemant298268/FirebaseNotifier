import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

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
			
            Map<String, String> messageBody = new HashMap<String, String>();
            messageBody.put("Name", "Hemant");
            messageBody.put("Age", "36");
			
			deviceNotifier devNotif = new deviceNotifier();
			//devNotif.sendNotif_singleDevice("", messageBody);
			devNotif.sendNotif_topic("TESTNOTIF", messageBody);

				// Send a message to the device corresponding to the provided
				// registration token.
				//String response = FirebaseMessaging.getInstance().send(message);
				// Response is a message ID string.
				//System.out.println("Successfully sent message: " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
