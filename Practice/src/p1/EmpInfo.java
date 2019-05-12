package p1;

public class EmpInfo {
	
	static String[] empHead = {"EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"};
	static String[][] empTable = {	{"1001", "Ashish", "01/04/2009", "e", "R&D"          , "20000", "8000" , "3000" },
									{"1002", "Sushma", "01/04/2012", "c", "PM"           , "30000", "12000", "9000" },
									{"1003", "Rahul" , "01/04/2008", "k", "Acct"         , "10000", "8000" , "1000" },
									{"1004", "Chahat", "01/04/2013", "r", "FrontDesk"    , "12000", "6000" , "2000" },
									{"1005", "Ranjan", "01/04/2005", "m", "Engg"         , "50000", "20000", "20000"},
									{"1006", "Suman" , "01/04/2000", "e", "Manufacturing", "23000", "9000" , "4400" },
									{"1007", "Tanmay", "01/04/2006", "c", "PM"           , "29000", "12000", "10000"}	};
	
	static String[] daHead = {"DesignationCode", "Designation", "DA"};
	static String[][] daTable = {	{"e", "Engineer"    , "20000"},
									{"c", "Consultant"  , "32000"},
									{"k", "Clerk"       , "12000"},
									{"r", "Receptionist", "15000"},
									{"m", "Manager"     , "40000"}	};

	public static String[] getEmployee(int EmpNo) {
		int rowSize = empTable.length;
		int colSize = empTable[0].length;
		String[] employee = new String[colSize];
		
		for (int i = 0; i < rowSize; i++) {
			if(EmpNo == Integer.parseInt(empTable[i][0])) {
				for (int j = 0; j < colSize; j++) {
					employee[j] = empTable[i][j];
//					System.out.print(empTable[i][j] + ", ");
				}
				
			}
			
		}
		return employee;
	}
	
	public static String[] getDA(String DesignationCode) {
		int rowSize = daTable.length;
		int colSize = daTable[0].length;
		String[] da = new String[colSize];
		
		for (int i = 0; i < rowSize; i++) {
			if (DesignationCode.equals(daTable[i][0])) {
				for (int j = 0; j < colSize; j++) {
					da[j] = daTable[i][j];
//					System.out.print(daTable[i][j] + ", ");	
				}
				
			}
			
		}
		return da;
	}

	public static void main(String[] args) {
		try {
			String[] employee = getEmployee(Integer.parseInt(args[0]));
			String DesignationCode = employee[3]; //Arrays.asList(empHead).indexOf("DesignationCode")
			String[] da = getDA(DesignationCode);
			String Designation = da[1]; //Arrays.asList(daHead).indexOf("Designation")
			
			int Basic = Integer.parseInt(employee[5]); //Arrays.asList(empHead).indexOf("Basic")
			int HRA = Integer.parseInt(employee[6]); //Arrays.asList(empHead).indexOf("HRA")
			int IT = Integer.parseInt(employee[7]); //Arrays.asList(empHead).indexOf("IT")
			int DA = Integer.parseInt(da[2]); //Arrays.asList(daHead).indexOf("DA")
			int salary = Basic + HRA - IT + DA;
			
			System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
			for (int i = 0; i < 56; i++) System.out.print("=");
			System.out.println();
			System.out.printf("%-10s%-10s%-15s%-15s%-10s", employee[0], employee[1], employee[4], Designation, salary);
					
		}
		catch (Exception e) {
			System.out.print("There is no employee with empId: " + args[0]);
		}
		
	}

}