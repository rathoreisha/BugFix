package Com.bugfix;

class Cat
{
	int j;
	public Cat(int j) {
		this.j=j;
	}
}
class Dog 
{
	Cat cat;
	int i;
	public Dog(Cat c,int i) {
		this.i=i;
		this.cat=c;
	}
	public Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();
		
	}
}
public class Shallow_clonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c1=new Cat(20);
		Dog d1=new Dog(c1,10);
		System.out.println(d1.i+".."+c1.j);
		Dog d2=(Dog) d1.clone();
		d1.i=100;
		d1.cat.j=200;
		System.out.println(d2.i+".."+c1.j);
		
		
	}

}

