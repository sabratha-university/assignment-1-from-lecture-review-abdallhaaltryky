public class LocationTester {
    public static void main(String[] args) {
        // إنشاء كائنين (objects) باستخدام الـ constructor المـحمّل (Overloaded constructors)
        SimpleLocation myLocation = new SimpleLocation(32.8528366, 12.0798252);
        SimpleLocation college = new SimpleLocation(32.8524347, 12.0615573);

        // حساب المسافة بين الموقعين
        double distance = myLocation.distance(college);
        System.out.println("Distance to college: " + distance + " km");
    }
}
