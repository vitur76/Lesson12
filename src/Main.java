// Clasa CPU cu clase interne Processor și RAM
class CPU {
    private String model;

    // Constructor pentru CPU
    public CPU(String model) {
        this.model = model;
    }



    // Clasa internă Processor
    class Processor {
        private String speed;

        // Constructor pentru Processor
        public Processor(String speed) {
            this.speed = speed;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor model: " + model + " cu viteza: " + speed);
        }
    }

    // Clasa internă RAM
    class RAM {
        private String capacity;

        // Constructor pentru RAM
        public RAM(String capacity) {
            this.capacity = capacity;
        }

        public void displayRAMInfo() {
            System.out.println("RAM pentru " + model + " cu capacitatea de: " + capacity);
        }
    }
}

// Clasa MotherBoard cu clasa statică USB
class MotherBoard {
    private String model;

    // Constructor pentru MotherBoard
    public MotherBoard(String model) {
        this.model = model;
    }

    // Clasa statică USB
    static class USB {
        private String type;

        // Constructor pentru USB
        public USB(String type) {
            this.type = type;
        }

        public void displayUSBInfo() {
            System.out.println("USB tip: " + type);
        }
    }
}

// Clasa principală pentru testare
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect CPU
        CPU cpu = new CPU("Intel i7");

        // Crearea unui obiect Processor și RAM
        CPU.Processor processor = cpu.new Processor("3.6 GHz");
        CPU.RAM ram = cpu.new RAM("16GB");

        // Afișarea informațiilor despre Processor și RAM
        processor.displayProcessorInfo();
        ram.displayRAMInfo();

        // Crearea unui obiect MotherBoard
        MotherBoard motherBoard = new MotherBoard("Asus");

        // Crearea unui obiect USB
        MotherBoard.USB usb = new MotherBoard.USB("USB 3.0");

        // Afișarea informațiilor despre USB
        usb.displayUSBInfo();
    }
}
