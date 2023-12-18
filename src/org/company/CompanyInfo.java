package org.company;

public class CompanyInfo {
	
//	Methods     :companyName(),companyId(),companyAddress()

 private void companyName() {
	 System.out.println("Amazon");
	 

}
 private void companyId() {
	 System.out.println("168371");

}
 private void companyAddress() {
	 System.out.println("Bangalore");
	 
}
 private void companySalary() {
System.out.println("750000RS");
}

 
 public static void main(String[] args) {
	 
	CompanyInfo comp = new CompanyInfo();
	comp.companyAddress();
	comp.companyName();
	comp.companyId();
	
	
			
}
}
