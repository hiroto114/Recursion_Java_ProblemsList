class RGB {
	int red;
	int green;
	int blue;

	RGB(int red,int green,int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	String getHexCode() {
		//return "#"+(Integer.toHexString(red*65536+green*256+blue)).PadLeft(6, '0');

		return "#"+String.format("%6s", Integer.toHexString(red*65536+green*256+blue)).replace(" ", "0");
	}

	String getBits() {
		return Integer.toBinaryString(red*65536+green*256+blue);
	}

	String getColorShade() {
		if(red == green && red == blue) return "grayscale";
		if((red>green)&&(red>blue)) return "red";
		if((green>red)&&(green>blue)) return "green";
		return "blue";
	}
}

public class Problem401 {
	public static void main(String[] args){
		RGB color1 = new RGB(0, 153, 255);
		System.out.println(color1.getHexCode());
		System.out.println(color1.getBits());
		System.out.println(color1.getColorShade());

		RGB color2 = new RGB(255, 153, 204);
		System.out.println(color2.getHexCode());
		System.out.println(color2.getBits());
		System.out.println(color2.getColorShade());

		RGB color3 = new RGB(0, 87, 0);
		System.out.println(color3.getHexCode());
		System.out.println(color3.getBits());
		System.out.println(color3.getColorShade());

		RGB gray = new RGB(123, 123, 123);
		System.out.println(gray.getHexCode());
		System.out.println(gray.getBits());
		System.out.println(gray.getColorShade());
	}
}
