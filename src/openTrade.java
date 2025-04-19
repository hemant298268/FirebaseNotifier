import org.json.*;

public class openTrade {
	
	int id;
	String buyPrice;
	String buyTime;
	String currPrice;
	String profit;
	String symbol;
	
	public openTrade() {
		
	}
	
	public openTrade(int id, String symbol, String buyPrice, String buyTime, String currPrice, String profit) {
		this.id = id;
		this.symbol = symbol;
		this.buyPrice = buyPrice;
		this.buyTime = buyTime;
		this.currPrice = currPrice;
		this.profit = profit;
	}
	
	public void printObject() {
		System.out.println("id: "+this.id+"\nsymbol: "+this.symbol+"\nbuyPrice: "+this.buyPrice+"\nbuyTime: "+this.buyTime+"\ncurrPrice: "+this.currPrice+"\nprofit: "+this.profit);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}
	public String getCurrPrice() {
		return currPrice;
	}
	public void setCurrPrice(String currPrice) {
		this.currPrice = currPrice;
	}
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

}
