package objects;

//first, передняя
//место, где происходит действие

import java.util.Objects;

public class Place extends Obj {
    private String name;
    @Override
    public String toString(){
        return name;
    }
    public Place(String name){
        super(name);
        this.name = name;
        System.out.println( "Место " + name  + " успешно создано!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(name.toLowerCase(), place.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void currPlace(){
        System.out.println("Текущее место действия - " + name + ".");
    }
}