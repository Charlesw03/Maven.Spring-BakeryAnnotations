package com.zipcodewilmington.bakery.services;


import java.util.*;
import java.util.stream.Collectors;

public class WhiteBoards {


    public static void main(String[] args) {
        int[] arr = {13, 10, 2, 4, 5, 3, 1, 9, 7, 8, 6, 11};
        int[] result = new int[arr.length];
        int even = arr.length - 1;
        int odds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[even--] = arr[i];
            } else {
                result[odds++] = arr[i];
            }
        }
            System.out.print(Arrays.toString(result));
    }
}
//        //write a function to for a palindrome
// public boolean isPalindrome(String str){
//        String revString = new Stringbuilder(string).reverse().toString()
//        if(string.equals(revstring)){
//          return true;
//        } else {
//        return false;
//        }
//      }
//     option2   public static Boolean isPalindrome(String string) {
//            return string.equals(reverseString(string));}

//public static String reverseString(String string) {
//            return new StringBuilder(string).reverse().toString();
//        }
//    }
// @test for a a get average of a list
// public void getAvgTest(){
//       //given
//       List<Integer>numList = new ArrayList();
//  numList.add(2)numList.add(2)numList.add(2)
// Integer actual = 2;
// when
// Integer expected = getAvg(numList);
//then
//     Assert.assertEquals(expected,actual);
//
//          }

// 3 ways to reverse a string
//   return new Stringbuilder(the string).reverse().toString();
//
//     String newStr="";
//        for (int i = string.length()-1; i >=0 ; i--) {
//             newStr+= string.charAt(i);
//        }
//          reverse with string builder
//          StringBuilder sb = new StringBuilder("Kawhi");
//         System.out.print( sb.reverse().toString());


//        int[] arr = {5, 5, 2, 6, 7, 8, 9, 2, 4, 4, 11, 12, 78, 60, 7};
//        // return a list of even and odd integers from an og list using streams
//      List<Integer> numbalist = new ArrayList<>();
//      for(Integer x:arr){
//          numbalist.add(x);
//      }
//            List<Integer> evens =numbalist.stream().filter(x->x%2==0).collect(Collectors.toList());
//            List<Integer> odds = numbalist.stream().filter(x->x%2!=0).collect(Collectors.toList());
//        System.out.println(evens);
//        System.out.println(odds);
//
//    }
//
//}


//           Chathams fizzbuzz
//            int N = 100;
//        for(int i = 1; i <= N; i++){
//            if(i%30==0){
//                System.out.println("CodilityTestCoders");
//            }else if(i%15==0){
//                System.out.println("TestCoders");
//            }else if(i%10==0){
//                System.out.println("CodilityCoders");
//            } else if(i%6==0){
//                System.out.println("CodilityTest");
//            } else if(i%5==0){
//                System.out.println("Coders");
//            } else if(i%3==0){
//                System.out.println("Test");
//            } else if(i%2==0){
//                System.out.println("Codility");
//            } else{
//                System.out.println(i);
//            }
//        }
//
//    }
//
//
////   }
//
//       Arrays.asList(arr);

//        boolean flag = true;
//        while (flag == true) {
//            flag = false;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    flag = true;
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        System.out.print(Arrays.toString(arr));
//    }
//}
//        int[] arr = {7, 2, 8, 1, 9, 10, 3, 4, 5, 7};
//
//        boolean flag = true;
//        while (flag == true) {
//            flag = false;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    flag = true;
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
// FIZZ BUZZ
//        for (int i = 0; i <= 10; i++) {
//
//            if(i%3==0){
//                System.out.println("Fizz");
//            }else if(i%5==0){
//                System.out.println("Buzz");
//            }else if(i%3==0|| i%5==0){
//                System.out.println("FizzBuzz");
//
//            } else {
//                System.out.println(i);
//            }
//        }
//


// inverts the casing of a string
//        String string = "I really hope that i Get a FUCKing job from this program";
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < string.length(); i++) {
//            char c = chars[i];
//            if (Character.isUpperCase(c)) {
//                chars[i] = Character.toLowerCase(c);
//
//            } else if (Character.isLowerCase(c)) {
//                chars[i] = Character.toUpperCase(c);
//            }
//        }
//                   String x = Arrays.toString(chars);
//
//                    System.out.println(x);
//
//    }

//       //sorts the array with bubble sort
//        Integer[] arr = {12, 10, 7, 2, 4, 11, 2, 1, 7, 12, 10, 4};
//        boolean flag = true;
//        while (flag == true) {
//            flag = false;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    flag = true;
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//
//        }
//        // counts the dups in the array
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int k = i + 1; k < arr.length; k++) {
//                if (arr[i] == arr[k]) {
//                    count++;
//                }
//            }
//        }
//
//        //deletes the dups in the array
//        List<Integer> list = Arrays.asList(arr);
//        Set set = new HashSet(list);
//
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
//        System.out.print(set);
//    }
//}
//        int n1 = 0;
//        int n2 = 1;
//        int count = 10;
//        for (int i = 1; i <= count; ++i) {
//            System.out.print(n1 + " ");
//            int n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//        }
//    }


//        Integer[] arr = {12, 10, 7, 2, 4, 11, 2, 1, 7, 12, 10, 4};
//        List<Integer> list = new ArrayList<>();
//            int indexToDelete = 5;
//        for (int i = 0; i <arr.length ; i++) {
//            list.add(arr[i]);
//        }
//       list.remove(indexToDelete);
//        System.out.print(list);
//
//    }

//easy way to do fibonacci sequence-> printing the first 10 digits
//    int n1 = 0 ;
//    int n2 = 1;
//    int count = 10;
//        for (int i = 1; i <= count ; ++i) {
//            System.out.print(n1+" ");
//            int n3 = n1+n2;
//            n1 = n2;
//            n2=n3;
//        }
//


//removing duplicates from an integer array with a list and a set
//        Integer[] arr = {12, 10, 7, 2, 4, 11, 2, 1, 7, 12, 10, 4};
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <arr.length ; i++) {
//            list.add(arr[i]);
//        }
//
//            Set set = new HashSet(list);
//            System.out.println(set);
//
//
//    }

//count dups in an array
//        int[] arr = {12, 10, 7, 2, 4, 11, 2, 1, 7, 12, 10, 4};//12 , 7, 2
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int k = i + 1; k < arr.length; k++) {
//                if (arr[i] == arr[k]) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//
//
//    }
//}
// this seperates evens to the left side of an array and odds to the right
//        int[] arr = {12, 10, 3, 6, 4, 11, 2, 1, 7, 13};
//        int[] result = new int[arr.length];
//        int even = 0;
//        int odd = arr.length - 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0)
//                result[even++] = arr[i];
//            else
//                result[odd--] = arr[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }


// reverse an Array
//        int[] arr = {12, 10, 3, 6, 4, 11, 2, 1};
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <arr.length-1-i ; i++) {
//                int other = arr.length -i-1;
//                int temp = arr[i];
//                arr[i] = arr[other];
//                arr[other] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));








