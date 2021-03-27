//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public Driver() {
    }

    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));
        Iterator var3 = monsters.iterator();

        while(var3.hasNext()) {
            Monster m = (Monster)var3.next();
            System.out.println(m);
        }

    }
}
