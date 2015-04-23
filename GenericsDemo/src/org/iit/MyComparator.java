package org.iit;

import java.util.Comparator;

public class MyComparator implements Comparator<MyTime> {

	@Override
	public int compare(MyTime o1, MyTime o2) {
		// TODO Auto-generated method stub

		if (o1.hour - o2.hour != 0)
			return o1.hour - o2.hour;

		if (o1.min - o2.min != 0)
			return o1.min - o2.min;

		return o1.second - o2.second;
	}

}
