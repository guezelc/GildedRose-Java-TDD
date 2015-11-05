package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest 
{
	
	Item Item1 = new Item("+5 Dexterity Vest", 10, 20); 
	Item Item2 = new Item("Aged Brie", 2, 0); 
	Item Item3 = new Item("Elixir of the Mongoose", 5, 7);
	Item Item4 = new Item("Sulfuras, Hand of Ragnaros", 0, 80); 
	Item Item5 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20); 
	Item Item6 = new Item("Conjured Mana Cake", 3, 6);
	
	@Test
	public void getterTest()
	{
		assertEquals(Item1.getQuality(),20);
		assertEquals(Item1.getName(),"+5 Dexterity Vest");
		assertEquals(Item1.getSellIn(),10);
	}
	

	@Test
	public void setterTest()
	{	
		Item1.setQuality(Item1.getQuality()-1);
		Item1.setName("JeanMichelCrapeau");
		Item1.setSellIn(Item1.getSellIn()-1);
		
		assertEquals(Item1.getQuality(),19);
		assertEquals(Item1.getName(),"JeanMichelCrapeau");
		assertEquals(Item1.getSellIn(),9);
	}
	 

}
