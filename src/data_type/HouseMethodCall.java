package data_type;

public class HouseMethodCall {
	public static void main(String[]args) {
		int length=10;
		int breath=20;
		int sizebrick=2;
		int bricksprice=5;
		int tsize=4;
		int persquaretileprice=22;
		int tilesprice=5;
		
		MethodsForCalculation.information();
		
		
		MethodsForCalculation.userinformation("arif",20);
		
		
		int perimeter=MethodsForCalculation.perimeter(length, breath);
		System.out.println("perimeter of lengh and breth = "+ perimeter);
		
		
		
		int totalbricks=MethodsForCalculation.totalbricks(perimeter,sizebrick);
		System.out.println("total bricks area = " +totalbricks);
		
		
		int totalbricksprice=MethodsForCalculation.totalbricksprice(totalbricks, bricksprice);
		System.out.println("total bricks price = " +totalbricksprice);
		
		
		int areaoftiles=MethodsForCalculation.areaoftiles(length, breath);
		System.out.println("area of tiles is = "+ areaoftiles);
		
		
		int needtiles=MethodsForCalculation.needtiles(areaoftiles, tsize);
		System.out.println("total tiles we need = "+ needtiles);
		
		
		int labourcost=MethodsForCalculation.labourcost(areaoftiles, persquaretileprice);
		System.out.println("total labour cost = " + labourcost);
		
		
		int totaltilessprice=MethodsForCalculation.totaltilessprice(needtiles, tilesprice);
		System.out.println("total tiles price = " + totaltilessprice);
		
		
		MethodsForCalculation.totalhousecost(totalbricksprice, totaltilessprice, labourcost);
	
		
		
	}

}
