import org.junit.Before;
import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by doug on 4/10/17.
 */
public class MenuServiceTest {

   ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

   @Before
   public void before(){
      System.setOut(new PrintStream(outputStream));
   }

   @Test
   public void iWantToSeetheMainMenu(){
      Scanner scanner = new Scanner("1");
      MenuService menu = new MenuService(scanner);

      menu.showMenu();

      // look at output...
      // is it SHOWING a menu?!
      assertThat(outputStream.toString(), containsString("Main Menu"));

   }

   @Test
   public void iWantToSeeAListOfValidMainMenuOptions(){
      Scanner scanner = new Scanner("1");
      MenuService menu = new MenuService(scanner);

      menu.showMenu();

      // I want to see my options!
      assertThat(outputStream.toString(), containsString("List animals"));
      assertThat(outputStream.toString(), containsString("Create animal"));
      assertThat(outputStream.toString(), containsString("View animal"));
      assertThat(outputStream.toString(), containsString("Edit animal"));
      assertThat(outputStream.toString(), containsString("Delete animal"));
      assertThat(outputStream.toString(), containsString("Quit"));

   }

   @Test
   public void iWantToMakeAValidChoiceOnTheMainMenu(){
      Scanner scanner = new Scanner("1");
      MenuService menu = new MenuService(scanner);

      menu.showMenu();

      // add asserts here....

   }



}
