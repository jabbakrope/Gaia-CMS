package models.blocks;

import com.google.code.morphia.annotations.*;
import java.util.*;
import play.modules.morphia.*;

@Embedded
public class Text extends Block {

	public String title;
	public String content;
	
}
