//класс экземпляров мебели Fitem
//объекты этого класса не способны сами взаимодействовать с другими объектами
//можно взаимодействовать с объектами этого класса

package objects;

import interfaces.Condition;
import enums.Furniture;
import interfaces.Effect;

import java.util.Objects;

public class Fitem extends Obj implements Condition, Effect {
    private String name;

    @Override
    public String toString(){
        return name;
    }
    public Fitem(String name){
        super(name);
        this.name = name;
        System.out.println("Предмет " + name + " успешно создан!");
    }

    @Override
    public void condition(String property) {
        System.out.println("Объекту " + this.name + " успешно добавлена характеристика " + property + ".");
        this.name =this.name + " " + property;
    }
    @Override
    public void effect(String move, String obj){
        System.out.println("Объект " + obj + " совершил действие " + move + " над объектом " + super.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fitem fitem = (Fitem) o;
        return Objects.equals(name.toLowerCase(), fitem.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void drop(){
        System.out.println("Предмет " + name + " упал.");
    }
    /*public void drop(Furniture f){
        switch (f){
            case bed -> System.out.println("Предмет " + name + " развалилась.");
            case sofa -> System.out.println("Предмет " + name + " лишился пружин.");
            case chair -> System.out.println("У предмета " + name + " сломана спинка.");
            case table -> System.out.println("Предмет " + name + " опрокинут.");
            case comod -> System.out.println("Предмет " + name + " передвинут.");
            case tumba -> System.out.println("Предмет " + name + " развалилась.");
        }*/
}