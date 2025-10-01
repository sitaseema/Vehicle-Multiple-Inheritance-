class Vehicle{
     private String name ;
     private int currentSpeed;
     private String currentDirection;

     Vehicle(String name)
     {
        this.name=name;
     }

     public String getName()
     {
        return name;
     }

     public String getCurrentDirection()
     {
        return currentDirection;
     }

     public int getCurrentSpeed()
     {
        return currentSpeed;
     }

     public void setCurrentDirection(String direction)
     {
        currentDirection=direction;
     }
     public void setCurrentSpeed(int speed)
     {
        currentSpeed=speed;
     }

     public void move(int speed,String direction)
     {
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println(" move function called and moving  at speed "+currentSpeed+"  in the   "+currentDirection+" direction");
     }

     public void steer(String direction)
     {
          currentDirection=direction;
          System.out.println(" steer function called and moving in the   "+currentDirection+"  direction");
     }

     public void stop()
     {
        currentSpeed=0;
        System.out.println(" stoped...");
     }
}