import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    File file = new File("todoFile.txt");
    String options = args[0];
    TodoList todolist = new TodoList();
/*    System.out.println(todolist.fillList());
    todolist.printMaps(todolist.todos);*/




    if (options.equals(StringCommands.LIST_TODOS.s)) {
      //System.out.println(todolist.fillList());
      todolist.listTodos(todolist.todos);

    } else if (options.equals(StringCommands.REMOVE_TODO.s)) {
      todolist.removeTodo(todolist.todos, args[1]);
      todolist.listTodos(todolist.todos);

    } else if (options.equals(StringCommands.ADD_TODO.s)) {
      todolist.addTodo(todolist.todos, args[1], args[2], args[3], args[4]);
      todolist.listTodos(todolist.todos);

    } else if (options.equals(StringCommands.SET_TO_DONE.s)) {
      todolist.setComplete(todolist.todos, args[1]);
      todolist.listTodos(todolist.todos);
    }

    todolist.readFiles(file);
  }
}
