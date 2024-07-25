package StructuralDP.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

	static Robot createRobot(String type)
	{
		Map<String,Robot> map=new HashMap<String,Robot>();

		if(map.containsKey(type))
		{
			return map.get(type);
		}

		if(type.equalsIgnoreCase("HumanRobot"))
		{
			HumanRobot h=new HumanRobot("HumanRobot");
			map.put(h.type,h);
			return h;
		}
		else if(type.equalsIgnoreCase("BirdRobot"))
		{
			BirdRobot h=new BirdRobot("BirdRobot");
			map.put(h.type,h);
			return h;
		}
		else 
		{
			return null;
		}
	}

}
