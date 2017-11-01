package tt.biz.pay.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtils
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: zy1458
 * @date: 2017年4月20日 下午3:48:45
 */
public class DateUtils {
	private static final String defaultFormat = "yyyy-MM-dd";

	public static Long getDaysOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return Long.valueOf(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	/***
	 * 给日期增加多少天
	 * 
	 * @param calDate
	 * @param addDate
	 *            类型必须是long
	 * @return
	 */
	public static Date addCalendarDay(Date calDate, long addDate) {
		long time = calDate.getTime();
		addDate = addDate * 24 * 60 * 60 * 1000;
		time += addDate;
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return new Date(time);
	}

	public static String date2String(Date date) {
		return date2String(date, defaultFormat);
	}

	public static String date2String(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static Date string2Date(String date) {
		return string2Date(date, defaultFormat);
	}

	public static Date string2Date(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
