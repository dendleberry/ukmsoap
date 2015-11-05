package uk.gov.dvla.osg;

public class OutgoingItems {
	private String appName;
	private String batchRef;
	private String scid;
	private String inClass;
	private String dps;
	private int itemID;
	private String format;
	private String machineable;
	private String mailType;
	private int noOfAddressLines;
	private String postcode;
	private String product;
	private String bagItemLink;
	private int weight;
	
	public void print(){
		System.out.println("Class:" + inClass +"\nDPS:" + dps + "\nitemID:" + itemID + "\nformat:" + format +
				"\nmachineable:" + machineable + "\nmailtype:" + mailType + "\nnoOfAddressLines:" + noOfAddressLines +
				"\npostcode:" + postcode + "\nproduct:" + product + "\nspare8:" + bagItemLink +
				"\nweight:"+ weight);
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBatchRef() {
		return batchRef;
	}

	public void setBatchRef(String batchRef) {
		this.batchRef = batchRef;
	}

	public String getScid() {
		return scid;
	}

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getInClass() {
		return inClass;
	}
	public void setInClass(String inClass) {
		this.inClass = inClass;
	}
	public String getDps() {
		return dps;
	}
	public void setDps(String dps) {
		this.dps = dps;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getMachineable() {
		return machineable;
	}
	public void setMachineable(String machineable) {
		this.machineable = machineable;
	}
	public String getMailType() {
		return mailType;
	}
	public void setMailType(String mailType) {
		this.mailType = mailType;
	}
	public int getNoOfAddressLines() {
		return noOfAddressLines;
	}
	public void setNoOfAddressLines(int noOfAddressLines) {
		this.noOfAddressLines = noOfAddressLines;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getBagItemLink() {
		return bagItemLink;
	}
	public void setBagItemLink(String bagItemLink) {
		this.bagItemLink = bagItemLink;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}