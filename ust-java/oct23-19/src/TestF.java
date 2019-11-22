
public class TestF {
public static void main(String[] args) {
//	cannot create object for abstract class
	Dog d1 = new Dog();
	Cat c1 = new Cat();
	Lion l1 = new Lion();
	Snake s1 = new Snake();
	s1.makeNoise();
	d1.makeNoise();
	c1.makeNoise();
	l1.makeNoise();
}
}
