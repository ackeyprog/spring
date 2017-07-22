package jp.kei.spring.sample1;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class MyBean2 implements MyBeanInterface {
	private String message="hello";
	private Date date=Calendar.getInstance().getTime();
	
	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		return "'"+message+"("+format.format(date)+")";
	}

}
