package polimorphismbasic;

public class Machine {
	private int coalPieces;
	private float hairStrand;
	private String coalMsg;
	public Machine(int coalPieces, float hairStrand, String coalMsg) {
		super();
		this.coalPieces = coalPieces;
		this.hairStrand = hairStrand;
		this.coalMsg = coalMsg;
	}
	public int getCoalPieces() {
		return coalPieces;
	}
	public void setCoalPieces(int coalPieces) {
		this.coalPieces = coalPieces;
	}
	public float getHairStrand() {
		return hairStrand;
	}
	public void setHairStrand(float hairStrand) {
		this.hairStrand = hairStrand;
	}
	public String getCoalMsg() {
		return coalMsg;
	}
	public void setCoalMsg(String coalMsg) {
		this.coalMsg = coalMsg;
	}
	public void produceShoePolish()
	{
		if(coalPieces>=5)
		{
			int tot=coalPieces/5;
			tot=coalPieces+(tot*100);
			System.out.println(tot);
		}
		else {
			System.out.println(coalPieces);
		}
		if(hairStrand>=9.83)
		{
			float tothair=(float) (hairStrand/9.83);
			tothair=hairStrand+(tothair*100);
			System.out.println(tothair+"ml");
		}
		else {
			System.out.println(hairStrand);
		}
		String a[] =coalMsg.split(" "); 
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
	    {  
	    if ("coal".equals(a[i])) 
	        count++; 
	    } 
	    if(count>27)
	    {
	    	float tot=count/27;
	    	System.out.println(tot*100+"ml");
	    }
	    else
	    {
	    	System.out.println("There is no the word 'coal'");
	    }
	  

	}

}
