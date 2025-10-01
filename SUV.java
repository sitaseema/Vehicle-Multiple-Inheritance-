class SUV extends Car{

   private int rate;
    SUV(String name,boolean isManual)
    {
        super(name,"SUV",4,5,6,isManual);

    }

    public void accelerate(int rate)
    {
        int newSpeed=getCurrentSpeed()+rate;

        setCurrentSpeed(newSpeed);

        if(newSpeed<=0)
     {
        setCurrentGear(1);
     }
     else if(newSpeed>0 && newSpeed<20)
     {
       setCurrentGear(2);
     }
     else if(newSpeed>=20 && newSpeed<40)
     {
        setCurrentGear(3);
     }
     else if(newSpeed>=40 && newSpeed<60)
     {
        setCurrentGear(4);
     }
     else if(newSpeed>=60 && newSpeed<80)
     {
        setCurrentGear(5);
     }
     else{
        setCurrentGear(6);
     }


     System.out.println("accelerating  and current speed is "+getCurrentSpeed());
     System.out.println("current gear is : "+getCurrentGear());
     
    }
}