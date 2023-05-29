package HomeWork6;

public class NoteList {
        int number, ram, hd, price;
        String brand, colour, system;

        public NoteList(int number, String brand, int ram, int hd, String system, String colour, int price) {
            this.number = number;
            this.brand = brand;
            this.ram = ram;
            this.hd = hd;
            this.system = system;
            this.colour = colour;
            this.price = price;
        }

        public static StringBuilder getHD(NoteList[] store, int hd) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (hd == el.hd) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        public static StringBuilder getRAM(NoteList[] store, int ram) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (ram == el.ram) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        public static StringBuilder getSystem(NoteList[] store, String system) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (el.system.equalsIgnoreCase(system)) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        public static StringBuilder getColour(NoteList[] store, String colour) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (colour.equalsIgnoreCase(el.colour)) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        public static StringBuilder getBrand(NoteList[] store, String developer) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (developer.equalsIgnoreCase(el.brand)) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        public static StringBuilder getPrice(NoteList[] store, int price) {
            StringBuilder result = new StringBuilder();
            for (NoteList el : store) {
                if (price == el.price) {
                    result.append("brand: " + el.brand + ", " + "RAM: " + el.ram + ", " + "HD: " + el.hd + ", " + "System: "
                            + el.system + ", " + "colour: " + el.colour + ", " + "price: " + el.price + "\n");
                }
            }
            return result;
        }

        @Override
        public String toString() {
            return String.format("number: %d, brand: %s, RAM: %d, HD: %d, System: %s, colour: %s", number, brand, ram, hd,
                    system, colour, price);
        }

        public static char[] getPrice(NoteList[] store, String nextLine) {
            return null;
        }

}