package minimap;

public class TestBot {
	private double navXValue = 0;
	private double encoderValue = 0;
	public int height = 25;
	public int width = 10;
	
	private double angle = 0;
	
	
	public void setHeading(int degree){
		this.navXValue = (double) degree;
	}
	
	public void setEncoder(double dist){
		this.encoderValue = (double) dist;
	}
	
	public void drive(){
		encoderValue += 1;
	}
	public void turn (int i){
		if (i == 0){
			navXValue += .1;
			navXValue %= 1;
		}
		else {
			navXValue -= .1;
			navXValue %= 1;
		}
	}
	
	
	public int getHeading(){
		//return 0.0;
		return (int) navXValue;
	}
	
	public double getAngle(){
		angle = 360*navXValue;
		return angle;
	}
	
	
	public double getEncoderVal(){
		return encoderValue;
	}
	
	
}
