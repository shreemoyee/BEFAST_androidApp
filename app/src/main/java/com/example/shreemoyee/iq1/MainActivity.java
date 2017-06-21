package com.example.shreemoyee.iq1;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import android.view.Menu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.example.shreemoyee.iq1.R;
import android.widget.Button;
//import android.widget.Button;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.content.Intent;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;

import java.util.Map;
import java.util.Set;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;


//import static com.example.shreemoyee.iq1.MainActivity.Dijkstra.computePaths;


//import java.util.List;

public class MainActivity extends AppCompatActivity {


    public Button buta;
    public Button butb;
    public Button butc;
    public Button butd;
    public Button bute;
    public Button butf;
    public Button butg;
    public Button buth;
    public Button buti1;
    public Button buti2;

    public Button butj;
    public Button butk;
    public ArrayList<Integer> path_array = new ArrayList<Integer>();

    public String ans;
    public double g[][] = new double[][]{{0,	1,	0,	0,	0,	0,	0,	2,	0,	0,	0,	0,	30},
            {1,	0,	1.5,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
            {0,	1.5,	0,	2,	0,	0,	0,	0,	0,	0,	0,	3,	0},
            {0,	0,	2,	0,	2,	0,	0,	0,	0,	0,	0,	0,	0},
            {0,	0,	0,	2,	0,	1,	0,	0,	0,	0,	0,	0,	2.5},
            {0,	0,	0,	0,	1,	0,	2,	0,	0,	0,	0,	0,	0},
            {0,	0,	0,	0,	0,	2,	0,	3,	0,	0,	0,	0,	0},
            {2,	0,	0,	0,	0,	0,	3,	0,	2,	3,	0,	0,	0},
            {0,	0,	0,	0,	0,	0,	0,	2,	0,	0,	2,	0,	0},
            { 0,	0,	0,	0,	0,	0,	0,	3,	0,	0,	3,	0,	0},
            {0,	0,	0,	0,	0,	0,	0,	0,	2,	3,	0,	3,	0},
            {0,	0,	3,	0,	0,	0,	0,	0,	0,	0,	3,	0,	0},
            {30,	0,	0,	0,	2.5, 	0,	0,	0,	0,	0,	0,	0,	0}

    };


    public int x;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.shreemoyee.iq1.R.layout.activity_main);
        buta=(Button)findViewById(com.example.shreemoyee.iq1.R.id.floora);
        butb=(Button)findViewById(R.id.b);
        butc=(Button)findViewById(R.id.c);
        butd=(Button)findViewById(R.id.d);
        bute=(Button)findViewById(R.id.e);
        butf=(Button)findViewById(R.id.f);
        butg=(Button)findViewById(R.id.g);
        buth=(Button)findViewById(R.id.h);
        buti1=(Button)findViewById(R.id.i1);
        buti2=(Button)findViewById(R.id.i2);
        butj=(Button)findViewById(R.id.j);
        butk=(Button)findViewById(R.id.k);
        buta.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                x=4;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(120);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butb.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=3;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(30);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butc.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=2;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(201);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butd.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=11;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(1101);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        bute.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=11;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(1102);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butf.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=10;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(100);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butg.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=5;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(502);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        buth.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=2;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(202);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        buti1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=8;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                path_array.add(801);
                Collections.reverse(path_array);
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);


            }
        });
        buti2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=10;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(101);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);


            }
        });
        butj.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=5;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(501);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });
        butk.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                x=6;
                ShortestPath t = new ShortestPath();
                t.dijkstra(g, 0);
                Context context = getApplicationContext();
                Toast.makeText(context, "Path: " + ans, Toast.LENGTH_LONG).show();
                path_array.add(60);
                Collections.reverse(path_array);
                Intent i=new Intent(MainActivity.this,floor_plan.class);
                i.putIntegerArrayListExtra("path",path_array);
                startActivity(i);

            }
        });

    }
    class ShortestPath
    {
        // A utility function to find the vertex with minimum distance value,
        // from the set of vertices not yet included in shortest path tree
        static final int V=13;
        int minDistance(double dist[], Boolean sptSet[])
        {
            // Initialize min value
            double min = Integer.MAX_VALUE;
                   int min_index=-1;

            for (int v = 0; v < V; v++)
                if (sptSet[v] == false && dist[v] <= min)
                {
                    min = dist[v];
                    min_index = v;
                }

            return min_index;
        }

        // A utility function to print the constructed distance array
        void printPath(int parent[], int j)
        {
            ans="0";
            path_array.clear();
            path_array.add(0);

            // Base Case : If j is source

            if (parent[j]==-1)
                return;

            printPath(parent, parent[j]);

            ans+="->"+j;
            path_array.add(j);
        }
        void printSolution(double dist[], int n,int parent[])
        {
            //ans="Vertex   Distance from Source";
            //int src = 0;
           printPath(parent,x );
           // for (int i = 0; i < V; i++)
            // ans=ans+i+" \t\t "+dist[i];
        }

        // Funtion that implements Dijkstra's single source shortest path
        // algorithm for a graph represented using adjacency matrix
        // representation
        void dijkstra(double graph[][], int src)
        {
            double dist[] = new double[V]; // The output array. dist[i] will hold
            // the shortest distance from src to i

            // sptSet[i] will true if vertex i is included in shortest
            // path tree or shortest distance from src to i is finalized
            Boolean sptSet[] = new Boolean[V];

            int parent[]=new int[V];
            // Initialize all distances as INFINITE and stpSet[] as false
            for (int i = 0; i < V; i++)
            {
                parent[0] = -1;
                dist[i] = Integer.MAX_VALUE;
                sptSet[i] = false;
            }

            // Distance of source vertex from itself is always 0
            dist[src] = 0;

            // Find shortest path for all vertices
            for (int count = 0; count < V-1; count++)
            {
                // Pick the minimum distance vertex from the set of vertices
                // not yet processed. u is always equal to src in first
                // iteration.
                int u = minDistance(dist, sptSet);

                // Mark the picked vertex as processed
                sptSet[u] = true;

                // Update dist value of the adjacent vertices of the
                // picked vertex.
                for (int v = 0; v < V; v++)

                    // Update dist[v] only if is not in sptSet, there is an
                    // edge from u to v, and total weight of path from src to
                    // v through u is smaller than current value of dist[v]
                    if (!sptSet[v] && graph[u][v]!=0 &&
                            dist[u] != Integer.MAX_VALUE &&
                            dist[u]+graph[u][v] < dist[v]) {
                        parent[v]  = u;
                        dist[v] = dist[u] + graph[u][v];
                    }
            }

            // print the constructed distance array
            printSolution(dist, V, parent);
        }
        void remove_fire_node( double graph[][],int v){
            for(int i=0;i<V;i++dd){

                    graph[i][v]=99;

            }
        }
    }
    }



