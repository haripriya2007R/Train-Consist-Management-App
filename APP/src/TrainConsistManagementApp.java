public class TrainConsistManagementApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                // Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("==========================================\n");

        // Safe Case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe Case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}