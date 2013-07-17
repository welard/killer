package killer;


import java.awt.Graphics;


import org.ghostbot.script.Manifest;
import org.ghostbot.script.Manifest.Category;
import org.ghostbot.script.Script;
import org.ghostbot.script.events.MessageEvent;
import org.ghostbot.script.listeners.MessageListener;
import org.ghostbot.script.listeners.PaintListener;
import org.ghostbot.script.methods.Bank;

import org.ghostbot.script.methods.Inventory;
import org.ghostbot.script.methods.NPCs;
import org.ghostbot.script.methods.Players;
import org.ghostbot.script.methods.Skill;
import org.ghostbot.script.methods.Tab;

import org.ghostbot.script.wrappers.NPC;
import org.ghostbot.script.wrappers.Tile;






@Manifest(author = "welard", name = "killer", version = 1.0, category = Category.COMBAT, description = "This is a killer.")
public class Guard extends Script implements PaintListener, MessageListener {


	
	
	private static final int HEALTH = 15;
	//for on start
	private int [] monsterChosen = ids.goblinid;
	private int foodChosen = ids.Salmon;
	 Tile locationChosen = ids.GoblinVillage;

	
	
	
	@Override
public int loop() {
		if(Players.getLocal().isInCombat() && Skill.HITPOINTS.getLevel()>HEALTH){
			sleep(1000,1500);
			return 50;
		}
		
		if (Skill.HITPOINTS.getLevel()>HEALTH && (Inventory.contains(foodChosen)))
		{
		atackgob();
		}
	
	
	if(Skill.HITPOINTS.getLevel()<HEALTH && (Inventory.contains(foodChosen)))
    {
         log(Skill.HITPOINTS.getLevel());
        Eat();
        log("eating");
      }
	
	if (!Inventory.contains(foodChosen))
		{
			
						bank();
						sleep(1000,1200);
		}
		        
      return 100;
		
   }

private void atackgob() {
NPC t = NPCs.getNearest(monsterChosen);
if (t != null && t.isOnScreen()) {
	if (t.interact("attack goblin"))
	sleep(1000,1500);
	{
		
		}
	}
 }

	            
private void Eat() {
	 if(Skill.HITPOINTS.getLevel()<HEALTH)
		 Tab.INVENTORY.open();
     sleep(400,800);
     log("looking for food id");
		 Inventory.getItem(foodChosen).click();
	log("found food id");
     sleep(500,1000);
    if (Inventory.getItem(foodChosen) != null) {
    	log("out of food");
    	
    }
     

}
private void bank() {
	log("banking tab");
    if (Bank.isOpen()){                   //Bank class,  checks to see if the bank is open
     	//Bank.(foodChosen, 20);
     	
     	 sleep(800, 1200);                 //Sleeps in case of lag
        Bank.close();                     //Closes the bank after depositing
    }   else {
    	//Walking.walkTowards(locationChosen);
		 sleep(1200,2000);
    	 NPC npc = NPCs.getNearest(killer.ids.banknpcid);
         if (npc != null ) {
             npc.interact("Bank Banker");
         }
         }
}	   
	
/*private void bank() {
	
         sleep(1000,1200);
        if (Bank.isOpen()) {
             Bank.withdraw(foodChosen, 28);
             
         }
     }
	
	
}*/

@Override
public void messageReceived(MessageEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onRepaint(Graphics arg0) {
	// TODO Auto-generated method stub
	
}
   }
      
   
   
  
