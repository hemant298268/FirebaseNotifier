import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.DeleteUsersResult;
import com.google.firebase.auth.ExportedUserRecord;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.ListUsersPage;

public class userManager {
	
	userManager() {
		try {
			FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<String> getAllUserIDs() throws FirebaseAuthException, IOException {
		
		ListUsersPage page = FirebaseAuth.getInstance().listUsers(null);
		page = FirebaseAuth.getInstance().listUsers(null);
		ArrayList<String> userList = new ArrayList<String>();
		for (ExportedUserRecord user : page.iterateAll()) {
		  System.out.println("User: " + user.getUid());
		  userList.add(user.getUid());
		}
		return userList;
	}
	
	public void deleteAllUserIDs() throws InterruptedException, ExecutionException, FirebaseAuthException, IOException {
		DeleteUsersResult result = FirebaseAuth.getInstance().deleteUsersAsync(
				getAllUserIDs()).get();
			System.out.println("Successfully deleted " + result.getSuccessCount() + " users");
			System.out.println("Failed to delete " + result.getFailureCount() + " users");
	}
	
	public void getAllUserIDTokens() {
		
	}
}
