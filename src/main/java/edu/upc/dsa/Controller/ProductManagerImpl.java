package edu.upc.dsa.Controller;

public class ProductManagerImpl implements ProductManager{

    private static ProductManagerImpl instance = null;

//Singleton Pattern
    public static ProductManagerImpl getInstance() {
        if (instance == null) instance = new ProductManagerImpl();
        return instance;
    }
}
