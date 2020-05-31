package com.supers.basic.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.supers.basic.domain.base.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@TableName("basic_pressure_test")
public class BasicPressureTest extends BaseEntity {
    private static final String FIELD_ID = "id";
    private static final String FIELD_ATTRIBUTE1 = "attribute1";
    private static final String FIELD_ATTRIBUTE2 = "attribute2";
    private static final String FIELD_ATTRIBUTE3 = "attribute3";
    private static final String FIELD_ATTRIBUTE4 = "attribute4";
    private static final String FIELD_ATTRIBUTE5 = "attribute5";
    private static final String FIELD_ATTRIBUTE6 = "attribute6";
    private static final String FIELD_ATTRIBUTE7 = "attribute7";
    private static final String FIELD_ATTRIBUTE8 = "attribute8";
    private static final String FIELD_ATTRIBUTE9 = "attribute9";
    private static final String FIELD_ATTRIBUTE10 = "attribute10";
    private static final String FIELD_ATTRIBUTE11 = "attribute11";
    private static final String FIELD_ATTRIBUTE12 = "attribute12";
    private static final String FIELD_ATTRIBUTE13 = "attribute13";
    private static final String FIELD_ATTRIBUTE14 = "attribute14";
    private static final String FIELD_ATTRIBUTE15 = "attribute15";

    @Id
    private Long id;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;
}
