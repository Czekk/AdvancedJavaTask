package foobar;

public class Class2{

	private int int1;
	private int int2;
	private int int3;
	private int int4;
	
	private float float1;
	private float float2;
	private float float3;
	private float float4;

	private double double1;
	private double double2;
	private double double3;
	private double double4;

	private long long1;
	private long long2;
	private long long3;
	private long long4;

	private short short1;
	private short short2;
	private short short3;
	private short short4;
	private short short5;
	
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;


	private int[] intArr1 = {1, 3, 4, 5, 67, 2, 23, 43, 21, 83, 242, 82, 89, 15, 36 };
	private double[] doubleArr1 = {12.45, 244.43, 32.56, 42.56, 232.54, 983.23, 237.35};
	private long[] longArr1 = {1271721, 171871, 3821381, 317381, 1891362, 228382,323342};
	private short[] shortArr1 = {123, 333, 225, 482, 244, 424, 344};
	private char[] charArr1 = {'w', 'r', 'd', 'f', 'n', 'h', 'o', 'p', 'q', 'c', 'a'};
	
	private String[] stringArr1 = {"Tobias", "John", "Mendes", "Derrick", "Stavinski", "Peter", "Yale"};

	private byte tByte = (byte)0x30;

	Integer IntOb = new Integer(12);
        Float FloatOb = new Float(0.36f);
        Long LongOb = new Long(32166184);
        Short ShortOb = 241;
        Byte ByteOb = new Byte(tByte);
        Character CharOb = new Character('t');
        Double DoubleOb = new Double(464.46);

        Integer IntOb1 = new Integer(9);
        Integer IntOb2 = new Integer(18);

        Float FloatOb1 = new Float(4.12f);
        Float FloatOb2 = new Float(4.12f);

        Long LongOb1 = new Long(32166184);
        Long LongOb2 = new Long(32166183);

        Short ShortOb1 = 24145;
        Short ShortOb2 = 24255;

        Byte ByteOb1 = new Byte(tByte);
        Byte ByteOb2 = new Byte(tByte);

        Character CharOb1 = new Character('t');
        Character CharOb2 = new Character('s');

        Double DoubleOb1 = new Double(464.46);
        Double DoubleOb2 = new Double(464.46);



	// constructor
        public Class2(int int1, String string1, String string2){
                this.int1 = int1;
                this.string1 = string1;
                this.string2 = string2;
        }


	public void setInt1(int int1){
                  this.int1 = int1;
          }
  
        public int getInt1(){
                  return this.int1;
         }

	public void setInt2(int int2){
                this.int2 = int2;
        }

        public int getInt2(){
                return this.int2;
        }
	
	 public void setInt3(int int3){
                this.int3 = int3;
        }

        public int getInt3(){
                return this.int3;
        }
	
	 public void setInt4(int int4){
                this.int4 = int4;
        }

        public int getInt4(){
                return this.int4;
        }



	public void setFloat1(float float1){
                this.float1 = float1;
        }

        public float getFloat1(){
                return this.float1;
        }

	public void setFloat2(float float2){
                this.float2 = float2;
        }

        public float getFloat2(){
                return this.float2;
        }
	
	public void setFloat3(float float3){
                this.float3 = float3;
        }

        public float getFloat3(){
                return this.float3;
        }
	
	public void setFloat4(float float4){
                this.float4 = float4;
        }

        public float getFloat4(){
                return this.float4;
        }


	public void setDouble1(double double1){
                this.double1 = double1;
        }

        public double getDouble1(){
                return this.double1;
        }

	public void setDouble2(double double2){
                this.double2 = double2;
        }

        public double getDouble2(){
                return this.double2;
        }
	
	public void setDouble3(double double3){
                this.double3 = double3;
        }

        public double getDouble3(){
                return this.double3;
        }
	
	public void setDouble4(double double4){
                this.double4 = double4;
        }

        public double getDouble4(){
                return this.double4;
        }

	
	public void setLong1(long long1){
                this.long1 = long1;
        }

        public long getLong1(){
                return this.long1;
        }


	public void setLong2(long long2){
                this.long2 = long2;
        }

        public long getLong2(){
                return this.long2;
        }
	
	public void setLong3(long long3){
                this.long3 = long3;
        }

        public long getLong3(){
                return this.long3;
        }
	
	public void setLong4(long long4){
                this.long4 = long4;
        }

        public long getLong4(){
                return this.long4;
        }


	public void setShort1(short short1){
                this.short1 = short1;
        }

        public short getShort1(){
                return this.short1;
        }

	public void setShort2(short short2){
                this.short2 = short2;
        }

        public short getShort2(){
                return this.short2;
        }
	
	public void setShort3(short short3){
                this.short3 = short3;
        }

        public short getShort3(){
                return this.short3;
        }
	
	public void setShort4(short short4){
                this.short4 = short4;
        }

        public short getShort4(){
                return this.short4;
        }


	public void setString1(String string1){
                this.string1 = string1;
        }

