package day4assignment2;

public class Student {
	
	int stdid;
	String stdname;
	int stdmarks;
	
	
	public Student(int stdid, String stdname, int stdmarks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdmarks=" + stdmarks + "]";
	}
	
	

}
