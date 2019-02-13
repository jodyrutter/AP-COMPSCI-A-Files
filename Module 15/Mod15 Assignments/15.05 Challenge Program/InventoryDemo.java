import java.util.*;
/**
 * @purpose Model an inventory of items.
 * 
 * @author Jody Rutter
 * @version 8/15/2015
 */
public class InventoryDemo
{
    public static void takeInventory(List<Product> inventory)
    {
        String[] names = {"Jaguar","Neon","JigSaw","RAM","CircularSaw"};
        int[] quantities = new int[names.length];
        double[] cost = new double[names.length];
        
        for(int i = 0; i<inventory.size(); i++)
        {
            for(int findName = 0; findName<names.length; findName++)
            {
                if(inventory.get(i).getName().equals(names[findName]))
                {
                    quantities[findName]++;
                    cost[findName] += inventory.get(i).getCost();
                }
            }
        }
        
        for(int i = 0; i<names.length; i++)
        {
            System.out.println(names[i]+": Quantity = "+quantities[i]+", Total cost = "+cost[i]);
        }
        
    }
    
    public static void main(String[] args)
    {
        List<Product> inventory = new ArrayList<Product>();
        inventory.add(new Car("Jaguar", 100000.00));
        inventory.add(new Car("Neon", 17000.00));
        inventory.add(new Tool("JigSaw", 149.18));
        inventory.add(new Car("Jaguar", 110000.00));
        inventory.add(new Car("Neon", 17500.00));
        inventory.add(new Car("Neon", 17875.32));
        inventory.add(new Truck("RAM", 35700.00));
        inventory.add(new Tool("CircularSaw", 200.00));
        inventory.add(new Tool("CircularSaw", 150.00));
        
        List<Tool> saws = new ArrayList<Tool>();
        saws.add(new Tool("Saw1",100.00));
        saws.add(new Tool("Saw2",100.01));
        
        takeInventory(inventory);
        
        if(saws.get(0).compareTo(saws.get(1)) == 0)
        {
            System.out.println("Both saws are equally expensive");
        }
        else if(saws.get(0).compareTo(saws.get(1)) > 0)
        {
            System.out.println("The first Saw is more expensive");
        }
        else if(saws.get(0).compareTo(saws.get(1)) < 0)  //Included for clarity.
        {
            System.out.println("The second Saw is more expensive");
        }
        else
        {
            //This is likely impossible given the upper conditions.
        }
    }
}