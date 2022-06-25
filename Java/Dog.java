class Doggie{
	String name;
	String color;
	int cost;
}


class Dog{
	public static void main(String[]args){
		Doggie d1;
		d1 = new Doggie();
		d1.name = "ramu";
		d1.color = "black";
		d1.cost = 10000;

		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1);
		
	}
}