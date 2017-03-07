import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera camera;
  AnalogueCamera camera2;


  @Before
  public void before() {
    photographer = new Photographer("David Bailey");
    camera = new DigitalCamera();
    camera2 = new AnalogueCamera();
  }

  @Test
  public void hasName(){
    assertEquals("David Bailey", photographer.getName());
  }

  @Test
  public void collectionStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddToCollection(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveFromCollection(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void printOutCollection(){

  }

}