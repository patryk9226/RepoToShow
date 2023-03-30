public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę z prędkoscią " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciężarówką!");
    }

    @Override
    public String info() {
        return "Cięzarowka";
    }

    @Override
    public void zatankuj() {
        System.out.println("Aby mieć siłę muszę zjęść");
    }
}
