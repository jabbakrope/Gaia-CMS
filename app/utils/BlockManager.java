package utils;

import java.util.*;

import play.Play;
import play.db.Model;

import models.blocks.Block;

public class BlockManager {

	public static List<Object> blocks = null;
	
	public static Class<? extends Block> addBlockFromModel(Class<?> clazz) throws ClassNotFoundException {
		Class<? extends Block> block = null;
		try {
			block = (Class<? extends Block>) Play.classloader.loadClass(clazz.getName());
			if (blocks == null) {
				blocks = new ArrayList();
			}
			blocks.add(block);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return block;
	}
	
	
}
