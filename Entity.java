//класс сущностей Entity
//Его объекты - действующие лица сюжета, способные взаимодействовать с другими объектами

package objects;

import enums.*;

import interfaces.Condition;
import interfaces.Effect;

import java.util.Objects;

public class Entity extends Obj implements Condition, Effect {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    } //при вводе имени не учитывается регистр

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    private String name;

    public Entity(String name) {
        super(name);
        this.name = name;
        System.out.println("Объект " + name + " успешно создан!");
    }

    public void doAct(Actions act) {
        switch (act) {
            case run -> System.out.print("Объект " + super.name + " совершил действие " + "выбежать.");
            case fly -> System.out.print("Объект " + super.name + " совершил действие " + "вылететь.");
            case notlaugh -> System.out.print("Объекту " + super.name + " было не до смеха.");
            case fastmove -> System.out.print("Объект " + super.name + " совершил действие " + "кинуться.");
            case thrown -> System.out.print("Объект " + super.name + " совершил действие " + "расшвыривать.");
            case decompose -> System.out.print("Объект " + super.name + " совершил действие " + "разобросать.");
            case laugh -> System.out.print("Объект " + super.name + " совершил действие " + "расхохотаться."); //"разразиться." эквивалентно case outbreak
        }
    }

    /*перегрузка метода добавлением объекта воздействия
    например она выбежала
    она выбежала в переднюю [выбежала с криком]
    */
    public void doAct(Actions act, MoveWay m) {
        doAct(act);
        switch (m){
            case hihi -> System.out.print(" Действие было совершено с долгим, глухим смехом.");
            case fast -> System.out.print(" Действие было совершено стремительно.");
            case whistle -> System.out.print(" Действие было совершено со свистом.");
            case momentally -> System.out.print(" Действие было совершено мгновенно.");
            case scream -> System.out.print(" Действие было совершено с громким криком.");
            case eyeMove -> System.out.print(" Действие было совершено в мгновенье ока.");
        }
        System.out.println();
    }

    @Override
    public void condition(String property) {
        if (property == " "){
            String str = super.name;
            String[] parts = str.split(" ");
            super.name =parts[0];
        }
        else {
            System.out.println("Объекту " + this.name + " успешно добавлена характеристика " + property + ".");
            super.name = super.name + " " + property;
            //super.name = this.name;
            // super.name = property+" "+super.name;
        }
    }
    @Override
    public void effect(String move, String obj){
        System.out.println("Объект " + super.name + " совершил действие " + move + ", применительно к объекту " + obj + ".");
    }
    public void setEmot(Emotions e){
        switch (e){
            case sad -> System.out.println("Объекту " + super.name + " грустно.");
            case smile -> System.out.println("Объекту " + super.name + " весело.");
            case scared -> System.out.println("Объекту " + super.name + " страшно.");
        }
    }
}