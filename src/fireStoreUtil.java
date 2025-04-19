import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.cloud.FirestoreClient;

public class fireStoreUtil {
	
	static Firestore db;
	
	public fireStoreUtil() throws IOException {
		FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
		db = FirestoreClient.getFirestore();
	}
	/*
setBotState(botState obj) --
getBotState() --
getUserByID(String userID) --
deleteUserByID(String userID) ????
updateUserByID(String userID) ????
getUserByEmail(String email) --
deleteUserByEmail(String email) ????
updateUserByEmail(String email) ????
getUsersIDs() --
getUserEMails() --
deleteDevice(String deviceToken)
getDeviceList()
	 */
	
	public List<userObject> getUserByEmail(String email) {
		try {
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			//Firestore db = FirestoreClient.getFirestore();
			// asynchronously retrieve all users
			CollectionReference UserCollection = db.collection("Users");
			Query query = UserCollection.whereEqualTo("userName",email);
			ApiFuture<QuerySnapshot> querySnapshot = query.get();
			List<userObject> returnList = new ArrayList<userObject>(); 
			for(DocumentSnapshot document : querySnapshot.get().getDocuments()) {
				userObject returnObject = document.toObject(userObject.class);
				returnObject.setUserID(document.getId());
				returnList.add(returnObject);
			}
			return returnList;
		}
		catch(Exception ex) {
			System.out.println("Exception in getting user by userID"+ex.toString());
		}
		return null;
	}
	
	public userObject getUserByID(String userID) {
		try {
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			//Firestore db = FirestoreClient.getFirestore();
			// asynchronously retrieve all users
			ApiFuture<DocumentSnapshot> query = db.collection("Users").document(userID).get();
			DocumentSnapshot docSnapshot = query.get();
			userObject returnObject = docSnapshot.toObject(userObject.class);
			returnObject.setUserID(docSnapshot.getId());
			return returnObject;
		}
		catch(Exception ex) {
			System.out.println("Exception in getting user by userID"+ex.toString());
		}
		return null;
	}
	
	public botState getBotState() {
		try {
			List<openTrade> returnList = new ArrayList<openTrade>();
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			Firestore db = FirestoreClient.getFirestore();
			// asynchronously retrieve all users
			ApiFuture<DocumentSnapshot> query = db.collection("botState").document("botState").get();
			DocumentSnapshot docSnapshot = query.get();
			botState test = docSnapshot.toObject(botState.class);
			return test;
		}
		catch(Exception ex) {
			System.out.println("Exception in getting bot state"+ex.toString());
		}
		return null;
	}
	
	public void setBotState(botState botStateObj) {
		try {
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			Firestore db = FirestoreClient.getFirestore();

			
			ApiFuture<WriteResult> future = db.collection("botState").document("botState").set(botStateObj);

			//ApiFuture<WriteResult> future2 = db.collection("botState").document("Testeer").update("closedTrades",FieldValue.arrayUnion(completedTradesList));
			System.out.println("Update time : " + future.get().getUpdateTime());
		}
		catch(Exception ex) {
			System.out.println("Exception in setting bot state"+ex.toString());
		}
	}
	
	public List<String> getUserIDs() {
		try {
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			//Firestore db = FirestoreClient.getFirestore();
			// asynchronously retrieve all users
			ApiFuture<QuerySnapshot> query = db.collection("Users").get();
			// ...
			// query.get() blocks on response
			QuerySnapshot querySnapshot = query.get();
			List<String> userList = new ArrayList<String>();
			for (QueryDocumentSnapshot document : querySnapshot.getDocuments()) {
				userList.add(document.getId());
			}
			return userList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in getting user information"+e.toString());
		}
		return null;
	}
	
	public List<String> getUserEmails() {
		try {
			//FirebaseApp.initializeApp(FCMTokenInitialiser.getOptions());
			//Firestore db = FirestoreClient.getFirestore();
			// asynchronously retrieve all users
			ApiFuture<QuerySnapshot> query = db.collection("Users").get();
			// ...
			// query.get() blocks on response
			QuerySnapshot querySnapshot = query.get();
			List<String> userList = new ArrayList<String>();
			for (QueryDocumentSnapshot document : querySnapshot.getDocuments()) {
				userList.add(document.getString("userName"));
				System.out.println(document.getString("userName"));
			}
			return userList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in getting user information"+e.toString());
		}
		return null;
	}
}
