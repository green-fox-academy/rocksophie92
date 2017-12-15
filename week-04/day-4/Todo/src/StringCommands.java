public enum StringCommands {

  LIST_TODOS("-l"),
  REMOVE_TODO("-r"),
  ADD_TODO("-a"),
  SET_TO_DONE("-c");

  String s;

  StringCommands(String s) {
    this.s = s;
  }
}
