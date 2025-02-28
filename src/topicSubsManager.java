import java.util.List;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.TopicManagementResponse;

public class topicSubsManager {
	
	public int subscribeUsers(List<String> userTokens, String topic) throws FirebaseMessagingException {
		TopicManagementResponse response = FirebaseMessaging.getInstance().subscribeToTopic(
			    userTokens, topic);
			// See the TopicManagementResponse reference documentation
			// for the contents of response.
			System.out.println(response.getSuccessCount() + " tokens were subscribed successfully");
			if(response.getSuccessCount() != userTokens.size()) {
				System.out.println("Few users could not be subscribed");
				return response.getSuccessCount();
			}
			else {
				System.out.println("All users subscribed");
				return response.getSuccessCount();
			}
	}
	
	public int unsubsribeUsers(List<String> userTokens, String topic) throws FirebaseMessagingException {
		TopicManagementResponse response = FirebaseMessaging.getInstance().unsubscribeFromTopic(
			    userTokens, topic);
			// See the TopicManagementResponse reference documentation
			// for the contents of response.
			System.out.println(response.getSuccessCount() + " tokens were unsubscribed successfully");
			if(response.getSuccessCount() != userTokens.size()) {
				System.out.println("Few users could not be unsubscribed");
				return response.getSuccessCount();
			}
			else {
				System.out.println("All users unsubscribed");
				return response.getSuccessCount();
			}
	}

}
