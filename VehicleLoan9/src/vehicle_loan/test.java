package vehicle_loan;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle vh= new vehicle("AP12ER5670", "Maruti alto", "2 wheeler", 150000);
		double issueLoan= vh.issueLoan();
		double takeInsurance= vh.takeInsurance();
		
		System.out.println("Loan for the vehicle : "+issueLoan);
		System.out.println("Insurance for the vehicle : "+ takeInsurance);
	}

}
