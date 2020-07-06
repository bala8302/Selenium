package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question10{

        public static void main(String []args) {

            Scanner s = new Scanner(System.in);
            System.out.println(" enter no.of.user input times: ");
            int testCase=0,SizeofArray,SizeofSubSet,i=0,j=0,SkipTime,actual=0,expect=0;
            ArrayList<Integer> al=new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> all=new ArrayList<ArrayList<Integer>>();
            testCase=s.nextInt();
            while(testCase!=0)
            {
                System.out.println("Enter the Size of Array,Size of Subset, No of PopUp respectively");
                SizeofArray=s.nextInt();
                SizeofSubSet=s.nextInt();
                SkipTime=s.nextInt();
                int Arr[]=new int[SizeofArray];
                System.out.println("Enter the value of Array");
                for(i=0;i<Arr.length;i++)
                {
                    Arr[i]=s.nextInt();
                }
                Arrays.sort(Arr);
                int count=0;
                int data[]=new int[SizeofSubSet];
                all=combinationUtil(Arr,Arr.length,SizeofSubSet,0,data,0,SkipTime,al,all);
                for(i=0;i<all.size();i++)
                {
                    for(j=0;j<all.get(i).size();j++)
                    {
                        if (count == SkipTime - 1)
                            expect += all.get(i).get(j);
                        if (count == 0)
                            actual += all.get(i).get(j);
                    }
                    count++;
                    if(expect!=0)
                        count=expect-actual;
                }
                testCase--;
                System.out.println("The Output is: "+count);
            }
        }
    static ArrayList<ArrayList<Integer>> combinationUtil(int arr[], int n, int r,
                                                         int index, int data[], int i,int SkipTime,ArrayList<Integer> al, ArrayList<ArrayList<Integer>> all)
    {
        if (index == r) {
            al=new ArrayList<Integer>();
            for (int j = 0; j < r; j++)
            {
                System.out.print(data[j] + " ");
                al.add(data[j]);
            }
            all.add(al);
            System.out.println("");
            return all;
        }
        if (i >= n)
            return all;
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1,data, i + 1,0,al,all);
        combinationUtil(arr, n, r, index, data, i + 1,0,al,all);
        return all;
    }
    }
