package pattern_strategy;

public class Cage {
    private  int size;
    private ISound animal;

    public ISound getAnimal(){return animal;}

   public void setAnimal(ISound animal){ this.animal= animal;}

    public  String soundFromCage(){return this.animal.playSound();}
}
