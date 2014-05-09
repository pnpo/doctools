package pt.uminho.di.reolang.reclang;

import java.lang.reflect.Method;

public class LoadMain {
	public static void main(String[] args){
		try {  
            Class c = Class.forName( "OverlapP" ); 
            Method m = c.getDeclaredMethod("main",  new Class[]{String[].class}) ;
            m.invoke(null, new Object[] {null});
            
//            Method m[] = c.getDeclaredMethods() ;
//            for (int i = 0; i < m.length; i++) {  
//            	System.out.println( m[i].toString() );  
//            }  
            
            
		}  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
	}
}
