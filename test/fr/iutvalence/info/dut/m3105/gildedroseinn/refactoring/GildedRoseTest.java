package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	public ArrayList<Item> items = new ArrayList<Item>();
	
	Item Item1 = new Item("+5 Dexterity Vest", 10, 20); 
	Item Item2 = new Item("Aged Brie", 2, 0); 
	Item Item3 = new Item("Elixir of the Mongoose", 5, 7);
	Item Item4 = new Item("Sulfuras, Hand of Ragnaros", 0, 80); 
	Item Item5 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20); 
	Item Item6 = new Item("Conjured Mana Cake", 3, 6);
	
	
	
	@Test
	public void updateItemTest()
	{
		GildedRose.updateItem(Item1);
		
		assertEquals(Item1.getQuality(),19);
		assertEquals(Item1.getSellIn(),9);
	}
	
	@Test
	public void newDayTest()
	{
		items.add(new Item("+5 Dexterity Vest", 10, 20)); 
		items.add(new Item("Aged Brie", 2, 0)); 
		items.add(new Item("Elixir of the Mongoose", 5, 7)); 
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
		items.add(new Item("Conjured Mana Cake", 3, 6));
		
		GildedRose.newDay(items);
		
		assertEquals(items.get(0).getQuality(),19);
		assertEquals(items.get(0).getSellIn(),9);
		
	}

}