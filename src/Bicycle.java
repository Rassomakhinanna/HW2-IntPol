public class Bicycle extends Transport {

        public String modelName;
        public int wheelsCount;

        public Bicycle (String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        @Override
        public void updateTyre() {
            System.out.println("Меняем велосипедную покрышку");
        }

        @Override
        public void transportService() {
            updateTyre();

    }
}
