
public class DateP {

	
	private int j;
	private int m;
	private int a;

	public DateP()
	{
		
	}
	
	public DateP(int j, int m, int a)
	{
		this.j=j;
		this.m=m;
		this.a=a;	
	}
	
	
	public int getj() {
		return j;
	}
	public void setj(int j) {
		this.j = j;
	}
	
	public int getm() {
		return m;
	}
	public void setm(int m) {
		this.m = m;
	}
	
	public int geta() {
		return a;
	}
	void seta(int a) {
		this.a = a;
	}

	public DateP getDate()
	{
		DateP d = new DateP(this.j,this.m,this.a);
		return d;
		
	}
	
	
	public String toString()
	{
		return ( j+"/"+m+"/"+a );
	}

	public void affiche()
	{
		System.out.println("Date : "+ toString());
	}
	
}
