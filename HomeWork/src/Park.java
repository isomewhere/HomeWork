public class Park {

    public static class Attraction {
        private String name;
        private String operatingHours;
        private double price;

        public Attraction(String name, String operatingHours, double price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.printf("Аттракцион: %s, Время работы: %s, Стоимость: %.2f%n",
                    name, operatingHours, price);
        }

        public String getName() {
            return name;
        }
        public String getOperatingHours() {
            return operatingHours;
        }
        public double getPrice() {
            return price;
        }
    }

        public static void main(String[] args) {

            Attraction rollerCoaster = new Attraction("Американские горки", "10:00 - 18:00", 500.00);
            Attraction ferrisWheel = new Attraction("Колесо обозрения", "9:00 - 21:00", 300.00);
            Attraction hauntedHouse = new Attraction("Дом страха", "11:00 - 22:00", 400.00);

            rollerCoaster.printInfo();
            ferrisWheel.printInfo();
            hauntedHouse.printInfo();
        }
    }

