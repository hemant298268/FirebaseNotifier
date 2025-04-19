import java.util.ArrayList;
import java.util.List;

public class botState {
	
	public String startingBalance;
	public String currentBalance;
	public String realizedProfit;
	public String timeStamp;
	public List<closedTrade> closedTrades = new ArrayList<closedTrade>();
	public List<openTrade> openTrades = new ArrayList<openTrade>();	
	
	public botState() {
		
	}
	
	public botState(List<openTrade> openTradesList, List<closedTrade> closedTradesList, String startingBalance, String currentBalance, String realizedProfit, String timeStamp) {
		this.openTrades = openTradesList;
		this.closedTrades = closedTradesList;
		this.startingBalance = startingBalance;
		this.currentBalance = currentBalance;
		this.realizedProfit = realizedProfit;
		this.timeStamp = timeStamp;
	}
	
	public void printObject() {
			System.out.println("Starting Balance: "+this.startingBalance+"\nCurrent Balance: "+this.currentBalance+"\nRealized Profit: "+this.realizedProfit+"\ntimeStamp: "+this.timeStamp);
			System.out.println("Closed Trades");
			for(closedTrade CT : this.closedTrades)
				CT.printObject();
			System.out.println("Open Trades");
			for(openTrade OT : this.openTrades)
				OT.printObject();
	}

}
