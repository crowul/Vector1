package com.company;

class Vector
{
    double x1,y1,x2,y2;
    double deltaX;
    double deltaY;
    double ro;
    double fi;
    public Vector(int x1,int y1 , int x2, int y2)
    {
        deltaX = Math.abs(x1-x2);
        deltaY = Math.abs(y1-y2);
        ro = Math.sqrt(((deltaX)*(deltaX))+((deltaY)*(deltaY)));
        fi = (Math.acos(deltaX/ro));
    }
    public Vector(double ro, double fi)
    {
        x1 = 0;
        y1 = 0;


        x2 = ro*Math.cos(fi);
        y2 = ro*Math.sin(fi);

    }


}
