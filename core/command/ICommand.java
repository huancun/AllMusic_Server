package coloryr.allmusic.core.command;

import java.util.List;

public interface ICommand {
    void ex(Object sender, String name, String[] args);
    List<String> tab(String name, String[] args);
}
