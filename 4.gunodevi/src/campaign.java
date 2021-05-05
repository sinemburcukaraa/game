
public class campaign{
	private int id;
	private String campaignName;
	private double campaignRate;

	public campaign(int id, String campaignName, Double campaignRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignRate() {
		return campaignRate;
	}
	public void setCampaignRate(Double campaignRate) {
		this.campaignRate = campaignRate;
	}

}
