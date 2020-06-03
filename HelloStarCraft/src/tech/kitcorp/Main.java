package tech.kitcorp;

public class Main {
    public static void main(String[] args) {
        Zerg zerg_1 = new Zerg();
        zerg_1.name = "Z-1";
        Zerg zerg_2 = new Zerg();
        zerg_2.name = "Z-2";
        Zerg zerg_3 = new Zerg();
        zerg_3.name = "Z-3";
        Zerg zerg_4 = new Zerg();
        zerg_4.name = "Z-4";
        Zerg zerg_5 = new Zerg();
        zerg_5.name = "Z-5";

        Protoss protos_1 = new Protoss();
        protos_1.name = "P-1";
        Protoss protos_2 = new Protoss();
        protos_2.name = "P-2";
        Protoss protos_3 = new Protoss();
        protos_3.name = "P-3";

        Terran terran_1 = new Terran();
        terran_1.name = "T-1";
        Terran terran_2 = new Terran();
        terran_2.name = "T-2";
        Terran terran_3 = new Terran();
        terran_3.name = "T-3";
        Terran terran_4 = new Terran();
        terran_4.name = "T-4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
// Создать 5 зергов, 3 протосса и 4 террана.
// Дать им всем уникальные имена.