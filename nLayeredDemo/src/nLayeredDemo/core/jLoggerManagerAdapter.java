package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements ILoggerService{
    public void logToSystem(String message){
        jLoggerManager manager=new jLoggerManager();
        manager.log("xd");
    }
}
