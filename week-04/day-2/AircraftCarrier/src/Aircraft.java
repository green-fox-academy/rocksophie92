public class Aircraft {
  int baseDamage;
  int maxAmmo;
  int ammoStore = 0;
  String AircraftType;
  public static final String FIGHT_RESULT = "Your aircraft dealt %d damage in the fight.";

  public Aircraft() {

  }

  public Aircraft(int baseDamage, int maxAmmo, int ammoStore, String aircraftType) {
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
    this.ammoStore = ammoStore;
    AircraftType = aircraftType;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setAmmoStore(int ammoStore) {
    this.ammoStore = ammoStore;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
    ;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAmmoStore() {
    return ammoStore;
  }

  public int fight() {

    int damage = baseDamage * ammoStore;
    System.out.println(String.format(FIGHT_RESULT, damage));
    setAmmoStore(0);
    return damage;
  }

  public int refill (Aircraft aircraft) {{
  }
  return 1;
  }

}