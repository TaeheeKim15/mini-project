package mini.project;

import java.util.ArrayList;
import java.util.Queue;

import mini.project.util.Prompt;

public class Order {
	
	MenuList menuList = new MenuList();
	
	ArrayList<Table> tableList = new ArrayList<>();
	ArrayList<Menu> menuNameList = new ArrayList<>();
	int count, count2;

	public void add() {
		Table table = new Table();
		table.setNum(Prompt.inputInt(" - 테이블 번호: "));
		table.setPeople(Prompt.inputInt(" - 고객수: "));
		
		while (true) {
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = 
			}
			table.setOrder(Prompt.inputInt(" - 주문 번호: "));
			table.setAmount(Prompt.inputInt(" - 수량: "));		
			String str = Prompt.inputString(" - 주문을 추가하겠습니까?(y/N) ");
			if (!str.equalsIgnoreCase("y")) {
				break;
			}
		}
		
		tableList.add(table);
	}


	
	public void list() {
		System.out.println("\n[ 주문 목록 ]");
		Object[] tables = tableList.toArray();
		for (Object obj : tables) {
			Table table = (Table) obj;
			System.out.printf(" 주문 번호: %d, 수량: %d\n",
					table.getOrder(),table.getAmount());
		}
	}	

	

	public void change() {
		System.out.println("[ 메뉴 변경 ]\n");
		int num = Prompt.inputInt("변경할 테이블 번호: ");
		Table table = findByNum(num);
		
		if (table == null) {
			System.out.println("해당 번호의 테이블이 없습니다.");
			return;
		}
		
		while (true) {
			 a = Prompt.inputInt(" - 주문 번호: ");
			queue.offer(a);
			Prompt.inputInt(" - 주문 번호: ");
			table.setNum(Prompt.inputInt(" - 수량: "));
			
			String str = Prompt.inputString(" - 계속하시겠습니까?(y/N) ");
			if (!str.equalsIgnoreCase("y")) {
				break;
			}
		}
		
	}
	
	@SuppressWarnings("unused")
	private Table findByNum(int num) {
		for (int i = 0; i < tableList.size(); i++) {
			Table table = tableList.get(i);
			if (table.getNum() == num) {
				return table;
			}
		}
		return null;
	}

}

















