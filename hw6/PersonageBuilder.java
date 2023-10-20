package seminar6.hw;


import seminar6.cw2.Animal;

public class PersonageBuilder {
    private static PersonageBuilder instance = null;
    Personage obj;
    private PersonageBuilder(){

    }
    public static PersonageBuilder getInstance() {
        if (instance == null)
            instance = new PersonageBuilder();
        instance.obj = new Personage();
        return instance;
    }

    public PersonageBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public PersonageBuilder setHealth(double health){
        obj.setHealth(health);
        return this;
    }

    public PersonageBuilder setMana(double mana){
        obj.setMana(mana);
        return this;
    }

    public PersonageBuilder setStamina(double stamina){
        obj.setStamina(stamina);
        return this;
    }

    public PersonageBuilder setWeapon(String weapon){
        obj.setWeapon(weapon);
        return this;
    }

    public PersonageBuilder setStrength(int strength){
        obj.setStrength(strength);
        return this;
    }

    public PersonageBuilder setDexterity(int dexterity){
        obj.setDexterity(dexterity);
        return this;
    }

    public PersonageBuilder setIntelligence(int intelligence){
        obj.setIntelligence(intelligence);
        return this;
    }

    public Personage build() {
        return obj;
    }
}
