package objects;

public abstract class Obj {
    String name;
    public Obj(String name){
        this.name = name;
    }
    //abstract void appear(){
      //  System.out.println("Объект " + this.name + " успешно создан!");
    //}
}
//Obj - абстрактный класс, от которого наследуются класс сущностей Entity, класс места действия Place и класс экземпляров мебели Fitem.