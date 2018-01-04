package Model;

public enum TileTypes {

  Wall("tileWall", false), Path ("tilePath", true);

  String tileName;
  boolean isWalkable;

  TileTypes (String tileName, boolean isWalkable) {
    this.isWalkable = isWalkable;
    this.tileName = tileName;
  }

}
