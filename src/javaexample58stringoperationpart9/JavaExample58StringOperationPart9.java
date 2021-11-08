
package javaexample58stringoperationpart9;


public class JavaExample58StringOperationPart9 {

    // comparator
    
    public static void main(String[] args) {
        
        
        String s1=new String("tom");
        String s2=new String("tom");
        String s3=new String("TOm");
        String s4=s1;
        
        boolean b1= (s1==s2); // ref comparasion
        boolean b2= (s1==s4);
        boolean b3=s1.equals(s2); // content comparasion
        boolean b4=s2.equals(s3);
        boolean b5=s2.equalsIgnoreCase(s3);
        
        System.out.println("First string: "+s1);
        System.out.println("Second string: "+s2);
        System.out.println("Third string: "+s3);
        System.out.println("Fourth string (first string and fourth string are same ref): "+s4);
        System.out.println( );
        
        System.out.println("Reference comparasion (s1 , s2): same ref? -> "+b1);
        System.out.println("Reference comparasion (s1 , s4): same ref? -> "+b2);
        System.out.println("String contents comparasion (s1 , s2): same content? -> "+b3);
        System.out.println("String contents comparasion (s2 , s3): same content? -> "+b4);
        System.out.println("String contents comparasion (s2 , s3) with ignore letters case: same content (ignore letters case)? -> "+b5);
        
        
    }
    
}
