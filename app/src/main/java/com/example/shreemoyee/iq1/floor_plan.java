package com.example.shreemoyee.iq1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class floor_plan extends AppCompatActivity {

    DemoView demoview;
    public int maxX;
    public int maxY;
    public int x0 = 20;
    public int y0 = 20;
    public int x1;
    public int y1;
    public int l;
    public int b;
    public int ux;
    public int uy;
    public int uyh;
    public int uxh;



    public ArrayList<Integer> path_array = new ArrayList<Integer>();
    public  ArrayList<Integer> fire_node=new ArrayList<Integer>();


  //  public Pair<Integer, Integer> a120 = new Pair<Integer, Integer>(0, 0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_plan);
       // Context context = getApplicationContext();

        Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        maxX = mdispSize.x;
        maxY = mdispSize.y;
        x1 = maxX - 20;
        y1 = (maxY - 256) - 20;     //256 has been hard coded
        b = x1 - x0;
        l = y1 - y0;
        ux = b / 8;
        uy = l / 10;
        uxh = b / 16;
        uyh = l / 20;
        demoview = new DemoView(this);
        setContentView(demoview);


        Intent i = getIntent();
        path_array = i.getIntegerArrayListExtra("path");
        fire_node=i.getIntegerArrayListExtra("fire");
        //size=size-1;
        //while(size>=0){
        //    int j=i.getIntExtra("size",0);
        //    path_array.add(j);
        //   size=size-1;
        //}
        //Log.d("poiuytre","lkjhgfd");
        Iterator itr = path_array.iterator();
        while (itr.hasNext()) {
            Log.d("paths: ", String.valueOf(itr.next()));
        }
        //Toast.makeText(context, "Hieght: " + maxX+ "Width:" + maxY, Toast.LENGTH_LONG).show();
    }

    private class DemoView extends View {
        public DemoView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);


            // custom drawing code here
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);

            // make the entire canvas white
            paint.setColor(Color.BLACK);
            canvas.drawPaint(paint);

//CUBICLE A,B, C #############################################################################################
            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0, y0, x1, y1, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 20, y0 + 20, x1 - 20, y1 - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0, y0, x0 + 2 * ux, y0 + 3 * uy, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 20, y0 + 20, x0 + 2 * ux - 20, y0 + 3 * uy - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0, y0 + 3 * uy - 20, x0 + 2 * ux, y0 + 5 * uy, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 20, y0 + 3 * uy, x0 + 2 * ux - 20, y0 + 5 * uy - 20, paint);

            // draw red rectangle with anti aliasing turned off
            //paint.setAntiAlias(false);
            //paint.setColor(Color.RED);
            //canvas.drawRect(100, 5, 200, 30, paint);


            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0, y0 + 5 * uy - 20, x0 + 2 * ux, y0 + 7 * uy, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 20, y0 + 5 * uy, x0 + 2 * ux - 20, y0 + 7 * uy - 20, paint);

//CUBICLE J,K ##########################################################################################################
            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0 + 3 * ux - 20, y0, x0 + 5 * ux, y0 + 2 * uy, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 3 * ux, y0 + 20, x0 + 5 * ux - 20, y0 + 2 * uy - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0 + 5 * ux - 20, y0, x0 + 7 * ux, y0 + 2 * uy, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 5 * ux, y0 + 20, x0 + 7 * ux - 20, y0 + 2 * uy - 20, paint);

//CUBICLE D, E,F ######################################################################################################
            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x1, y1 - 2 * uy, x1 - 2 * ux, y1, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x1 - 20, y1 - 2 * uy + 20, x1 - 2 * ux + 20, y1 - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x1 - 4 * ux, y1 - 2 * uy, x1 - 2 * ux + 20, y1, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x1 - 4 * ux + 20, y1 - 2 * uy + 20, x1 - 2 * ux, y1 - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x1 - 6 * ux, y1 - 2 * uy, x1 - 4 * ux + 20, y1, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x1 - 6 * ux + 20, y1 - 2 * uy + 20, x1 - 4 * ux, y1 - 20, paint);

