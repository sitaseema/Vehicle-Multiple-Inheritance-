class Car extends Vehicle{

   private String type;
   private int wheels;
   private int doors;
   private int gears;
   private boolean isManual;

   private int currentGear;

   Car(String name,String type,int wheels,int doors,int geers,boolean isManual)
   {
     super(name);
     this.type=type;
     this.doors=doors;
     this.wheels=wheels;
     this.gears=geers;
     this.isManual=isManual;

     currentGear=1;
   }

   public String getType()
   {
     return type;
   }
   public int getWhhels()
   {
    return wheels;
   }
   public int getDoors()
   {
    return doors;
   }
   public int getGeers()
   {
    return gears;
   }
   public boolean getIsManual()
   {
    return isManual;
   }
   public int getCurrentGear()
   {
    return currentGear;
   }

   public void setCurrentGear(int gear)
   {
     currentGear=gear;
   }

   public void changeSpeed(int speed,String direction)
   {
     System.out.println("change speed fuction got called");
     move(speed,direction);
   }

   public void changeGear(int gear)
   {
     currentGear=gear;
     System.out.println("change gear function got called and current gear is "+currentGear);
   }

}