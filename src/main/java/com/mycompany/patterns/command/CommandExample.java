package com.mycompany.patterns.command;

interface Command { // command interface

    public void execute();
    //public void unexecute();
}

class Person { // receiver

    private boolean moving = false;
    
    public void stop(){
        this.moving = false;
    }
    
    public void move(){
        this.moving = true;
    }
    
    public boolean isMoving(){
        return moving;
    }
}

class StopMovingCommand implements Command { // command

    Person person;// receiver

    public StopMovingCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        this.person.stop();
    }

}

class StartMovingCommand implements Command { // command

    Person person;//reveiver

    public StartMovingCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        this.person.move();
    }

}

class SwitchMovingCommand { // invoker

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }

}
/*
                                Applicability

-GUI buttons and menu items. In Swing programming, an Action is a command 
object. In addition to the ability to perform the desired command, an Action 
may have an associated icon, a keyboard shortcut, tooltip text, and so on.

-Networking. It is possible to send whole command objects across the network to 
be executed on the other machines: for example, player actions in computer 
games.

-Transactional behavior. Similar to undo, a database engine or software 
installer may keep a list of operations that have been or will be performed. 
Should one of them fail, all others can be reversed or discarded (this is 
usually called rollback).

-Asynchronous method invocation. In multithreading programming, this pattern 
makes it possible to run commands asynchronously in the background of an 
application. In this case, the Invoker is running in the main thread and sends 
the requests to the Receiver which is running in a separate thread. The invoker 
will keep a queue of commands and send them to the receiver while it finishes 
running them.
*/

public class CommandExample {

    public static void main(String[] args) {
        SwitchMovingCommand switcher = new SwitchMovingCommand();
        Person person = new Person();

        Command move = new StartMovingCommand(person);
        Command stop = new StopMovingCommand(person);

        System.out.println(personState(person));

        switcher.setCommand(move);
        switcher.executeCommand();

        System.out.println(personState(person));

        switcher.setCommand(stop);
        switcher.executeCommand();

        System.out.println(personState(person));
    }

    public static String personState(Person person) {
        if (person.isMoving()) {
            return "This person is moving";
        }
        return "This person is NOT moving";
    }

}
