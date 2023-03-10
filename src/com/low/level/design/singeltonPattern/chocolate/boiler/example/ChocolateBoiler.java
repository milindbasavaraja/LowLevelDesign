package com.low.level.design.singeltonPattern.chocolate.boiler.example;

/**
 * Making it Singleton class because if more than one instance of ChocolateBoiler is created it will create lots of bugs.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueChocolateBoiler;

    /**
     * Use double-checked locking to reduce the use of synchronisation in getInstance()
        private volatile static ChocolateBoiler UniqueChocolateBoiler;
        public  static ChocolateBoiler getInstance(){
            //Check for an instance and if there isn't one, enter a synchronised block.
            if(uniqueChocolateBoiler == null){
                //Note we only synchronized the first time through
                synchronized (ChocolateBoiler.class){
                    //once in block check again and if it is still null, create an instance.
                    if(uniqueChocolateBoiler == null){
                        uniqueChocolateBoiler = new ChocolateBoiler();
                    }
                }
            }
            return uniqueChocolateBoiler;
        }
     */


    /**
     * This code is only started when the boiler is empty.
     */
    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }

    /**
     * Making it synchronised so that in case of multithreading we don't create multiple instances.
     * By making it synchronised function, we force every thread to wait for its turn before it can enter the method.
     * No two threads may enter the method at the same time.
     * This will degrade performance by factor of 100 because synchronisation is expensive process.
     * if performance is a major factor then create singleton instance at the beginning just as follows:
     * private static Singleton uniqueInstance = new Singleton(); ---> this code is thread safe.
     * @return
     */
    public static synchronized ChocolateBoiler getInstance(){
        if(uniqueChocolateBoiler == null){
            uniqueChocolateBoiler = new ChocolateBoiler();
        }

        return uniqueChocolateBoiler;
    }

    /**
     * To fill the boiler it must be empty, and once its full, we set the empty and boiled flags
     */
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            //fill the boiler with milk and chocolate
        }
    }

    /**
     * To drain the boiler, it must be full and also boiled. Once it is drained, we set empty back to true
     */
    public void drain(){
        if(!isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    /**
     * To boil the mixture, the boiler has to be full and not already boiled. Once its boiled we set the boiled flag to true.
     */
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            //bring contents to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