//CUBICLE G, H, I######################################################################################

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0 + 3 * ux - 20, y0 + 3 * uy, x0 + 5 * ux, y0 + 5 * uy, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 3 * ux, y0 + 3 * uy + 20, x0 + 5 * ux - 20, y0 + 5 * uy - 20, paint);

            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0 + 3 * ux - 20, y0 + 5 * uy - 20, x0 + 5 * ux, y0 + 7 * uy, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 3 * ux, y0 + 5 * uy, x0 + 5 * ux - 20, y0 + 7 * uy - 20, paint);
            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            //paint.setStrokeWidth(3);
            canvas.drawRect(x0 + 5 * ux - 20, y0 + 3 * uy, x0 + 7 * ux, y0 + 7 * uy, paint);

            // draw green circle with anti aliasing turned on
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            canvas.drawRect(x0 + 5 * ux, y0 + 3 * uy + 20, x0 + 7 * ux - 20, y0 + 7 * uy - 20, paint);
            // Printing the path##########################################################################################################################
            //Log.d("size",String.valueOf(path_array.size()));

            //Iterator itr = path_array.iterator();

            
            while (path_array.size()>1) {
                int first = path_array.get(0);
                int second = path_array.get(1);
              Log.d("node", String.valueOf(first));
                Log.d("node2", String.valueOf(second));
              /*    path_array.remove(0);  */



             int p1=0,p2=0,p3=0,p4=0;
                if(first==120){
                    p1=x0+2*ux;
                    p2=y0+2*uy+uyh;
                }
               else if(first==30){
                    p1=x0+2*ux;
                    p2=y0+5*uy;
                }
                else if(first==201){
                    p1=x0+2*ux;
                    p2=y0+7*uy;
                }
                else if(first==202){
                    p1=x0+3*ux;
                    p2=y0+7*uy;
                }
                else if(first==4){
                    p1=x0+2*ux+uxh;
                    p2=y0+2*uy+uyh;
                }
                else if(first==3){
                    p1=x0+2*ux+uxh;
                    p2=y0+5*uy;
                }
                else if(first==2){
                    p1=x0+2*ux+uxh;
                    p2=y0+7*uy;
                }

                else if(first==5){
                    p1=x0 + 3 * ux;
                    p2=y0 + 2 * uy+uyh;
                }
                else if(first==6){
                    p1=x0 + 5 * ux;
                    p2=y0 + 2 * uy+uyh;
                }
                else if(first==501){
                    p1=x0 + 3 * ux;
                    p2=y0 + 2 * uy;
                }
                else if(first==502){
                    p1=x0 + 3 * ux;
                    p2=y0 + 3 * uy;
                }
                else if(first==60){
                    p1=x0 + 5 * ux;
                    p2=y0 + 2 * uy;
                }
                else if(first==1101){
                    p1=x1 - 6 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==1102){
                    p1=x1 - 4 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==100){
                    p1=x1 - 2 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==10){
                    p1=x1 - uxh;
                    p2=y1 - 3 * uy;
                }
                else if(first==101){
                    p1=x1 - ux;
                    p2=y1 - 3 * uy;
                }
                else if(first==8){
                    p1=x1 - uxh;
                    p2=y1 - 7 * uy;
                }
                else if(first==801){
                    p1=x1 - ux;
                    p2=y1 - 7 * uy;
                }
                else if(first==11){
                    p1=x0+2*ux+uxh;
                    p2=y0+7*uy+uyh;
                }

                else if(first==9){
                    p1=x1-ux-uxh;
                    p2=y1-5*uy;
                }


                if(second==120){
                    p3=x0+2*ux;
                    p4=y0+2*uy+uyh;
                }


                 else  if(second==30){
                    p3=x0+2*ux;
                    p4=y0+5*uy;
                }
                 else   if(second==201){
                    p3=x0+2*ux;
                    p4=y0+7*uy;
                }
                else   if(second==202){
                    p3=x0+3*ux;
                    p4=y0+7*uy;
                }
                 else    if(second==4){
                    p3=x0+2*ux+uxh;
                    p4=y0+2*uy+uyh;
                }
                 else  if(second==3){
                    p3=x0+2*ux+uxh;
                    p4=y0+5*uy;
                }
                 else   if(second==2){
                    p3=x0+2*ux+uxh;
                    p4=y0+7*uy;
                }

                else if(second==1){
                     p3=x0+ux;
                     p4=y1-2*uy;
                 }
                else if(second==7){
                    p3=x0 + 7 * ux+uxh;
                    p4=y0 + 2 * uy+uyh;

                }
                else if(first==12) {
                    p3 = x0 + ux;
                    p4 = y0 + 3 * uy;
                }
                else if(second==5){
                    p3=x0 + 3 * ux;
                    p4=y0 + 2 * uy+uyh;
                }
                else if(second==6){
                    p3=x0 + 5 * ux;
                    p4=y0 + 2 * uy+uyh;
                }
                else if(second==501){
                    p3=x0 + 3 * ux;
                    p4=y0 + 2 * uy;
                }
                else if(second==502){
                    p3=x0 + 3 * ux;
                    p4=y0 + 3 * uy;
                }
                else if(second==60){
                    p3=x0 + 5 * ux;
                    p4=y0 + 3 * uy;
                }
                else if(second==1101){
                    p3=x1 - 6 * ux;
                    p4=y1 - 2 * uy;
                }
                else if(second==1102){
                    p3=x1 - 4 * ux;
                    p4=y1 - 2 * uy;
                }
                else if(second==100){
                    p3=x1 - 2 * ux;
                    p4=y1 - 2 * uy;
                }
                else if(second==10){
                    p3=x1 - uxh;
                    p4=y1 - 3 * uy;
                }
                else if(second==101){
                    p3=x1 - ux;
                    p4=y1 - 7 * uy;
                }
                else if(second==8){
                    p3=x1 - uxh;
                    p4=y1 - 7 * uy;
                }
                else if(second==9){
                    p3=x1-ux-uxh;
                    p4=y1-5*uy;
                }
                else if(second==801){
                    p3=x1 - ux;
                    p4=y1 - 7 * uy;
                }
                else if(second==11){
                    p3=x0+2*ux+uxh;
                    p4=y0+7*uy+uyh;
                }
                else if(second==12){
                    p3=x0+ux;
                    p4=y0+2*uy+uyh;
                }





                if(first==1){
                    paint.setColor(Color.parseColor("#007AC3"));
                    paint.setStrokeWidth(20);
                    canvas.drawLine(x0+ux, y1-2*uy, x0+ux, y1, paint);
                    break;
                }

                if(first==7){
                    p1=x0 + 7 * ux+uxh;
                    p2=y0 + 2 * uy+uyh;
                    paint.setColor(Color.parseColor("#007AC3"));
                    paint.setStrokeWidth(20);
                    canvas.drawLine(p1, p2, x0+7*ux+uxh, y0, paint);
                    break;
                }
                if(first==12){
                    p1=x0 + ux;
                    p2=y0 + 2 * uy+uyh;
                    paint.setColor(Color.parseColor("#007AC3"));
                    paint.setStrokeWidth(20);
                    canvas.drawLine(p1, p2, x0, y0+uyh, paint);
                    Context context = getApplicationContext();
                    Toast.makeText(context, "USE THE EMERGENCY WINDOW IN CUBICLE A ", Toast.LENGTH_LONG).show();
                    break;
                }

                paint.setColor(Color.parseColor("#007AC3"));
                paint.setStrokeWidth(20);
                canvas.drawLine(p1, p2, p3, p4, paint);

                path_array.remove(0);
            }
           /* paint.setColor(Color.RED);
            paint.setStrokeWidth(10);
            canvas.drawLine(550, 400, 950, 400, paint);

            paint.setColor(Color.RED);
            paint.setStrokeWidth(10);
            canvas.drawLine(950, 400, 950, 20, paint);

            paint.setColor(Color.RED);
            paint.setStrokeWidth(10);
            canvas.drawLine(550, 250, 550, 400, paint);

            // draw the rotated text
            canvas.rotate(-45);

            paint.setStyle(Paint.Style.FILL);
            //canvas.drawText("Graphics Rotation", 40, 180, paint); */



            while(fire_node.size()>0){
               int first=fire_node.get(0);
                int p1=0,p2=0;
                if(first==120){
                    p1=x0+2*ux;
                    p2=y0+2*uy+uyh;
                }
                else if(first==30){
                    p1=x0+2*ux;
                    p2=y0+5*uy;
                }
                else if(first==201){
                    p1=x0+2*ux;
                    p2=y0+7*uy;
                }
                else if(first==202){
                    p1=x0+3*ux;
                    p2=y0+7*uy;
                }
                else if(first==4){
                    p1=x0+2*ux+uxh;
                    p2=y0+2*uy+uyh;
                }
                else if(first==3){
                    p1=x0+2*ux+uxh;
                    p2=y0+5*uy;
                }
                else if(first==2){
                    p1=x0+2*ux+uxh;
                    p2=y0+7*uy;
                }

                else if(first==5){
                    p1=x0 + 3 * ux;
                    p2=y0 + 2 * uy+uyh;
                }
                else if(first==6){
                    p1=x0 + 5 * ux;
                    p2=y0 + 2 * uy+uyh;
                }
                else if(first==501){
                    p1=x0 + 3 * ux;
                    p2=y0 + 2 * uy;
                }
                else if(first==502){
                    p1=x0 + 3 * ux;
                    p2=y0 + 3 * uy;
                }
                else if(first==60){
                    p1=x0 + 5 * ux;
                    p2=y0 + 2 * uy;
                }
                else if(first==1101){
                    p1=x1 - 6 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==1102){
                    p1=x1 - 4 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==100){
                    p1=x1 - 2 * ux;
                    p2=y1 - 2 * uy;
                }
                else if(first==10){
                    p1=x1 - uxh;
                    p2=y1 - 3 * uy;
                }
                else if(first==101){
                    p1=x1 - ux;
                    p2=y1 - 3 * uy;
                }
                else if(first==8){
                    p1=x1 - uxh;
                    p2=y1 - 7 * uy;
                }
                else if(first==801){
                    p1=x1 - ux;
                    p2=y1 - 7 * uy;
                }
                else if(first==11){
                    p1=x0+2*ux+uxh;
                    p2=y0+7*uy+uyh;
                }

                else if(first==9){
                    p1=x1-ux-uxh;
                    p2=y1-5*uy;
                }
               // paint.setShader(new RadialGradient( p1,
               //         p2,
               //         2,
               //         "#ff0000",
               //         "#000000",
               //         Shader.TileMode.CLAMP
                // ));
                float[] stopsGradient;
                int[] colorsGradient;

                float rgRadius;
                stopsGradient = new float[] { 0, 0.5f,1}; // the 3 points correspond to the 3 colors
                colorsGradient  = new int[] { Color.YELLOW, Color.RED,Color.BLACK};
               // paint.setColor(Color.YELLOW);

                RadialGradient radialGradient = new RadialGradient(p1,p2,50,colorsGradient, stopsGradient ,Shader.TileMode.CLAMP);
                paint.setShader(radialGradient);
                canvas.drawCircle(p1,p2,50,paint);

                fire_node.remove(0);


            }



                canvas.save();

                canvas.restore();
            }
        }
    }

