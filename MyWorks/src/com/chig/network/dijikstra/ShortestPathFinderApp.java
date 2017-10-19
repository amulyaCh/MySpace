/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chig.network.dijikstra;

  import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author amulyachigurupati
 */
public class ShortestPathFinderApp{

    public static void fileReadUtility(String inputfile) throws Exception{
        int [][] matrix = new int[10][10];
        int [] distance = new int[10];
        int [] next = new int[10];
        int [] value = new int[10];
        int min = 0;
        int nextnode = 0;
        Scanner   input = new Scanner(System.in);
        File file=new File("graph.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        List list=new ArrayList();
        List l1=new ArrayList();
        List l2=new ArrayList();

        Map m=new HashMap();

        String s=br.readLine();
        System.out.println("Graph List data");
        System.out.println(s);

        StringTokenizer st=new StringTokenizer(s);
        System.out.println("Node Cost Next-Hop");

        while(st.hasMoreTokens())
        {
            String str=st.nextToken(",");
            list.add(str);
            System.out.println(str);
        }
 for (Object list1 : list) {

            StringTokenizer stk=new StringTokenizer(list1.toString());
            int i=1;
            while(stk.hasMoreTokens()){
                if(i%2==0){
                    String stre=stk.nextToken(":");
                  System.out.println(stre);
                    l2.add(stre);
                }
                else
                {
                    String strv=stk.nextToken(":");
                    System.out.println(strv);
                    l1.add(strv);
                }
                i++;
            }
        }
        for (int i = 0; i < 10; i++) {
            m.put(l1.get(i), l2.get(i));
        }
         System.out.println("Edges::"+m.keySet());
         System.out.println("Weights::"+m.values());
        for (int i = 0; i < 10; i++) {
            m.put(l1.get(i), l2.get(i));
            for (int j = 0; j < 10; j++)
            {
                matrix[i][j] = input.nextInt();
                if(matrix[i][j] == 0)
                matrix[i][j] = 999;
            }
        }

        distance = matrix[0];
        distance[0]=0;
        next[0]=1;
 for (int p=0 ; p< 10 ; p++)
        {
            min = 999;
            for (int k=0 ; k< 5 ; k++)
                if (min > distance[k] && next[k] !=1)
                {
                  min = distance[k];
                  nextnode = k;

                }
        }

        next[nextnode]=1;

        for (int c = 0;c <10 ;c++ )
        {
            if(next[c]!=1)
            {
                if(min+matrix[nextnode][c] < distance [c])
                {
                    distance[c] = min +matrix[nextnode][c];
                    value[c] = nextnode;

                }
            }
        }

        for(int i=0 ; i < 10 ; i++)
        {
            int j;
            System.out.println("path = " + i);
                    j =i;
                do {
                    j= value[j];
                     System.out.println("" + j);
                }   while(j != 0) ;
                System.out.println();
        }

    }
 public static void main(String[] args) throws Exception {
	  if (args.length != 2)
      {
          System.out.println("the file name and the root node");
          return;
      }
	  AdjacencyList list = new AdjacencyList(args[0]);
      list.printAdjacency();
      String  inputfile = args[0];
        fileReadUtility(inputfile);
    }
}

