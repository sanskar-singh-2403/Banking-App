package com.example.gripproject.DB;

import android.provider.BaseColumns;

public class TransactionContract {
    private TransactionContract(){}

    public static final class TransactionEntry implements BaseColumns{
        //Declaring table name
        public static final String TABLE_NAME ="Transaction_table";

        // Table fields
        public static final String _ID=BaseColumns._ID;
        public final static String COLUMN_FROM_NAME = "from_name";
        public final static String COLUMN_TO_NAME = "to_name";
        public final static String COLUMN_AMOUNT = "amount";
        public final static String COLUMN_STATUS = "status";

    }
}
