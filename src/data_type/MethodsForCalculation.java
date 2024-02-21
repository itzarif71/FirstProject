package data_type;

public class MethodsForCalculation {

	public static void information() {
		String info="This is area calcuting program";
		
		System.out.println(info);
	}
	
     public static void userinformation (String name,int age) {
          System.out.println("Hi "+name+"("+age+")"+"we will find your house construction price");	
            	
            }
    public static int perimeter(int x, int y) {
    	int perimeter= (x+y)*2;
    	return perimeter;
    	
    }
   
    public static int totalbricks(int perimeter,int sizebrick) {
    	int totalbricks= perimeter/sizebrick;
    	return totalbricks;
    }
    
    public static int totalbricksprice(int totalbricks,int bricksprice) {
    	int totalbricksprice= totalbricks * bricksprice;
    	return totalbricksprice;
    }
    
    
    public static int areaoftiles(int length,int breath) {
    	int areaoftiles = length*breath;
    	return areaoftiles;
    	
    }
    
    public static int needtiles(int areaoftiles, int tsize ) {
    	int needtiles = areaoftiles / tsize ;
    	return needtiles; 
    	
    }
    
    public static int labourcost(int areaoftiles, int persquaretileprice ) {
    	int labourcost =  areaoftiles * persquaretileprice;
    	return labourcost;
    	
    }
    
    public static int totaltilessprice(int needtiles,int tilesprice) {
    	int  totaltilessprice= needtiles * tilesprice;
    	return  totaltilessprice;
    
    }
    
    public static void totalhousecost(int totalbricksprice,int totaltilessprice,int labourcost  ) {
    	int totalhousecost= totalbricksprice + totaltilessprice + labourcost;
    	System.out.println("The Total House Cost = " +totalhousecost);
    }
    
    
    
    
    
}
