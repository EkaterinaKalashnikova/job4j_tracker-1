package ru.job4j.anime;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = src; i < data.length; i++) {
            for (int j = dst; j < data[i].length; j++) {
           //    System.out.print(data[i][j] + "\t");
            }
        //    System.out.println();
        }

        //Создаем строку с наибольшим значением в первом столбце
        int line = 1;
        for (int i = 0; i < data[line].length; i++) {
            //сохраняем значение самой высокой строки в буффер
            int temp = data[line][i];
            //меняем местами значение самой высокой строки с первой строкой
            data[line][i] = data[0][i];
            //установим значение первой строки, которая хранится в temp
            data[0][i] = temp;
        }

       // System.out.println("После смены строк");
        for (int i = dst; i < data.length; i++) {
            for (int j = src; j < data[i].length; j++) {
       //         System.out.print(data[i][j] + "\t");
            }
       //     System.out.println();
        }
    }
        /** //создаем буфферный массив2D и копируем в него основной
        int [][] tempData = new int [data.length][data[0].length];
        for(int i = src; i < data.length; i++) {
            if (data[ i ].length - dst >= 0 )
                System.arraycopy(data[ i ], dst, tempData[ i ], dst, data[ i ].length - dst);
            }
        //создаем еще одномерный массив, где суммируем каждую строку
        int[] rowSums = new  int[tempData.length];
        for(int i = 0; i < tempData.length; i ++) {
            for(int j = 0; j < tempData[0].length; j ++) {
                rowSums[i] += tempData[i][j];
            }
        }
        //заполняем пузырьковой сортировкой в одномерном массиве
        // от самого высокого до самого низкого значения
        int temp;
        int i = 0;
        for(int j = rowSums.length; j > 0; j--) {
            boolean isSwap = false;
            for(i = 1; i < j; i++) {
               if (rowSums[i - 1] < rowSums[i]) {
                   temp = rowSums[i - 1];
                   rowSums[i - 1] = rowSums[i];
                   rowSums[i] = temp;
                   isSwap = true;
                   //и меняем местами строки в соответствующих ячейках
                   int[] temp2 = tempData[i - 1];
                   tempData[i - 1] = tempData[i];
                   tempData[i] = temp2;
               }
            }
            if (!isSwap) {
                break;
            }
        }
    }*/
}


