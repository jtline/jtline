//today testing the reflection of InvocationHandler
//useing the InvocationHandler inv = new xxxxx();
//but can not using the xxxxx.method that doesnt mention in IncovationHandler;
//So i realize that using the instance from Implements 
// A  a = new B() you can only using the A method
// B  b = new B() you can use all the b method
//for example

import java.util.*;
public class demo {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.clone();//this will show error
        ArrayList<String>list2 = new ArrayList<>();
        list2.clone();
        
    }
}
