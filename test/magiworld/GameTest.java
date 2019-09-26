package magiworld;

import com.tizzone.magiworld.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** 
* Game Tester. 
* 
* @author <Authors name> 
* @since <pre>sept. 25, 2019</pre> 
* @version 1.0 
*/ 
public class GameTest { 
Game game= new Game();
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void Given_Warrior_When_DisplaySelected_Then_DisplayWarriorSentence(){
    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
    game.DisplaySelectedCharacter(1, 10, 50, 10, 10, 0);
	assertEquals("Woarg je suis le Guerrier Joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilité et 0 d'intélligence\n", outContent.toString().replace("\r\n", "\n"));

}



} 
