package models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class WazirxClass {
	private String symbol;
	private String baseAsset;
	private String quoteAsset;
	private double openPrice;
	private double lowPrice;
	private double highPrice;
	private double lastPrice;
	private double volume;
	private double bidPrice;
	private double askPrice;
	private long at;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getBaseAsset() {
		return baseAsset;
	}
	public void setBaseAsset(String baseAsset) {
		this.baseAsset = baseAsset;
	}
	public String getQuoteAsset() {
		return quoteAsset;
	}
	public void setQuoteAsset(String quoteAsset) {
		this.quoteAsset = quoteAsset;
	}
	public double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public double getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	public double getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}
	public long getAt() {
		return at;
	}
	public void setAt(long at) {
		this.at = at;
	}
	
	@Override
	public String toString() {
		return "WazirxClass [symbol=" + symbol + ", baseAsset=" + baseAsset + ", quoteAsset=" + quoteAsset
				+ ", openPrice=" + openPrice + ", lowPrice=" + lowPrice + ", highPrice=" + highPrice + ", lastPrice="
				+ lastPrice + ", volume=" + volume + ", bidPrice=" + bidPrice + ", askPrice=" + askPrice + ", at=" + at
				+ "]";
	}
}
