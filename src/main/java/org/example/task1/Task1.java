package org.example.task1;

public class Task1 {
    public static void main(String[] args) {
     double[] array= new double[15];
double avg=0, min=Double.MAX_VALUE,max=0, sum=0;
        for (int i = 0; i < array.length; i++) {
           array[i]=Math.random();
        }
        System.out.println("Массив: ");
        for (double d: array)
        {
            System.out.print(d +" ");

            if (min>=d) min = d;
            if (max<=d) max=d;
            sum+=d;
        }
avg=sum/array.length;
        System.out.println("\nМаксимальное значение:" +max+"\n"+
                "Минимальное значение:" + min+"\n"+
        "Среднее значение: "+ avg);
    }
}