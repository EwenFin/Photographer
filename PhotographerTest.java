import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("David Bailey");
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


}