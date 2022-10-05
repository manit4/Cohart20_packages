package com.onework.signup;//If you are creating class in any package, then your file will have package statement on top

import com.onework.Car;

public class Main {
	
	public static void main(String[] args) {
		
		
	}
}




////import com.onework.*;// ".*" following the package name means that you want the complete package holding all the classes
//						//imported which is not recommended since you might need not to use all the classess
//						//being imported so instead of importing the whole package, just import the 
//						//required classes individually... 
//import com.onework.First;//Here, I am simply importing the class which is required for my program
//							//to run successfully... which is recommended... 
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		First f = new First();
//		
//		f.add();
//		
//		System.out.println(f.i);
//		
//	}
//
//}

//private memebers can not be accessed outside of its own class...So the best way to declare any member
//private is to create global variables private in order to not to be accessed directly by other class 
//but to update or access variables through methods and we create methods accessible mostly public
//and that is how we achieve Encapsulation by keeping our variables(Global) private but methods public...  


//default has access only inside its own package, mind this that there is no keyword as default. But
//if you want to declare any member as default, just make it without any of these keyword such as
//public , protected, private. If system does not find any keyword such as public, private, protected then
//it is automatically default

//public have access all over the project irrespective of the package/s

//protected has access in its own package and in different package also but through inheritance that 
//means you have sub-class...

//A class can be declared either public or default. That means, class can not be declared private 
// or protected...

//If you have any class public in java file, make sure that class name and the file
//name are same. 

