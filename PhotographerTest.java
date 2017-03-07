import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  AnalogueCamera analogue_camera;
  DigitalCamera digital_camera;

  @Before
  public void before() {
    photographer = new Photographer("Peter");
    analogue_camera = new AnalogueCamera();
    digital_camera = new DigitalCamera();
  }

  @Test
  public void hasName(){
    assertEquals("Peter", photographer.getName());
  }

  @Test
  public void cameraCollectionStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }
  
  @Test
  public void canAddCamera(){
    photographer.addCamera(analogue_camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(digital_camera);
    photographer.removeCamera(digital_camera);
    assertEquals(0, photographer.cameraCount());
  }

  // @Test
  // public void canRemoveCamera(){
  //   photographer.addCamera(digital_camera);
  //   Camera equipment = photographer.removeCamera();
  //   DigitalCamera original = (DigitalCamera) equipment;
  //   assertEquals("shutter speed: 60, zoom: 8X, ratio: 6:5", original.getCameraDetails());
  // }


  // @Test
  // public void canGetCameraDetails(){
  //   photographer.addCamera(digital_camera);
  //   Camera equipment = photographer.
  //   assertEquals("shutter speed: 60, zoom: 8X, ratio: 6:5", photographer.getCameraDetails());
  // }



  // @Test
  // public void canThrowUpChicken() {
  //   bear.eat(chicken);
  //   Edible food = bear.throwUp();
  //   Chicken original = (Chicken) food;
  //   assertEquals("Cluck!", original.cluck() );
  // }

}