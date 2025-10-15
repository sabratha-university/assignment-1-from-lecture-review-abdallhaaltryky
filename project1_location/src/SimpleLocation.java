public class SimpleLocation {
    private double latitude;
    private double longitude;

    // 🔹 Constructor Overloading Example
    // يوجد هنا أكثر من "constructor" بنفس الاسم (SimpleLocation)
    // لكن يختلفان في المعاملات (parameters)
    // هذا يُسمى **Overloading**
    public SimpleLocation() {
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    public SimpleLocation(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    // 🔹 هذه ليست Overriding لأنها ليست إعادة تعريف لدالة من فئة (class) أب أو واجهة (interface)
    // وإنما دالة جديدة اسمها distance
    public double distance(SimpleLocation other) {
        double earthRadius = 6371.0; // km
        double dLat = Math.toRadians(other.latitude - this.latitude);
        double dLon = Math.toRadians(other.longitude - this.longitude);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }

    // Getter and Setter methods
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
}
