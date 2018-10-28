//package database;
//
//import android.arch.persistence.db.SupportSQLiteOpenHelper;
//import android.arch.persistence.room.DatabaseConfiguration;
//import android.arch.persistence.room.InvalidationTracker;
//import android.arch.persistence.room.RoomDatabase;
//import android.support.annotation.NonNull;
//
//import models.searchFoods.Common;
//
//@android.arch.persistence.room.Database(entities = {Common.class}, version = 1)
//public class Database extends RoomDatabase {
//    @NonNull
//    @Override
//    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    protected InvalidationTracker createInvalidationTracker() {
//        return null;
//    }
//
//    @Override
//    public void clearAllTables() {
//
//    }
//}
