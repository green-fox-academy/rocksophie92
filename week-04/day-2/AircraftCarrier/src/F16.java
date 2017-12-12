public class F16 extends Aircraft {

  private int length;

  public F16(int baseDamage, int maxAmmo, int ammoStore, String aircraftType, int length) {
    super(baseDamage,maxAmmo,ammoStore,aircraftType);
    this.length = length;
    //fight(this);
  }

  public void type(){
    System.out.println("i am f16");
  }


}
