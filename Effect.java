package interfaces;
//интерфейс, обозначающий свойства предмета
//интерфейс т.к. действия характеризуются эмоциями + предметы имеют свойства
public interface Effect {
    public void effect(String move, String obj);
}
//effect - интерфейс, реализующий воздействие одного объекта на другой. Например, привидение способно испугать фрекен Бок. Фрекен Бок может перемещать предметы мебели.
//действие, объект
// так же и делает