import java.util.*;
import java.util.Arrays;
public class Class1{
	
	//Primitives
	private int classId;
	private String fName;
	private String lName;
	Date DOB = new Date();
	private int classDepN;
	private float rFloat = 0.0f;
	private long rLong = 132877291;
	private short rShort = 1323;
	private byte rByte = (byte)0x08;
	private char rChar = 'r';

	//number classes
	Integer rIntOb = new Integer(12);
	Float rFloatOb = new Float(0.36f);
	Long rLongOb = new Long(32166184);
	Short rShortOb = 241;
	Byte rByteOb = new Byte(rByte);
	Character rCharOb = new Character('t');
	Double rDoubleOb = new Double(464.46);
	
	Integer rIntOb1 = new Integer(9);
	Integer rIntOb2 = new Integer(18);

        Float rFloatOb1 = new Float(4.12f);
	Float rFloatOb2 = new Float(4.12f);

        Long rLongOb1 = new Long(32166184);
	Long rLongOb2 = new Long(32166183);

        Short rShortOb1 = 24145;
	Short rShortOb2 = 24255;

        Byte rByteOb1 = new Byte(rByte);
	Byte rByteOb2 = new Byte(rByte);

        Character rCharOb1 = new Character('t');
	Character rCharOb2 = new Character('s');

        Double rDoubleOb1 = new Double(464.46);
	Double rDoubleOb2 = new Double(464.46);

	
	

	private double salary;
	private double totalSalesAmount = 0.00;
	private int numberOfSales = 0;
	private int currentAssignedCustomers = 0;

	private char[] Expertiselevels = {'a', 'b', 'c', 'd', 'e', 'f'};
	private char levelOfExpertise;
	private int[] depNs = {00, 01, 02, 03, 04, 05, 06, 07};
	private String[] deps = {"General", "Health", "Auto", "Life", "Home", "Travel", "Mortgage", "BoatMotorCycle"};

	private double[] rDArray = {13.98, 23.84, 8493.48, 192.43, 139.49, 1239.89, 12349.23, 12.48};
	private int[] rIntArr = {1, 45, 12, 54, 2, 43,15, 59, 13, 29, 73, 128, 47, 62, 71, 3, 16, 9, 5, 7};

	private boolean goldStatus = false;
	public enum Branch{
		UNASSIGNED,
		SEATLE,
		BOSTON,
		HOUSTON,
		CHICAGO,
		TRENTON,
		PHILEDELPHIA,
		MIAMI,
		SLC,
		LOSANGELS,
		DENVER,
		COLUMBUS,
		ALBANY;
	}
	private Branch branch = Branch.UNASSIGNED;
	
	private int stateNum = 0;
	private char[] rCharArr = {'a', 'b', 'c', 'd', 'e', 'f'};
        private char rCharecter;
        private int[] rStateNArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        private String[] states = {"Alabama", "Aleska", "Arkansas", "California", "Montana", "Wyoming", "SouthDakota", "NorthDakota", "Utah", "Arizona", "Washington"};
	private int numberC = 0;
	private String stringC = "";


// constructor
	Class1(int classId, String fName, String lName){
		this.classId = classId;
		this.fName = fName;
		this.lName = lName;
	}

// methods
	public void setDOB(int year, int month, int day){
		this.DOB = new Date(year, month, day);
	}
	public Date getDOB(){
		return DOB;
	}
	
	public void setClassDepN(int departmentNum){
		boolean check = false;
		for (int i=0; this.depNs.length>i; i++){
			if(departmentNum == this.depNs[i]){
				check = true;
			}
			else {check = false;}
		
		}
		if (check == true){
			this.classDepN = departmentNum;
		}
		else {	this.classDepN = 0;
			System.out.print("Invalid department number. Department number set to 0");
		}
	}	


	public int getClassDepN(){
		return this.classDepN;	
	
	}

