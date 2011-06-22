package net.bespokesystems.android.apps.wicsa2011.de;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched.util.ParserUtils;

public class Setup {


	/**
	 * Clone then google docs document from here
	 * @link https://spreadsheets.google.com/ccc?key=0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE&hl=en&authkey=CIaKgpcD
	 *
	 * or from templates gallery
	 * 
	 * @link https://docs.google.com/templates?q=gddsched&sort=hottest&view=author
	 */

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0Ah76sIxERqHNdEVkd1Z1Q3VvTDREclJCMFpFYU94a0E/public/basic"; 
		//"http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";
		// https://spreadsheets.google.com/feeds/list/0Ah76sIxERqHNdEVkd1Z1Q3VvTDREclJCMFpFYU94a0E/od6/public/basic?alt=rss
	public static final String EXTRA_STATUS_RECEIVER = "net.bespokesystems.android.apps.wicsa2011.extra.STATUS_RECEIVER";
	public static final TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("America/Denver");

	public static final String TIME_ZONE = "-0600"; // RFC 822 - time zone
	// Europe/Berlin +0100
	// America/Denver -0600

	public static final String DAY1_START = "2011-06-20T08:00:00.000-07:00";
	public static final String DAY1_END = "2011-06-20T20:00:00.000-07:00";
	
	public static final String DAY2_START = "2011-06-21T08:00:00.000-07:00";
	public static final String DAY2_END = "2011-06-21T21:30:00.000-07:00";
	
	public static final String DAY3_START = "2011-06-22T08:00:00.000-07:00";
	public static final String DAY3_END = "2011-06-22T21:30:00.000-07:00";
	
	public static final String DAY4_START = "2011-06-23T08:00:00.000-07:00";
	public static final String DAY4_END = "2011-06-23T18:00:00.000-07:00";
	
	public static final String DAY5_START = "2011-06-24T08:00:00.000-07:00";
	public static final String DAY5_END = "2011-06-24T18:30:00.000-07:00";

	public static final long CONFERENCE_START_MILLIS = ParserUtils.parseTime(DAY1_START);
	public static final long CONFERENCE_END_MILLIS = ParserUtils.parseTime(DAY5_END);

	public static final Locale LOCALE = Locale.US;
	// public static final Locale LOCALE = Locale.GERMANY;
	public static final String EVENT_YEAR = "2011";
	// public static final String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	//public static final String CONFERNCE_URL = "http://www.google.de/intl/en/events/developerday/2010/";
	public static final String CONFERNCE_URL = "http://www.wicsa.net/";
	public static final String CONTENT_AUTHORITY = "net.bespokesystems.android.apps.wicsa2011.de";
	public static final String DATABASE_NAME = "schedule_de.db";

	public static final boolean USE_WIFI_CHECK = false;
	public static final int VER_SESSION_HASHTAG = 6;

}