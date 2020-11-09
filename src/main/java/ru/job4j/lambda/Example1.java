package ru.job4j.lambda;

import java.util.function.Function;

public class Example1 {
    public static double calculate( double x ) {
        //  return calculate(y-> Math.pow(x, 2) , x);
        // return calculate(y-> Math.sqrt(x) , x);
        return calculate(num -> Math.pow(num ,2)+num * 2+1 ,x);
    }

    public static double calculate( Function <Double, Double> y ,double x ) {
        return y.apply(x);
    }

    public static int mult( int a ,int b ) {
        int result=0;
        for(int i=a; i <= b; i++) {
            result+=i * i;
        }
        return result;
    }

    public static int calculate( int a ,int n ) {
        int result=1;
        for(int i=result; i <= n; i++) {
            result=result * a;
        }
        return result;
    }

    public static void out( int n ) {
        for(int i=1; i <= n; i++) {
            if ( ( n % i ) == 0 ){
                System.out.println(i);
            }
        }
    }

    public class SecondSum {
        public int sum( int a ,int b ) {
            int result=0;
            for(int i=a; i <= b; i=a+1) {
                result++;

            }
            return result;
        }
    }

    public static int count( int length ,int section ) {
        int i=0;
        while(section <= length) {
            length=section++;
        }
        i++;
        return i;
    }

    public static int sum( int a ,int b ) {
        int sum=0;
        for(int i=a; i <= b; i=i+2) {
            sum=sum+i;
            System.out.println(sum);
        }
        return sum;
    }


    public class SectionCount {
        public int count( int length ,int section ) {
            int i=0;
            while(section <= length) {
                length=length-section;
                i++;
            }
            return i;
        }
    }

    public static int mod( int n ,int d ) {
        int i=1;
        while(d <= n & d > 0) {
            n=n-d;
            i++;
        }
        return n;
    }

    public static void main( String[] args ) {
      // public static int indexOf(char[] string, char c, int number) {
        char c = 'd'; int number = 2;
        char[] string = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'd'};
        String line = new String(string);
        int index = line.indexOf(c, number);
        System.out.println(index);
    }



        /** int[] array = new int[]{ 1 ,2 ,3 ,4 };
        int n = array.length;
        int tmp;
        for(int i = 0; i < n / 2; i++) {
            tmp=array[ n-i-1 ];
            array[ n-i-1 ]=array[ i ];
            array[ i ]=tmp;
        }
        for(int i = 0; i < array.length; i++) {
            if (array[ i ] % 2 == 0) {
                System.out.println(array[ i ]);
            }
        }
    }*/




        /**String[] array = new String[]{"1", "2", "3", "4", "5", "6"};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }



       /** int[] array=new int[]{ 1 ,2 ,3 ,4 };

        for(int i = 0; i < array.length; i++) {
            if ( array[ i ] % 2 == 0 ){
                System.out.println(array[ i ]+" ");
            }
        }
    }*/





    public static int[][] rows( int count ) {
        int x=0;
        int[][] triangle=new int[ count ][ x ];
        for(int n=0; n <= count; n++) {
            triangle[ n ]=new int[ n+1 ];
        }
        for(int n=triangle.length-1; n >= 0; n--) {
            for(int k=0; k < n; k++) {
                if ( triangle[ n ][ k ] != 0 ){
                    break;
                }
            }
        }
        return triangle;
    }

    public static int[][] convert( int[][] matrix ) {
        int n=matrix.length;
        int m=matrix[ 0 ].length;
        int[][] result=new int[ m ][ n ];
        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                result[ i ][ j ]=matrix[ j ][ i ];
            }
        }
        for(int i=0; i < result.length; i++) {
            for(int j=0; j < result[ i ].length; j++) {
                System.out.print(result[ i ][ j ]+" ");
            }
        }
        return result;
    }


    public int[] calculate( int a ,int b ,int n ) {
        int[] array=new int[ n ];
        a=0;
        b=1;
        for(int i=0; i < array.length-1; i++) {
            for(int j=0; j < i; j++) {
                array[ i ]=array[ i ]+array[ j ];
                System.out.print(array[ i ]+" ");
            }
        }
        return array;
    }

//  n = ( a + b ) * (int) Math.pow(2 ,n-3);


  /**  public static void print( int[] array ) {
        boolean isSorted=false;
        int tmp;
        while(!isSorted) {
            isSorted=true;
            for(int i=0; i < array.length-1; i++) {
                if ( array[ i ] > array[ i+1 ] ){
                    isSorted=false;

                    tmp=array[ i ];
                    array[ i ]=array[ i+1 ];
                    array[ i+1 ]=tmp;
                }
            }
            for(int i=1; i < array.length; i++) {
                if (i % 2 - 1 == 0) {
                    System.out.println(array[ i ]+" ");
                }
            }
        }
    }
}
        
         /**   for(int i = 1; i < array.length; i++) {
              //  if (i % 2 != 0) {
                  for(int j= i + 1; j < array.length; j++) {
                      if (array[ j ] < array[ i ]){ //сортируем
                          i = j;
                            }
                        }
                        int tmp=array[i + 1];
                        array[i + 1] = array[ i ];
                        array[ i ] = tmp;
                System.out.println(array[ i ] + " ");
            }
    }*/

  public static int indexOf(char[] string, char c, int number) {
      String line = new String(string);
      int index = line.indexOf(c, number);
      System.out.println(index);
      return index;
  }
}







