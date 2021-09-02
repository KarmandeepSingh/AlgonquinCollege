package Lab4;
public class MetalCube {
	private double length; // centimeter
	private double width; // centimeter
	private double height; // centimeter

	// EPSILON is set at one-tenth of a centimeter, i.e.
	// less-than-or-equal-to one millimeter.
	private static final double EPSILON = 0.1;

	public MetalCube() { // default constructor
		this(10, 10, 10);
	}

	public MetalCube(double length, double width, double height) { // overloaded constructor
		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	public double getLength() { // accessor for length
		return length;
	}

	public void setLength(double length) { // mutator for length
		this.length = length;
	}

	public double getWidth() { // accessor for width
		return width;
	}

	public void setWidth(double width) { // mutator for width
		this.width = width;
	}

	public double getHeight() { // accessor for height
		return height;
	}

	public void setHeight(double height) { // mutator for height
		this.height = height;
	}

	public boolean isWithinTolerance() { // method which determines whether the metal cube is within the threshhold of
											// 1mm using EPSILON
		boolean result = true;

		result = (Math.abs((length - 10)) <= EPSILON) && (Math.abs((width - 10)) <= EPSILON)
				&& (Math.abs((height - 10)) <= EPSILON);

		return result;
	}

}
