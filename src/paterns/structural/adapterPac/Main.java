package paterns.structural.adapterPac;

public class Main {

    public static void main(String[] args) {
        AfricanLion africanLion = new AfricanLion();
        Hunter hunter = new Hunter();
        hunter.hunt(africanLion);

        //Adapter function example
        WildDog wildDog = new WildDog();
        DogToLionAdapter dogToLionAdapter = new DogToLionAdapter(wildDog);

        //Мы обернули наш объект типа WildDog в адаптер, реализующий Lion и теперь можем послать данный объект hunter-у
        hunter.hunt(dogToLionAdapter);
    }
}
