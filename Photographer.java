import java.util.*;

public class Photographer{

  private String name;
  private ArrayList<Camera> camera_collection;

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

  // public void getCamera(Camera camera){
  //   if (cameraCount() > 0) {
  //     return camera_collection.remove();
  //   }
  //   return null;
  // }

  // public String getCameraDetails(Camera camera){
  //   camera_collection.printDetails(camera);
  // }

}

// public int totalNutrition() { 
//   int count = 0;
//     for (Edible food : belly) {
//       count = count + food.nutritionValue();
//     } 
//     return count;
// }