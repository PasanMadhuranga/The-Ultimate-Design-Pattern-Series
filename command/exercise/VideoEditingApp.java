package command.exercise;

import command.framework.Command;

import java.util.Stack;

public class VideoEditingApp {
    Stack<VideoCommand> commands = new Stack<>();

    public void executeCommand(VideoCommand command){
        command.execute();
        commands.push(command);
    }

    public void undoCommand(){
        if (commands.empty()){
            System.out.println("No commands to undo");
        }else {
            commands.pop().undo();
        }
    }
}
