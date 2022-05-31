package tarea1Iterator;

public class ConcreteAggregateA implements IAggregate{
    private int position;
    private String [] nameList;

    public ConcreteAggregateA(){
        nameList= new String[5];
    }

    public void add (String value){
        nameList[position]=value;
        position++;
    }

    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(nameList);
    }
}
