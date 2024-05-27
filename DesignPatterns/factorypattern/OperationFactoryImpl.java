package DesignPatterns.factorypattern;

public class OperationFactoryImpl implements OperationFactory
{
    @Override
    public Operation getInstance(int choice) throws InvalidaOperationException {
        if(choice ==1)
        return new AddOperation();
        else if (choice ==2) {
            return new SubOperation();
        } else if (choice==3) {
            return  new MulOperation();
        }
        throw new InvalidaOperationException("invalid Operation selected");
    }
}
