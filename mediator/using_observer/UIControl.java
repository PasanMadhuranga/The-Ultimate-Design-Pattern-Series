package mediator.using_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> event_handlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer){
        event_handlers.add(observer);
    }

    protected void notifyEventHandlers(){
        for (EventHandler event_handler: event_handlers){
            event_handler.handle();
        }
    }
}
