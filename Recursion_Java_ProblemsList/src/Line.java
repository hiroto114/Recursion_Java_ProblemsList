class Line{
	public Point startPoint;
	public Point endPoint;
	public Line(Point startPoint,Point endPoint){
		this.startPoint = startPoint;
		this.endPoint   = endPoint;
	}
	public double getLength(){
		return Math.sqrt(Math.pow(startPoint.x-endPoint.x,2) + Math.pow(startPoint.y-endPoint.y,2));
	}
}