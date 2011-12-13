package models.pages;

import com.google.code.morphia.annotations.*;
import java.util.*;

import models.blocks.Block;
import play.modules.morphia.*;

@Entity
public class Frontpage extends Page {
	
	@Embedded
	public List<Block> mainArea;
	
	
}
