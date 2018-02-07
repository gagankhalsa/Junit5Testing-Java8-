package chap2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import chap2.Apple.ApplePredicate;

public class FilteringApplesPredicates {
public static void main(String[] args) {
	List<Apple>inventory=Arrays.asList(new Apple(80,"green"),new Apple(300,"red"),new Apple(160,"green")
			,new Apple(200,"red"),new Apple(60,"green"));
	List<Apple> heavyapples=filterApplebyWeight(inventory, 150);
			System.out.println(heavyapples);
	List<Apple> green=filterGreenApples(inventory);
			System.out.println(green);
	List<Apple>green1=filter(inventory, new AppleColorPredicate());
	        System.out.println("Predicate"+green1);
	List<Apple>redandheavy=filter(inventory, new AppleRedandHeavyPredicate());
	        System.out.println("Predicate"+redandheavy);
}

/**
 * @param invent
 * @param weight
 * @return
 */
public static List<Apple> filterApplebyWeight(List<Apple> invent,int weight){
	List<Apple> result=new ArrayList<>();
	for(Apple apple:invent)
	{
		if (apple.getWeight()>weight) {
			result.add(apple);
			
		}
	}
	return result;
	
}
public static List<Apple> filter(List<Apple>invent,ApplePredicate p) {
	List<Apple>result=new ArrayList<>();
	for(Apple apple:invent)
	{
		if (p.test(apple)) {
			result.add(apple);
		}
	}
	return result;
	
}




 public static List<Apple> filterGreenApples (List<Apple> invent) {
	 List<Apple> result=new ArrayList<>();
	 for(Apple apple:invent)
	 {
		 if ("green".equals(apple.getColor())) {
			result.add(apple);
		}
	 }
	 
	return result;
     
}
}
 class Apple {
	 int weight;
	 String color;
	 
public Apple(int weight, String color) {

		this.weight = weight;
		this.color = color;
	}
public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Apple [ color="+color+", weight="+weight+"]";
	}
	interface ApplePredicate{
		public boolean test(Apple apple);
	}
   }
 class AppleweightPedicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight()>150;
	}
    }
 class AppleColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "green".equals(apple.getColor());
	} 
 }
 class AppleRedandHeavyPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "red".equals(apple.getColor())
				&&apple.getWeight()>150;
	}
	 
 }