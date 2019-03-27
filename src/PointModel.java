
public class PointModel {

	double x, y, z;

	public PointModel(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "PointModel [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
