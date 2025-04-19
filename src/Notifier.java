import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There");
		
		try {
			fireStoreUtil fObj = new fireStoreUtil();
			
			//userManager userMgr = new userManager();
			//userMgr.getAllUserIDs();
			//userMgr.deleteAllUserIDs();
			//sendNotification_sample();
			//sendNotification_sample();
			
			/*openTrade O1 = new openTrade(1,"LINKUSDT","1234",java.time.LocalDateTime.now().toString(),"1500","50");
			openTrade O2 = new openTrade(2,"THETAUSDT","1234",java.time.LocalDateTime.now().toString(),"1500","50");
			closedTrade C1 = new closedTrade(1,"LINKUSDT","1234",java.time.LocalDateTime.now().toString(),"1500",java.time.LocalDateTime.now().toString(),"50");
			closedTrade C2 = new closedTrade(2,"LINKUSDT","1234",java.time.LocalDateTime.now().toString(),"1500",java.time.LocalDateTime.now().toString(),"50");
			List<openTrade> OL = new ArrayList<>();
			List<closedTrade> CL = new ArrayList<>();
			OL.add(O1); OL.add(O2);
			CL.add(C1); CL.add(C2);
			botState botStateObj = new botState(OL, CL, "50000", "2000000", "300", java.time.LocalDateTime.now().toString());
			fireStoreUtil fObj = new fireStoreUtil();
			fObj.setBotState(botStateObj);*/
			//fObj.updateBotState_openTrades(inputList);
			fObj.getUserByID("8bfuZNPmtihd44uOQT0xXSXYVoV2").printObject();
			System.out.println("Next function");
			fObj.getUserByEmail("A@a.com").get(0).printObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendNotification_sample() {
		 Map<String, String> messageBody = new HashMap<String, String>();
         messageBody.put("Name", "Hemant");
         messageBody.put("Age", "366");
         messageBody.put("target", "updateBot");
         //messageBody.put("state", "{\"closedTrades\": [{\"buyPrice\": \"1400\", \"buyTime\": \"2025-03-01T15:55:39.038Z\", \"id\": \"1\", \"profit\": \"3.57\", \"sellPrice\": \"1200\", \"sellTime\": \"2025-04-01T15:55:39.038Z\", \"symbol\": \"LINKUSDT\"}, {\"buyPrice\": \"0.00000068\", \"buyTime\": \"2025-02-28T15:55:39.038Z\", \"id\": \"2\", \"profit\": \"30.88\", \"sellPrice\": \"0.00000059\", \"sellTime\": \"2025-03-11T15:55:39.038Z\", \"symbol\": \"BTTUSDT\"}], \"currentBalance\": \"580000\", \"openTrades\": [{\"buyPrice\": \"18000\", \"buyTime\": \"2025-04-01T15:55:39.038Z\", \"currPrice\": \"2000\", \"id\": \"1\", \"profit\": \"14\", \"symbol\": \"XXXUSDT\"}, {\"buyPrice\": \"1300\", \"buyTime\": \"2025-04-01T15:55:39.038Z\", \"currPrice\": \"200\", \"id\": \"2\", \"profit\": \"98\", \"symbol\": \"YYYUSDT\"}, {\"buyPrice\": \"1234.5678\", \"buyTime\": \"2025-04-01T15:55:39.038Z\", \"currPrice\": \"1000\", \"id\": \"3\", \"profit\": \"0\", \"symbol\": \"ZZZUSDT\"}], \"realisedProfit\": \"16\", \"startingBalance\": \"500000\"}");
			deviceNotifier devNotif = new deviceNotifier();
			//devNotif.sendNotif_singleDevice("dL9uzBM6RZCIp8sRDNU_h7:APA91bFMDF1o2PfqTIs6H3iavdYJ3QSeoc02K3fEUi9XR-o_KXszm3K7TKWtqZXru0XZfcjxIlkq5EoEvykUkM1SnjpOgVk0D2uAkWP_mVVBTUBjguQkS7Q", messageBody);
			devNotif.sendNotif_topic("TESTNOTIF", messageBody);
	}
	
//{"closedTrades": [{"buyPrice": "1400", "buyTime": "2025-03-01T15:55:39.038Z", "id": "1", "profit": "3.57", "sellPrice": "1200", "sellTime": "2025-04-01T15:55:39.038Z", "symbol": "LINKUSDT"}, {"buyPrice": "0.00000068", "buyTime": "2025-02-28T15:55:39.038Z", "id": "2", "profit": "30.88", "sellPrice": "0.00000059", "sellTime": "2025-03-11T15:55:39.038Z", "symbol": "BTTUSDT"}], "currentBalance": "580000", "openTrades": [{"buyPrice": "18000", "buyTime": "2025-04-01T15:55:39.038Z", "currPrice": "2000", "id": "1", "profit": "14", "symbol": "BTCUSDT"}, {"buyPrice": "1300", "buyTime": "2025-04-01T15:55:39.038Z", "currPrice": "200", "id": "2", "profit": "98", "symbol": "ETHUSDT"}, {"buyPrice": "1234.5678", "buyTime": "2025-04-01T15:55:39.038Z", "currPrice": "1000", "id": "3", "profit": "0", "symbol": "LINKUSDT"}], "realisedProfit": "16", "startingBalance": "500000"}	

}
