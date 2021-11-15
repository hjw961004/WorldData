package WorldData;

public class Info {
	public String name;
	public String code;
	public String capital;
	public String weather;
	public String location;
	public String religion;
	public String area;
	public String language;
	
	public Info(String n, String c, String ca, String w, String l, String r, String a, String la) {
		name=n;
		code=c;
		capital=ca;
		weather=w;
		location=l;
		religion=r;
		area=a;
		language=la;
	}
	
	public Info() {
		name="";
		code="";
		capital="";
		weather="";
		location="";
		religion="";
		area="";
		language="";
	}
	
}
