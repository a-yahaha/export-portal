package com.aya.cloud.export.domain.config.model.file;

import com.aya.cloud.export.common.enums.CSVDelimiterEnum;
import com.aya.cloud.export.common.enums.FileCloudStoreEnum;
import com.aya.cloud.export.common.enums.FileExpireEnum;
import com.aya.cloud.export.common.enums.FileFormatEnum;
import com.aya.cloud.export.common.exception.ConfigErrorCode;
import com.aya.cloud.export.common.util.AssertUtils;
import com.aya.cloud.export.domain.config.model.FileRule;

import java.util.Objects;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName CsvFileRuleEntity
 * @description
 * @date created in 20:52 2023/8/12
 */
public class CsvFileRuleEntity implements FileRule {



    /**
     * csv的文件分割符
     * @see com.aya.cloud.export.common.enums.CSVDelimiterEnum
     */
    private Integer csvDelimiter;

    /**
     * 文件存储方式
     */
    private String cloudStore;

    /**
     * 文件过期类型
     */
    private String fileExpireType;

    /**
     * 文件过期的分钟
     */
    private Integer expireMinute;

    public CsvFileRuleEntity(Integer csvDelimiter, String cloudStore, String fileExpireType, Integer expireMinute) {
        this.csvDelimiter = csvDelimiter;
        this.cloudStore = cloudStore;
        this.fileExpireType = fileExpireType;
        this.expireMinute = expireMinute;

        validate();
    }

    @Override
    public FileFormatEnum getFileFormat() {
        return FileFormatEnum.CSV;
    }

    @Override
    public FileCloudStoreEnum getCloudStore() {
        return FileCloudStoreEnum.of(cloudStore);
    }

    @Override
    public FileExpireEnum getFileExpireType() {
        return FileExpireEnum.of(fileExpireType);
    }

    @Override
    public Integer getExpireMinute() {
        FileExpireEnum fileExpire = getFileExpireType();
        if (!getFileExpireType().isPermanent()) {
            return expireMinute;
        }
        return 0;
    }

    @Override
    public boolean validate() {
        AssertUtils.assertNotNull(CSVDelimiterEnum.of(csvDelimiter), ConfigErrorCode.CSV_DELIMITER_ERROR);
        AssertUtils.assertNotNull(getCloudStore(), ConfigErrorCode.CLOUD_STORE_ERROR);
        AssertUtils.assertNotNull(getFileExpireType(), ConfigErrorCode.FILE_EXPIRE_TYPE_ERROR);

        if (!getFileExpireType().isPermanent()) {
            AssertUtils.assertIntegerGTZero(expireMinute, ConfigErrorCode.FILE_EXPIRE_MINUTE_ERROR);
        }
        return false;
    }
}
