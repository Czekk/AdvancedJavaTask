
public class CzerintonHwWk1{

private   int rInt= 6;
private byte rByte= (byte) 0x03;
private   short rShort= 10;
private   long rLong= 12561025;
private   float rFloat= 4.2f;
private   double rDouble= 9.56;
private   boolean rBoo= false;
private   char rChar = 'c';
private   int [] rArray = new int[]{7,8,9,10,11,12,-10,-11,-12,-13};
  //methods.. 
   public int getMyInt() {System.out.println("Int retrieved is: ");return rInt;}
   public byte getMyByte() {System.out.println("Byte retrieved is: ");return rByte;}
   public short getMyShort() {System.out.println("short retrieved is: ");return rShort;}
   public long getMyLong() {System.out.println("Long retrieved is: ");return rLong;}
   public float getMyFloat() {System.out.println("Float retrieved is: ");return rFloat;}
   public double getMyDouble() {System.out.println("Double retrieved is: ");return rDouble;}
   public boolean getMyBoolean() {System.out.println("Boolean retrieved is: ");return rBoo;}
   public char getMyChar() {System.out.println("Char retrieved is: ");return rChar;}
  
   // getMyArray method using a loop
   public String getMyArray(){
            String list="";
            for(int x: rArray){
            list=list+ " " + Integer.toString(x);
            }
            return list;
      }
   
   //method using if else
   public boolean useAnIfElseStatement(){
      boolean x;
      if (rInt==6) {x= true;}
         else {x=false;}
         System.out.println("Results is :");
      return x;
      }
     
     // method using while loop
    public int useAWhileLoop(){
      int i=0;
      int x=0;
  System.out.println("Sum of integers less than my short is: ");
      while(rShort>i){
        x=x+i;
        i++;}
    return x;
    }
    
    //method using And Comparator
    public boolean useAndComparator(){
      boolean foo;
      if (rInt==6 && rShort==10){
            foo= true;}
            else{foo= false;}
      System.out.println("And comparison is: ");
      return foo;
    }
    
    //method using Or Comparator
    public boolean useOrComparator(){
      boolean bar;
      if (rDouble==9.56 || rBoo==true){
         bar=true;}
         else {bar= false;}
         System.out.println("Or comparison is; ");
         return bar;
    }
      //main mathod     
   public static void main(String[]args){
      CzerintonHwWk1 hw1 = new CzerintonHwWk1();
      System.out.println(hw1.getMyInt());
      System.out.println(hw1.getMyByte());
      System.out.println(hw1.getMyShort());
      System.out.println(hw1.getMyLong());
      System.out.println(hw1.getMyFloat());
      System.out.println(hw1.getMyDouble());
      System.out.println(hw1.getMyBoolean());
      System.out.println(hw1.getMyChar());
      System.out.println(hw1.getMyArray());
      
      System.out.println(hw1.useAnIfElseStatement());
      System.out.println(hw1.useAWhileLoop());
      System.out.println(hw1.useAndComparator());
      System.out.println(hw1.useOrComparator());
     
      
       }
   
   }
