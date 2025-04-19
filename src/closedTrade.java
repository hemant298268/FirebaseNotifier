
public class closedTrade {

	int id;
	String buyPrice;
	String buyTime;
	String sellPrice;
	String sellTime;
	String profit;
	String symbol;
	
	public closedTrade() {
		
	}
	
	public closedTrade(int id, String symbol, String buyPrice, String buyTime, String sellPrice, String sellTime, String profit) {
		this.id = id;
		this.symbol = symbol;
		this.buyPrice = buyPrice;
		this.buyTime = buyTime;
		this.sellPrice = sellPrice;
		this.sellTime = sellTime;
		this.profit = profit;
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
	public String getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}
	public String getSellTime() {
		return sellTime;
	}
	public void setSellTime(String sellTime) {
		this.sellTime = sellTime;
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
	
	public void printObject() {
		System.out.println("id: "+this.id+"\nsymbol: "+this.symbol+"\nbuyPrice: "+this.buyPrice+"\nbuyTime: "+this.buyTime+"\ncurrPrice: "+this.sellPrice+"\nsellTime: "+this.sellTime+"\nprofit: "+this.profit);
	}
	
}
