package src.main.java.Lebedenko.Lesson5;//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;

enum Commands{ add(new YYY ()),delete(new DeleteLinesFromFile ()),print(new PrintLinesFromFile ());
    private Boolean activeCommand;
    private Object command;
    private Integer numberOfRow;
    private String path;
    private String text;


    Commands (Object cmd){
        this.setcommand (cmd);
    }

    public void setcommand(Object cmd) {
        this.command = cmd;
    }

    public void setactiveCommand(Boolean command) {
        this.activeCommand = command;
    }

    public void setNumberOfRow(Integer numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    public Integer getNumberOfRow() {
        return this.numberOfRow;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setText(String text) {
        this.text = text;
    }

    public  Class doIt (){
        return command.getClass ().getComponentType ();
    }
};

