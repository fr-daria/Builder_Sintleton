package org.example;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    public static int value;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
    private Logger(int value){
        this.value = value;
    }

    static Logger getInstance(){
        if (logger == null){
            logger = new Logger(value);
        }
        return logger;
    }
}
