import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  Map<String, ArrayList<String, Integer>> typeCarAceppted;
  ArrayList<String> seatMaterial;

  public UberVan(String license, Account driver,
      Map<String, ArrayList<String, Integer>> typeCarAceppted,
      ArrayList<String> seatMaterial){
        super(license, driver);
        this.typeCarAceppted = typeCarAceppted;
        this.seatMaterial = seatMaterial;

  }
}
