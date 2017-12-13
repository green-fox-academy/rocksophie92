public enum PirateStrings {

  PASSED_OUT("passed out"),
  DEAD("dead"),
  SOBER("sober (OMG, bring the rum!)"),
  DRINK_MORE("Pour me anudder"),
  WIN_MESSAGE("You won the battle!"),
  BOTH_PASSEDOUT_MESSAGE("you were both too drunk and passed out."),
  DEAD_SPEECH("He is dead."),
  BEFORE_PASSOUT("Arghh, I'ma Pirate. How d'ya d'ink its goin?"),
  RUMS_CONSUMED(String.format("Still quite sober, rums consumed so far: %d",Pirate.rumsConsumed));


  String s;
  PirateStrings(String string) {
    s=string;
  }
}
