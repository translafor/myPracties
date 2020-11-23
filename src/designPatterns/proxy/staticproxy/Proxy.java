package designPatterns.proxy.staticproxy;

public class Proxy implements Person{

    private Person person;

    public Proxy(Person person){
        this.person = person;
    }
    @Override
    public void soutName() {
        person.soutName();
    }
}
