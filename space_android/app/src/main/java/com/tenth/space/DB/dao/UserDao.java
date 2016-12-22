package com.tenth.space.DB.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.tenth.space.DB.entity.UserEntity;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table UserInfo.
*/
public class UserDao extends AbstractDao<UserEntity, Long> {

    public static final String TABLENAME = "UserInfo";

    /**
     * Properties of entity UserEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Relation = new Property(0, String.class, "relation", false, "RELATION");
        public final static Property Id = new Property(1, Long.class, "id", true, "_id");
        public final static Property PeerId = new Property(2, int.class, "peerId", false, "PEER_ID");
        public final static Property Gender = new Property(3, int.class, "gender", false, "GENDER");
        public final static Property MainName = new Property(4, String.class, "mainName", false, "MAIN_NAME");
        public final static Property PinyinName = new Property(5, String.class, "pinyinName", false, "PINYIN_NAME");
        public final static Property RealName = new Property(6, String.class, "realName", false, "REAL_NAME");
        public final static Property Avatar = new Property(7, String.class, "avatar", false, "AVATAR");
        public final static Property Phone = new Property(8, String.class, "phone", false, "PHONE");
        public final static Property Email = new Property(9, String.class, "email", false, "EMAIL");
        public final static Property Signature = new Property(10, String.class, "signature", false, "SIGNATURE");
        public final static Property DepartmentId = new Property(11, int.class, "departmentId", false, "DEPARTMENT_ID");
        public final static Property Status = new Property(12, int.class, "status", false, "STATUS");
        public final static Property Created = new Property(13, int.class, "created", false, "CREATED");
        public final static Property Updated = new Property(14, int.class, "updated", false, "UPDATED");
        public final static Property FansCnt = new Property(15, int.class, "fansCnt", false, "FANS_CNT");
    };


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'UserInfo' (" + //
                "'RELATION' TEXT," + // 0: relation
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 1: id
                "'PEER_ID' INTEGER NOT NULL UNIQUE ," + // 2: peerId
                "'GENDER' INTEGER NOT NULL ," + // 3: gender
                "'MAIN_NAME' TEXT NOT NULL ," + // 4: mainName
                "'PINYIN_NAME' TEXT NOT NULL ," + // 5: pinyinName
                "'REAL_NAME' TEXT NOT NULL ," + // 6: realName
                "'AVATAR' TEXT NOT NULL ," + // 7: avatar
                "'PHONE' TEXT NOT NULL ," + // 8: phone
                "'EMAIL' TEXT NOT NULL ," + // 9: email
                "'SIGNATURE' TEXT," + // 10: signature
                "'DEPARTMENT_ID' INTEGER NOT NULL ," + // 11: departmentId
                "'STATUS' INTEGER NOT NULL ," + // 12: status
                "'CREATED' INTEGER NOT NULL ," + // 13: created
                "'UPDATED' INTEGER NOT NULL ," + // 14: updated
                "'FANS_CNT' INTEGER NOT NULL );"); // 15: fansCnt
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_UserInfo_PEER_ID ON UserInfo" +
                " (PEER_ID);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'UserInfo'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UserEntity entity) {
        stmt.clearBindings();
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(1, relation);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
        stmt.bindLong(3, entity.getPeerId());
        stmt.bindLong(4, entity.getGender());
        stmt.bindString(5, entity.getMainName());
        stmt.bindString(6, entity.getPinyinName());
        stmt.bindString(7, entity.getRealName());
        stmt.bindString(8, entity.getAvatar());
        stmt.bindString(9, entity.getPhone());
        stmt.bindString(10, entity.getEmail());
 
        String signature = entity.getSignature();
        if (signature != null) {
            stmt.bindString(11, signature);
        }
        stmt.bindLong(12, entity.getDepartmentId());
        stmt.bindLong(13, entity.getStatus());
        stmt.bindLong(14, entity.getCreated());
        stmt.bindLong(15, entity.getUpdated());
        stmt.bindLong(16, entity.getFansCnt());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1);
    }    

    /** @inheritdoc */
    @Override
    public UserEntity readEntity(Cursor cursor, int offset) {
        UserEntity entity = new UserEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // relation
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // id
            cursor.getInt(offset + 2), // peerId
            cursor.getInt(offset + 3), // gender
            cursor.getString(offset + 4), // mainName
            cursor.getString(offset + 5), // pinyinName
            cursor.getString(offset + 6), // realName
            cursor.getString(offset + 7), // avatar
            cursor.getString(offset + 8), // phone
            cursor.getString(offset + 9), // email
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // signature
            cursor.getInt(offset + 11), // departmentId
            cursor.getInt(offset + 12), // status
            cursor.getInt(offset + 13), // created
            cursor.getInt(offset + 14), // updated
            cursor.getInt(offset + 15) // fansCnt
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UserEntity entity, int offset) {
        entity.setRelation(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPeerId(cursor.getInt(offset + 2));
        entity.setGender(cursor.getInt(offset + 3));
        entity.setMainName(cursor.getString(offset + 4));
        entity.setPinyinName(cursor.getString(offset + 5));
        entity.setRealName(cursor.getString(offset + 6));
        entity.setAvatar(cursor.getString(offset + 7));
        entity.setPhone(cursor.getString(offset + 8));
        entity.setEmail(cursor.getString(offset + 9));
        entity.setSignature(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setDepartmentId(cursor.getInt(offset + 11));
        entity.setStatus(cursor.getInt(offset + 12));
        entity.setCreated(cursor.getInt(offset + 13));
        entity.setUpdated(cursor.getInt(offset + 14));
        entity.setFansCnt(cursor.getInt(offset + 15));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UserEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UserEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
