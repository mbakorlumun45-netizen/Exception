package CustomExceptionClass;

public class Custom {

//    11.19

    // Phone.java
    public class Phone {
        private final String name;
        private final String serialNumber;

        public Phone(String name, String serialNumber) throws ValidationException {
            if (name == null || name.trim().isEmpty()) {
                throw new ValidationException("Name cannot be empty");
            }
            if (serialNumber == null || serialNumber.trim().isEmpty()) {
                throw new ValidationException("Serial number cannot be empty");
            }
            if (!serialNumber.matches("\\d{16}")) {
                throw new ValidationException(
                        "Serial number must be exactly 16 digits: " + serialNumber);
            }
            this.name = name;
            this.serialNumber = serialNumber;
        }

        public String getName() { return name; }
        public String getSerialNumber() { return serialNumber; }

        @Override
        public String toString() {
            return "Phone[name=" + name + ", serialNumber=" + serialNumber + "]";
        }
    }
}
