import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TodoList {

  public TodoList() {
  }

  Map<Integer, Todo> todos = new HashMap<>();

  public void writeFiles(Map<Integer, Todo> map) {
    File file = new File("todoFile.txt");
    FileOutputStream fout = null;
    try {
      fout = new FileOutputStream(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    ObjectOutputStream oos = null;
    try {
      oos = new ObjectOutputStream(fout);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < map.size(); i++) {

      try {
        oos.writeObject(map.get(i));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    try {
      oos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void readFiles(File file) {
    Todo todo = new Todo();
    file = new File("todoFile.txt");
    FileInputStream fin = null;
    try {
      fin = new FileInputStream(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    ObjectInputStream ois = null;
    try {
      ois = new ObjectInputStream(fin);
    } catch (IOException e) {
      e.printStackTrace();
      try {
        todo = (Todo) ois.readObject();
      } catch (IOException e1) {
        e1.printStackTrace();
      } catch (ClassNotFoundException e1) {
        e1.printStackTrace();
      }
    }
    System.out.println(todo.toString());

  }

  public static Map printMaps(Map<Integer, Todo> map) {
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry) it.next();
      System.out.println(pair.getKey() + ": " + pair.getValue());
      // it.remove(); // avoids a ConcurrentModificationException
    }
    return map;
  }

  int listSize = todos.size();

  Todo todo1 = new Todo("Buy milk", "20 December", 2);
  Todo todo2 = new Todo("Walk the dog", "Today", 2);
  Todo todo3 = new Todo("Do homework", "15 December", 1);

  public Map<Integer, Todo> getTodos() {
    return todos;
  }

  public int getListSize() {
    return listSize;
  }

  public Map<Integer, Todo> fillList() {
    todos.put(1, todo1);
    todos.put(2, todo2);
    todos.put(3, todo3);

    return todos;
  }

  public void listTodos(Map<Integer, Todo> map) {
    printMaps(map);
  }

  public void removeTodo(Map<Integer, Todo> todoMap, String args1) {
    todoMap.remove(args1);
  }

  public void addTodo(Map<Integer, Todo> todoMap, String args1, String args2, String args3, String args4) {
    Todo newestTodo = new Todo(args2, args3, Integer.parseInt(args4));
    todoMap.put(Integer.parseInt(args1), newestTodo);
    writeFiles(printMaps(todoMap));
  }

  public void setComplete(Map<Integer, Todo> todoMap, String args1) {
    for (int i = 0; i < todoMap.size(); i++) {
      if (todoMap.get(Integer.parseInt(args1)) != null) {
        todoMap.get(Integer.parseInt(args1)).setDone(true);
      }
    }
  }
}