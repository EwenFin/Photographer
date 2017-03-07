import java.util.*;

public class Photographer {
  private String name;
  private ArrayList<Camera> collection;

  public Photographer(String name){
    this.name = name;
    this.collection = new ArrayList<Camera>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return collection.size();
  }

  public void addCamera(Camera device){
    collection.add(device);
  }

  public Camera removeCamera(){
    if (cameraCount() > 0) {
      /*return?*/collection.remove(cameraCount() -1);
    }
    return null;
  }

  public String printAllDetails(){
    for(Camera device : collection){
      String details = (device.printDetails()) + "' ";  
    }
    return details;
  } 
}