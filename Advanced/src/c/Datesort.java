package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Datel
{
	String date;
	Datel(String date)
	{
		this.date=date;
	}
}
class comparesort implements Comparator<Datel>
{
	public int compare(Datel a,Datel b)
	{
		return b.date.compareTo(a.date);
	}
}


public class Datesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Datel> list=new ArrayList<>();
		list.add(new Datel("10 10 2002"));
		list.add(new Datel("13 8 2001"));
		list.add(new Datel("23 11 2000"));
		Collections.sort(list,new comparesort());
		for(Datel i:list)
		{
			System.out.println(i.date);
		}

	}

}
