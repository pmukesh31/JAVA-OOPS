// // // //import javax.script.ScriptEngineManager;

// // // // import java.lang.invoke.TypeDescriptor;

// // // // class MyThread extends Thread{
// // // //     public void run(){
// // // //         for(int i=0;i<5;i++)
// // // //         {
// // // //             try{
// // // //                 sleep((int)(Math.random()*5000));
// // // //             }
// // // //             catch(InterruptedException e)
// // // //             {
// // // //                 System.out.println(i);
// // // //             }
// // // //         }
// // // //     }
// // // // }
// // // // public class Demonstration_1{
// // // //     public static void main(String args[])
// // // //     {
// // // //         new MyThread().start();
// // // //         new MyThread().start();
// // // //         System.out.println("DOne");
// // // //     }
// // // // }
// // // import java.util.Scanner;
// // // public class Demonstration_1
// // // {
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.print("Enter the String: ");
// // //         String s=sc.nextLine();
// // //         prinString(s);



// // //     }
// // //     static void prinString(String a)
// // //     {
// // //         int sum=0;
// // //         String temp="0";
// // //         String res="";
// // //         boolean flag=false;
// // //         for(int i=0;i<a.length();i++)
// // //         {
// // //             if(Character.isDigit(a.charAt(i))){
// // //                 flag=true;
// // //             temp+=a.charAt(i);
// // //             }
            
        
// // //         else{
// // //             sum+=Integer.parseInt(temp);
// // //             temp="0";
// // //             res+=a.charAt(i);

// // //         }

// // //         }
// // //         for(int i=0;i<res.length();i++)

// // //         // {
// // //             System.out.print(res.charAt(i));
// // //         }
// // //         System.out.println(sum);
    
// // // }}
// // import java.util.*;
// // public class Demonstration_1{
// //     public static void main(String args[])
// //     {
// //         int nums[]={1,2,2,1};
// //         int num2[]={2,2};
// //         int ans[]=intersect(nums,num2);
// //         for(int x:ans)
// //         {
// //             System.out.print(x);
// //         }
// //     }


// //      static int[] intersect(int[] nums1, int[] nums2) {
// //         HashMap<Integer,Integer> h=new HashMap<>();
        
// //         ArrayList<Integer> ar=new ArrayList<>();
// //         for(int x:nums2)
// //         {
// //             h.put(x,h.getOrDefault(x,0)+1);
// //         }
// //         for(Map.Entry<Integer,Integer> e:h.entrySet())
// //         {
// //             System.out.println(e.getKey()+ " :  "+e.getValue());
// //         }
// //         System.out.println();
// //         HashMap<Integer,Integer> h2=new HashMap<>();
// //         for(int x:nums1)
// //         {
// //             h2.put(x,h2.getOrDefault(x,0)+1);
// //         }
// //         for(Map.Entry<Integer,Integer> e:h2.entrySet())
// //         {
// //             System.out.println(e.getKey()+ " :  "+e.getValue());
// //         }
// //        for (Map.Entry<Integer, Integer> e : h2.entrySet())
// //        {
// //            int y=e.getKey();
// //            if(h.containsKey(y))
// //            {
// //                int x=Math.min(e.getValue(),h.get(e.getKey()));
// //                for(int i=0;i<x;i++)
// //                ar.add(e.getKey());
// //            }
// //        }
// //        for(int x:ar)
// //        {
// //         System.out.print(x);
// //        }
// //        System.out.println();
// //         int x=Math.min(nums1.length,nums2.length);
// //         int []res=new int[ar.size()];
// //         for(int i=0;i<ar.size();i++)
// //         {
// //             res[i]=ar.get(i);
// //         }
// //         return res;


// //     }
// // }
// public class Demonstration_1{
//     public static void main(String args[])
//     {
//         int dig[]={1,2,3};
//         int a[]=plusOne(dig);
//         for(int x:a)
//         System.out.print(x);

//     }
//     static int[] plusOne(int[] digits) {
//         String res="";
//         for(int i:digits)
//         {
//             res+=i;
//         }
//         int x=Integer.parseInt(res);
//         x++;
//         res=""+x;
      
//         int ar[]=new int[res.length()];
//         for(int i=0;i<res.length();i++)
//         {
//             ar[i]=Character.getNumericValue(res.charAt(i));
//             System.out.println(ar[i]);
//         }
//         return ar;
//     }
// }