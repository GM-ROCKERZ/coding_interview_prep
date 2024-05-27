package DesignPatterns.factorypattern;

public interface OperationFactory
{
    Operation getInstance(int choice) throws InvalidaOperationException;
}
