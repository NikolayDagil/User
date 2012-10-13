import java.util.ArrayList;

public class ListObject {

	public ArrayList<String> description() {
		ArrayList<String> description = new ArrayList<String>();
		description.add("Круглый");
		description.add("Квадратный");
		description.add("Овальный");
		return description;
	}

	public ArrayList<String> name() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Стул");
		name.add("Шкаф");
		name.add("Стол");
		return name;
	}

	public ArrayList<Integer> price() {
		ArrayList<Integer> price = new ArrayList<Integer>();
		price.add(14);
		price.add(27);
		price.add(20);
		return price;
	}

}