package cm.itmk.hr.vo;
import java.util.List;
import java.io.*;

public class Admin implements Serializable {
	private List<Emp> emps;
	private String aid;
	private List<Action> actions = new ArrayList<Action>();
}