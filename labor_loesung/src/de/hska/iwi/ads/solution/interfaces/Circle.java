package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle{

	public Circle(double radius) {
		super(radius);
		if (radius <= 0.0) {
		      throw new IllegalArgumentException("negative radius not allowed: " + radius);
		}
		this.radius = radius;
	}
	
	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
		if (radius <= 0.0) {
		      throw new IllegalArgumentException("negative radius not allowed: " + radius);
		}
		this.middlePoint = middlePoint;
		this.radius = radius;
	}

	@Override
	public void scale(double factor) {
		if (factor < 0) {
			return;
		}
		this.radius = this.radius * factor;
	}

	@Override
	public double getDimension() {
		return this.radius;
	}

	@Override
	public double area() {
		double area;
		area = this.radius * this.radius * Math.PI;
		return area;
	}

	

}
