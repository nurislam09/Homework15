public class Circle {
    private static  double PI;

    public  void setPI(double PI) {
        Circle.PI = PI;
    }
    public void  area(int radius,int radius2){
        double num0 = PI*(radius * radius2);

        System.out.printf("%f*(%d*%d)=%f", PI ,radius,radius2,num0);
    }
    public void  circumference(int r){
        double num = 2*PI*r;
        System.out.println(2+"*"+PI+"*"+r+"="+num);
    }
}
