## Concepts Demonstrated

- Class inheritance (`extends`)
- Method overloading vs overriding
- Encapsulation with protected fields and public accessors
- Mathematical modeling using `Math.sqrt()` and `Math.pow()`
- Clean object construction patterns

---

## File Contents

- `Point.java` – Base class for 2D point representation
- `Point3D.java` – Subclass adding z-axis and 3D behavior
- `TestingPoint.java` – Contains the `main()` method to test `Point` and `Point3D` functionality
- `README.md` – This documentation file

---

## Sample Output

java
Point p1 = new Point(3, 4);
System.out.println(p1.computeDistance(0, 0)); // → 5.0

Point3D p3 = new Point3D(1, 2, 2);
System.out.println(p3.computeDistance(0, 0, 0)); // → 3.0

## Class Structure

Point
├─ protected double x
├─ protected double y
├─ getX(), setX(), getY(), setY()
├─ Point(), Point(double, double), Point(Point)
├─ computeDistance(double, double)
├─ computeDistance(Point)
└─ toString()

Point3D extends Point
├─ protected double z
├─ getZ(), setZ()
├─ Point3D(), Point3D(double, double, double), Point3D(Point3D)
├─ computeDistance(double, double, double)
├─ computeDistance(Point3D)
└─ toString() ← overrides


