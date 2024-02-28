package vehicle_loan;

public class vehicle implements Loan, Insurance{
	private String vehicleNumber;
	private String modalName;
	private String vehicleType;
	private double price;
	 
	public vehicle(String vehicleNumber, String modalName, String vehicleType, double price){
		this.vehicleNumber=vehicleNumber;
		this.modalName=modalName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModalName() {
		return modalName;
	}
	public void setModalName(String modalName) {
		this.modalName = modalName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

    @Override
    public double issueLoan() {
    	if(vehicleType.equals("4 wheeler")){
    		return price * 0.80;
    	}else if(vehicleType.equals("3 wheeler")){
    		return price* 0.75;
    	}else if(vehicleType.equals("2 wheeler")) {
    		return price *0.50;
    	}
		return 0;
    }
	
	@Override
	public double takeInsurance() {
		// TODO Auto-generated method stub
		if(price<=150000) {
			return 3500.00;
		}else if(price>=150000 && price<=300000) {
			return 4000.00;
		}else {
			return 500.00;
		}
	}

}