        public String getString1(){
                return this.string1;
        }
	
	public void setString2(String string2){
                this.string2 = string2;
        }

        public String getString2(){
                return this.string2;
        }
	
	public void setString3(String string3){
                this.string3 = string3;
        }

        public String getString3(){
                return this.string3;
        }
	
	public void setString4(String string4){
                this.string4 = string4;
        }

        public String getString4(){
                return this.string4;
        }
public void setString5(String string5){
                this.string5 = string5;
        }

        public String getString5(){
                return this.string5;
        }



   

	public String getIntArr1(){
		
		String intArr1String = "";
		for(int i=0 ; intArr1.length>i ; i++){
			intArr1String = intArr1String + ", " + String.valueOf(intArr1[i]);
		
		}
		return intArr1String;
	}



	 public String getDoubleArr1(){

                String a = "";
                for(int i=0 ; doubleArr1.length>i ; i++){
                        a = a + ", " + String.valueOf(doubleArr1[i]);

                }
                return a;
        }

	
	 public String getLongArr1(){

                String a = "";
                for(int i=0 ; longArr1.length>i ; i++){
                        a = a + ", " + String.valueOf(longArr1[i]);

                }
                return a;
        }
	
	 public String getShortArr1(){

                String a = "";
                for(int i=0 ; shortArr1.length>i ; i++){
                        a = a + ", " + String.valueOf(shortArr1[i]);

                }
                return a;
        }
	

	public String getCharArr1(){

                String a = "";
                for(int i=0 ; charArr1.length>i ; i++){
                        a = a + ", " + String.valueOf(charArr1[i]);

                }
                return a;
        }

	public String getStringArr1(){

                String a = "";
                for(int i=0 ; stringArr1.length>i ; i++){
                        a = a + ", " + stringArr1[i];

                }
                return a;
        }

	

	
	public void setIntOb(Integer IntOb){
                this.IntOb = IntOb;

        }

        public Integer getIntegerOb(){
                return this.IntOb;

        }

        public void setFloatOb(Float FloatOb){
                this.FloatOb = FloatOb;
        }

        public Float getFloatOb(){
                return this.FloatOb;
        }

        public void setLongOb(Long LongOb){
                this.LongOb = LongOb;
        }

        public Long getLongOb(){
                return this.LongOb;
        }

        public void setShortOb(Short ShortOb){
                this.ShortOb = ShortOb;

        }

        public Short getShortOb(){
                return this.ShortOb;
        }

	
	 public void setByteOb(Byte ByteOb){
                this.ByteOb = ByteOb;
        }

        public Byte getByteOb(){
                return this.ByteOb;

        }

        public void setCharOb(Character CharOb){
                this.CharOb = CharOb;
        }

        public Character getCharOb(){
                return this.CharOb;
        }

        public void setDoubleOb(Double DoubleOb){
                this.DoubleOb = DoubleOb;
        }

        public Double getDoubleOb(){
                return this.DoubleOb;

        }
	
	
	public boolean intEquals(){
                boolean res = IntOb1.equals(IntOb2);
                return res;

        }

        public boolean floatEquals(){
                boolean res = FloatOb1.equals(FloatOb2);
                return res;
        }

        public boolean longEquals(){

                boolean res = LongOb1.equals(LongOb2);
                return res;
        }

        public boolean shortEquals(){

                boolean res = ShortOb1.equals(ShortOb2);
                return res;
        }

        public boolean byteEquals(){
                boolean res = ByteOb1.equals(ByteOb2);
                return res;

        }

        public boolean charEquals(){
                boolean res = CharOb1.equals(CharOb2);
                return res;
        }

	// ref
	public boolean doubleEquals(){
                boolean res = DoubleOb1.equals(DoubleOb2);
                return res;
        }

        public String strIntOb1(){
                String value = String.valueOf(IntOb1);
                return value;
        }

        public String strIntOb2(){
                String value = String.valueOf(IntOb2);
                return value;
        }

        public String strFloatOb1(){
                String value = String.valueOf(FloatOb1);
                return value;
        }

        public String strFloatOb2(){
                String value = String.valueOf(FloatOb2);
                return value;
        }

        public String strLongOb1(){
                String value = String.valueOf(LongOb1);
                return value;
        }

        public String strLongOb2(){
                String value = String.valueOf(LongOb2);
                return value;
        }

	public String strShortOb1(){
                String value = String.valueOf(ShortOb1);
                return value;

        }

        public String strShortOb2(){
                String value = String.valueOf(ShortOb2);
                return value;
        }

        public String strCharOb1(){
                String value = String.valueOf(CharOb1);
                return value;

        }

        public String strCharOb2(){
                String value = String.valueOf(CharOb2);
                return value;

        }

        public String strDoubleOb1(){
                String value = String.valueOf(DoubleOb1);
                return value;
        }

        public String strDoubleOb2(){
                String value = String.valueOf(DoubleOb2);
                return value;
        }



}
