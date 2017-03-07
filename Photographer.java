import java.util.*;

public class Photographer{

  private String name;
  private ArrayList<Camera> camera_collection;
  private HashMap<String, Integer> journal = new HashMap<String, Integer>();

  public Photographer(String name){
    this.name = name;
    this.camera_collection = new ArrayList<Camera>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return camera_collection.size();
  }

  public void addCamera(Camera camera){
    camera_collection.add(camera);
  }

  public void removeCamera(Camera camera){
    camera_collection.remove(camera);
  }

  public Camera getCameraDetails(){
    if (cameraCount() > 0) {
      return camera_collection.remove(cameraCount() -1);
    }
    return null;
  }

}