package bill_demo;

public class GoodsInOut {

  private String id;

  private String voucherNo;

  private String productId;

  private String productName;

  private String voucherCode;

  private String type;

  private Float inQuantity;

  private Float outQuantity;

  private Float price;

  private String unit;
  
  

public GoodsInOut(String id, String voucherNo, String productId, String productName, String voucherCode, String type,
		Float inQuantity, Float outQuantity, Float price, String unit) {
	super();
	this.id = id;
	this.voucherNo = voucherNo;
	this.productId = productId;
	this.productName = productName;
	this.voucherCode = voucherCode;
	this.type = type;
	this.inQuantity = inQuantity;
	this.outQuantity = outQuantity;
	this.price = price;
	this.unit = unit;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getVoucherNo() {
	return voucherNo;
}

public void setVoucherNo(String voucherNo) {
	this.voucherNo = voucherNo;
}

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getVoucherCode() {
	return voucherCode;
}

public void setVoucherCode(String voucherCode) {
	this.voucherCode = voucherCode;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Float getInQuantity() {
	return inQuantity;
}

public void setInQuantity(Float inQuantity) {
	this.inQuantity = inQuantity;
}

public Float getOutQuantity() {
	return outQuantity;
}

public void setOutQuantity(Float outQuantity) {
	this.outQuantity = outQuantity;
}

public Float getPrice() {
	return price;
}

public void setPrice(Float price) {
	this.price = price;
}

public String getUnit() {
	return unit;
}

public void setUnit(String unit) {
	this.unit = unit;
}
  
  
}