package com.kann0.calendarstudy.model;

import android.database.Cursor;
import android.provider.CalendarContract;

public class Calendar {

    public static final String[] PROJECTION = {
            CalendarContract.Calendars._ID,
            CalendarContract.Calendars.ACCOUNT_NAME,
            CalendarContract.Calendars.ACCOUNT_TYPE,
            CalendarContract.Calendars.CALENDAR_DISPLAY_NAME,
            CalendarContract.Calendars.IS_PRIMARY,
            CalendarContract.Calendars.OWNER_ACCOUNT,
            CalendarContract.Calendars.VISIBLE,
    };

    private static int PROJECTION_ID_INDEX = 0;
    private static int PROJECTION_ACCOUNT_NAME_INDEX = 1;
    private static int PROJECTION_ACCOUNT_TYPE_INDEX = 2;
    private static int PROJECTION_CALENDAR_DISPLAY_NAME_INDEX = 3;
    private static int PROJECTION_IS_PRIMARY_INDEX = 4;
    private static int PROJECTION_OWNER_ACCOUNT_INDEX = 5;
    private static int PROJECTION_VISIBLE_INDEX = 6;

    private long id;

    private String accountName;
    private String accountType;

    private String calendarDisplayName;
    private boolean isPrimary;
    private String ownerAccount;
    private boolean visible;

    public Calendar(Cursor cursor) {
        this.id = cursor.getLong(PROJECTION_ID_INDEX);
        this.accountName = cursor.getString(PROJECTION_ACCOUNT_NAME_INDEX);
        this.accountType = cursor.getString(PROJECTION_ACCOUNT_TYPE_INDEX);
        this.calendarDisplayName = cursor.getString(PROJECTION_CALENDAR_DISPLAY_NAME_INDEX);
        this.isPrimary = cursor.getInt(PROJECTION_IS_PRIMARY_INDEX) == 1;
        this.ownerAccount = cursor.getString(PROJECTION_OWNER_ACCOUNT_INDEX);
        this.visible = cursor.getInt(PROJECTION_VISIBLE_INDEX) == 1;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", calendarDisplayName='" + calendarDisplayName + '\'' +
                ", isPrimary=" + isPrimary +
                ", ownerAccount='" + ownerAccount + '\'' +
                ", visible=" + visible +
                '}';
    }
}