	public String getClassDepartmentName(){
		String department = "";
		if (classDepN == 0){
			String depNotFound = "Department not assigned!";
			return depNotFound;
		}
		else {
			int i = 0;
			while (depNs.length>i){
			
			       if(depNs[i] == classDepN){
			      		department = deps[i];
					
			       }	       
			       else { i++; }
			}
		}
		return department;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public double getSalary(){
		if(this.salary == 0){
			return 0;
		}
		else {return this.salary;}
	}

	public void raiseSalary(double percent){
		this.salary = ((percent/100.00) + 1) * this.salary;
	}

	public void addSales(double amount ){
		this.totalSalesAmount = this.totalSalesAmount + amount;
		numberOfSales++;
	}

	public double getTotalsales(){
		return totalSalesAmount;
	}

	public double getAverageSales(){
		double averageSales = totalSalesAmount/numberOfSales;
		return averageSales;
	}

	public int getNumberOfSales(){
		return numberOfSales;
	}

	public int getCurrentAssignedCustomers(){
	
		return currentAssignedCustomers;
	}

	public void setLevelOfExpertise(char level){
		this.levelOfExpertise = level;
	}

	public String getLevelOfExpertise(){
		String levelOfExpertise = "";
		switch(this.levelOfExpertise){
			case 'a':
				levelOfExpertise = this.lName +" has excellent(a) level of expertise";
				
			case 'b':
				levelOfExpertise = this.lName +" has high(b) level of expertise";
                              	
			 case 'c':
				levelOfExpertise = this.lName +" has good(c) level of expertise";
				
			 case 'd':
				levelOfExpertise = this.lName +" has moderate(d) level of expertise";
				
			 case 'e':
				levelOfExpertise = this.lName +" has low(e) level of expertise";
				
			 case 'f':
				levelOfExpertise = this.lName +" has very low(f) level of expertise";
				
			 
		}
		return levelOfExpertise;
	}

	public void setGoldStatus(boolean status){
		this.goldStatus = status;
	}

	public boolean getGoldStatus(){
		return this.goldStatus;
	}

	public void setBranch(Branch branch){
		this.branch = branch;
	
	}

	public void setRFloat(float rFloat){
		this.rFloat = rFloat;
	
	}

	public float getRFloat(){
		return this.rFloat;
	}

	public void setRlong(long rLong){
		this.rLong = rLong;
	}
	
	public long getRLong(){
		return this.rLong;
	}

	public void setRShort(short rShort){
		this.rShort = rShort;
	}

	public short getRShort(){
		return this.rShort;
	}

	public void setRByte(byte rByte){
		this.rByte = rByte;
	}
	
	public byte getRByte(){
		return this.rByte;
	}

	public void setRChar(char rChar){
		this.rChar = rChar;
	}

	public char getRChar(){
		return this.rChar;
	}
	public void setRIntOb(Integer rIntOb){
		this.rIntOb = rIntOb;

	}

	public Integer getIntegerOb(){
		return this.rIntOb;
	
	}

	public void setRFloatOb(Float rFloatOb){
		this.rFloatOb = rFloatOb;
	}
	
	public Float getRFloatOb(){
		return this.rFloatOb;
	}
	
	public void setRLongOb(Long rLongOb){
		this.rLongOb = rLongOb;
	}

	public Long getRLongOb(){
		return this.rLongOb;
	}

	public void setRShortOb(Short rShortOb){
		this.rShortOb = rShortOb;
	
	}
	
	public Short getRShortOb(){
		return this.rShortOb;
	}

	public void setRByteOb(Byte rByteOb){
		this.rByteOb = rByteOb;
	}

	public Byte getRByteOb(){
		return this.rByteOb;
	
	}

	public void setRCharOb(Character rCharOb){
		this.rCharOb = rCharOb;
	}

	public Character getRCharOb(){
		return this.rCharOb;
	}

	public void setRDoubleOb(Double rDoubleOb){
		this.rDoubleOb = rDoubleOb; 
	}

	public Double getRDoubleOb(){
		return this.rDoubleOb;
	
	}

	public boolean intEquals(){
		boolean res = rIntOb1.equals(rIntOb2);
		return res;
	
	}

	public boolean floatEquals(){
		boolean res = rFloatOb1.equals(rFloatOb2);
		return res;
	}

	public boolean longEquals(){
	
		boolean res = rLongOb1.equals(rLongOb2);
		return res;
	}

	public boolean shortEquals(){
	
		boolean res = rShortOb1.equals(rShortOb2);
		return res;
	}

	public boolean byteEquals(){
		boolean res = rByteOb1.equals(rByteOb2);
		return res;
	
	}

	public boolean charEquals(){
		boolean res = rCharOb1.equals(rCharOb2);
		return res;
	}

	public boolean doubleEquals(){
		boolean res = rDoubleOb1.equals(rDoubleOb2);
		return res;
	}

	public String strIntOb1(){
		String value = String.valueOf(rIntOb1);
		return value;
	}
	
	public String strIntOb2(){
		String value = String.valueOf(rIntOb2);
		return value;
	}

	public String strFloatOb1(){
		String value = String.valueOf(rFloatOb1);
		return value;
	}

	public String strFloatOb2(){
		String value = String.valueOf(rFloatOb2);
		return value;
	}

	public String strLongOb1(){
		String value = String.valueOf(rLongOb1);
		return value;
	}

	public String strLongOb2(){
		String value = String.valueOf(rLongOb2);
		return value;
	}

	public String strShortOb1(){
		String value = String.valueOf(rShortOb1);
		return value;
	
	}

	public String strShortOb2(){
		String value = String.valueOf(rShortOb2);
		return value;
	}

	public String strCharOb1(){
		String value = String.valueOf(rCharOb1);
		return value;
	
	}

	public String strCharOb2(){
		String value = String.valueOf(rCharOb2);
		return value;
	
	}

	public String strDoubleOb1(){
		String value = String.valueOf(rDoubleOb1);
		return value;
	}

	public String strDoubleOb2(){
		String value = String.valueOf(rDoubleOb2);
		return value;
	}

	public double[] sortRDArray(){
		double[] copyArr = Arrays.copyOf(rDArray,rDArray.length);
		Arrays.sort(copyArr);
		return copyArr;
	}

	public int[] sortRInt(){
		int[] copyArr = Arrays.copyOf(rIntArr, rIntArr.length);
		Arrays.sort(copyArr);
		return copyArr;
	}

	public double[] getRDArray(){
		return rDArray;
	
	}
	
	public int[] getRIntArr(){
		return rIntArr;
	
	}

	public void setStateNum(int stateNum){
                boolean check = false;
                for (int i=0; this.rStateNArr.length>i; i++){
                        if(stateNum == this.rStateNArr[i]){
                                check = true;
                        }
                        else {check = false;}
                }
                if (check == true){
			this.stateNum = stateNum;
                }
                else {this.stateNum = 0;
                System.out.print("Invalid department number. Department number set to 0");}

        }

	public int getStateNum(){
                return this.stateNum;

        }

	public String getStateName(){

		String state = "";
                if (stateNum == 0){
                        String stateNotFound = "Department not assigned!";
                        return stateNotFound;
                }
                else {
                        int i = 0;
                        while (rStateNArr.length>i){

                               if(rStateNArr[i] == stateNum){
                                        state = states[i];
					
                               }
                               else { i++; }
                        }
                }
		return state;
        }

	public void setNumberC(int numberC){
		this.numberC = numberC;
	
	}

	public int getNumberC(){
		return this.numberC;
	}

	public void setStringC(String stringC){
		this.stringC = stringC;
	
	}

	public String getStringC(){
		return this.stringC;
	
	}







}
