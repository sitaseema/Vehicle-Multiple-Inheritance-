class Main{
    public static void main(String[] args)
    {
        

        SUV f=new SUV("fortuner",false);
        System.out.println();

        f.move(50,"South");

        System.out.println();

        f.steer("East");

        System.out.println();

        f.changeSpeed(90,"West");

        System.out.println();

        System.out.println("current gear : "+f.getCurrentGear());

        System.out.println();

        f.changeGear(10);

        System.out.println();

        f.stop();

        System.out.println();

        f.accelerate(20);

        System.out.println();

        f.setCurrentSpeed(40);

        System.out.println();

        f.accelerate(20);

        System.out.println();

    }
}