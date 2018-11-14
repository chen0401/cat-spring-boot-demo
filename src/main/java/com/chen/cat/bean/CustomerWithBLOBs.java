package com.chen.cat.bean;

import java.io.Serializable;

public class CustomerWithBLOBs extends Customer implements Serializable {
    private String corpConfig;

    private String config;

    private String qrurl;

    private String disclaimer;

    private String authCodeUrl;

    private String campuscardBgdImgNew;

    private String filterStr;

    private String memoEx;

    private String corpType;

    private String corpValue;

    private String configText;

    private String clientConfig;

    private String pointsConfig;

    private String ipConfig;

    private String remark;

    private String weixinServiceConfig;

    private static final long serialVersionUID = 1L;

    public String getCorpConfig() {
        return corpConfig;
    }

    public void setCorpConfig(String corpConfig) {
        this.corpConfig = corpConfig == null ? null : corpConfig.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getQrurl() {
        return qrurl;
    }

    public void setQrurl(String qrurl) {
        this.qrurl = qrurl == null ? null : qrurl.trim();
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer == null ? null : disclaimer.trim();
    }

    public String getAuthCodeUrl() {
        return authCodeUrl;
    }

    public void setAuthCodeUrl(String authCodeUrl) {
        this.authCodeUrl = authCodeUrl == null ? null : authCodeUrl.trim();
    }

    public String getCampuscardBgdImgNew() {
        return campuscardBgdImgNew;
    }

    public void setCampuscardBgdImgNew(String campuscardBgdImgNew) {
        this.campuscardBgdImgNew = campuscardBgdImgNew == null ? null : campuscardBgdImgNew.trim();
    }

    public String getFilterStr() {
        return filterStr;
    }

    public void setFilterStr(String filterStr) {
        this.filterStr = filterStr == null ? null : filterStr.trim();
    }

    public String getMemoEx() {
        return memoEx;
    }

    public void setMemoEx(String memoEx) {
        this.memoEx = memoEx == null ? null : memoEx.trim();
    }

    public String getCorpType() {
        return corpType;
    }

    public void setCorpType(String corpType) {
        this.corpType = corpType == null ? null : corpType.trim();
    }

    public String getCorpValue() {
        return corpValue;
    }

    public void setCorpValue(String corpValue) {
        this.corpValue = corpValue == null ? null : corpValue.trim();
    }

    public String getConfigText() {
        return configText;
    }

    public void setConfigText(String configText) {
        this.configText = configText == null ? null : configText.trim();
    }

    public String getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(String clientConfig) {
        this.clientConfig = clientConfig == null ? null : clientConfig.trim();
    }

    public String getPointsConfig() {
        return pointsConfig;
    }

    public void setPointsConfig(String pointsConfig) {
        this.pointsConfig = pointsConfig == null ? null : pointsConfig.trim();
    }

    public String getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(String ipConfig) {
        this.ipConfig = ipConfig == null ? null : ipConfig.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getWeixinServiceConfig() {
        return weixinServiceConfig;
    }

    public void setWeixinServiceConfig(String weixinServiceConfig) {
        this.weixinServiceConfig = weixinServiceConfig == null ? null : weixinServiceConfig.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustomerWithBLOBs other = (CustomerWithBLOBs) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCorpSyncSecret() == null ? other.getCorpSyncSecret() == null : this.getCorpSyncSecret().equals(other.getCorpSyncSecret()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getDomain() == null ? other.getDomain() == null : this.getDomain().equals(other.getDomain()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUserNumber() == null ? other.getUserNumber() == null : this.getUserNumber().equals(other.getUserNumber()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCustomerRoot() == null ? other.getCustomerRoot() == null : this.getCustomerRoot().equals(other.getCustomerRoot()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getOffsetMapY() == null ? other.getOffsetMapY() == null : this.getOffsetMapY().equals(other.getOffsetMapY()))
            && (this.getOffsetMapX() == null ? other.getOffsetMapX() == null : this.getOffsetMapX().equals(other.getOffsetMapX()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getServerNumber() == null ? other.getServerNumber() == null : this.getServerNumber().equals(other.getServerNumber()))
            && (this.getExportIps() == null ? other.getExportIps() == null : this.getExportIps().equals(other.getExportIps()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getUrlCrashUpload() == null ? other.getUrlCrashUpload() == null : this.getUrlCrashUpload().equals(other.getUrlCrashUpload()))
            && (this.getUrlDownload() == null ? other.getUrlDownload() == null : this.getUrlDownload().equals(other.getUrlDownload()))
            && (this.getUrlMainServer() == null ? other.getUrlMainServer() == null : this.getUrlMainServer().equals(other.getUrlMainServer()))
            && (this.getUrlUpload() == null ? other.getUrlUpload() == null : this.getUrlUpload().equals(other.getUrlUpload()))
            && (this.getClientNumber() == null ? other.getClientNumber() == null : this.getClientNumber().equals(other.getClientNumber()))
            && (this.getAndUmengAppKey() == null ? other.getAndUmengAppKey() == null : this.getAndUmengAppKey().equals(other.getAndUmengAppKey()))
            && (this.getAndUmengAppSecret() == null ? other.getAndUmengAppSecret() == null : this.getAndUmengAppSecret().equals(other.getAndUmengAppSecret()))
            && (this.getAndUmengMasterSecret() == null ? other.getAndUmengMasterSecret() == null : this.getAndUmengMasterSecret().equals(other.getAndUmengMasterSecret()))
            && (this.getIosUmengAppKey() == null ? other.getIosUmengAppKey() == null : this.getIosUmengAppKey().equals(other.getIosUmengAppKey()))
            && (this.getIosUmengAppSecret() == null ? other.getIosUmengAppSecret() == null : this.getIosUmengAppSecret().equals(other.getIosUmengAppSecret()))
            && (this.getIosUmengMasterSecret() == null ? other.getIosUmengMasterSecret() == null : this.getIosUmengMasterSecret().equals(other.getIosUmengMasterSecret()))
            && (this.getConfigUpdateTime() == null ? other.getConfigUpdateTime() == null : this.getConfigUpdateTime().equals(other.getConfigUpdateTime()))
            && (this.getLdap() == null ? other.getLdap() == null : this.getLdap().equals(other.getLdap()))
            && (this.getHaveldapFlag() == null ? other.getHaveldapFlag() == null : this.getHaveldapFlag().equals(other.getHaveldapFlag()))
            && (this.getLdapserver() == null ? other.getLdapserver() == null : this.getLdapserver().equals(other.getLdapserver()))
            && (this.getIconUrl() == null ? other.getIconUrl() == null : this.getIconUrl().equals(other.getIconUrl()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getMiddServer() == null ? other.getMiddServer() == null : this.getMiddServer().equals(other.getMiddServer()))
            && (this.getUrlMainSerForMs() == null ? other.getUrlMainSerForMs() == null : this.getUrlMainSerForMs().equals(other.getUrlMainSerForMs()))
            && (this.getOauth() == null ? other.getOauth() == null : this.getOauth().equals(other.getOauth()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getApiServer() == null ? other.getApiServer() == null : this.getApiServer().equals(other.getApiServer()))
            && (this.getDataMiddServer() == null ? other.getDataMiddServer() == null : this.getDataMiddServer().equals(other.getDataMiddServer()))
            && (this.getGetuiAppId() == null ? other.getGetuiAppId() == null : this.getGetuiAppId().equals(other.getGetuiAppId()))
            && (this.getGetuiAppKey() == null ? other.getGetuiAppKey() == null : this.getGetuiAppKey().equals(other.getGetuiAppKey()))
            && (this.getGetuiMasterSecret() == null ? other.getGetuiMasterSecret() == null : this.getGetuiMasterSecret().equals(other.getGetuiMasterSecret()))
            && (this.getSearchPinyin() == null ? other.getSearchPinyin() == null : this.getSearchPinyin().equals(other.getSearchPinyin()))
            && (this.getSchoolNum() == null ? other.getSchoolNum() == null : this.getSchoolNum().equals(other.getSchoolNum()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getCorpsecret() == null ? other.getCorpsecret() == null : this.getCorpsecret().equals(other.getCorpsecret()))
            && (this.getAgentid() == null ? other.getAgentid() == null : this.getAgentid().equals(other.getAgentid()))
            && (this.getQqid() == null ? other.getQqid() == null : this.getQqid().equals(other.getQqid()))
            && (this.getQqsecret() == null ? other.getQqsecret() == null : this.getQqsecret().equals(other.getQqsecret()))
            && (this.getCampuscardBgdImg() == null ? other.getCampuscardBgdImg() == null : this.getCampuscardBgdImg().equals(other.getCampuscardBgdImg()))
            && (this.getDisclaimerFlag() == null ? other.getDisclaimerFlag() == null : this.getDisclaimerFlag().equals(other.getDisclaimerFlag()))
            && (this.getIsScores() == null ? other.getIsScores() == null : this.getIsScores().equals(other.getIsScores()))
            && (this.getIsProbation() == null ? other.getIsProbation() == null : this.getIsProbation().equals(other.getIsProbation()))
            && (this.getExField() == null ? other.getExField() == null : this.getExField().equals(other.getExField()))
            && (this.getCustomized() == null ? other.getCustomized() == null : this.getCustomized().equals(other.getCustomized()))
            && (this.getPasswordUrl() == null ? other.getPasswordUrl() == null : this.getPasswordUrl().equals(other.getPasswordUrl()))
            && (this.getPwdResetUrl() == null ? other.getPwdResetUrl() == null : this.getPwdResetUrl().equals(other.getPwdResetUrl()))
            && (this.getSupplementDocUrl() == null ? other.getSupplementDocUrl() == null : this.getSupplementDocUrl().equals(other.getSupplementDocUrl()))
            && (this.getIdentityPhotoUrl() == null ? other.getIdentityPhotoUrl() == null : this.getIdentityPhotoUrl().equals(other.getIdentityPhotoUrl()))
            && (this.getAppConfig() == null ? other.getAppConfig() == null : this.getAppConfig().equals(other.getAppConfig()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getSmsStatus() == null ? other.getSmsStatus() == null : this.getSmsStatus().equals(other.getSmsStatus()))
            && (this.getXiaomiAppId() == null ? other.getXiaomiAppId() == null : this.getXiaomiAppId().equals(other.getXiaomiAppId()))
            && (this.getXiaomiAppSecret() == null ? other.getXiaomiAppSecret() == null : this.getXiaomiAppSecret().equals(other.getXiaomiAppSecret()))
            && (this.getHuaweiAppId() == null ? other.getHuaweiAppId() == null : this.getHuaweiAppId().equals(other.getHuaweiAppId()))
            && (this.getHuaweiAppSecret() == null ? other.getHuaweiAppSecret() == null : this.getHuaweiAppSecret().equals(other.getHuaweiAppSecret()))
            && (this.getMeizuAppId() == null ? other.getMeizuAppId() == null : this.getMeizuAppId().equals(other.getMeizuAppId()))
            && (this.getMeizuAppSecret() == null ? other.getMeizuAppSecret() == null : this.getMeizuAppSecret().equals(other.getMeizuAppSecret()))
            && (this.getNetworkStatus() == null ? other.getNetworkStatus() == null : this.getNetworkStatus().equals(other.getNetworkStatus()))
            && (this.getAddressBook() == null ? other.getAddressBook() == null : this.getAddressBook().equals(other.getAddressBook()))
            && (this.getCorpConfig() == null ? other.getCorpConfig() == null : this.getCorpConfig().equals(other.getCorpConfig()))
            && (this.getConfig() == null ? other.getConfig() == null : this.getConfig().equals(other.getConfig()))
            && (this.getQrurl() == null ? other.getQrurl() == null : this.getQrurl().equals(other.getQrurl()))
            && (this.getDisclaimer() == null ? other.getDisclaimer() == null : this.getDisclaimer().equals(other.getDisclaimer()))
            && (this.getAuthCodeUrl() == null ? other.getAuthCodeUrl() == null : this.getAuthCodeUrl().equals(other.getAuthCodeUrl()))
            && (this.getCampuscardBgdImgNew() == null ? other.getCampuscardBgdImgNew() == null : this.getCampuscardBgdImgNew().equals(other.getCampuscardBgdImgNew()))
            && (this.getFilterStr() == null ? other.getFilterStr() == null : this.getFilterStr().equals(other.getFilterStr()))
            && (this.getMemoEx() == null ? other.getMemoEx() == null : this.getMemoEx().equals(other.getMemoEx()))
            && (this.getCorpType() == null ? other.getCorpType() == null : this.getCorpType().equals(other.getCorpType()))
            && (this.getCorpValue() == null ? other.getCorpValue() == null : this.getCorpValue().equals(other.getCorpValue()))
            && (this.getConfigText() == null ? other.getConfigText() == null : this.getConfigText().equals(other.getConfigText()))
            && (this.getClientConfig() == null ? other.getClientConfig() == null : this.getClientConfig().equals(other.getClientConfig()))
            && (this.getPointsConfig() == null ? other.getPointsConfig() == null : this.getPointsConfig().equals(other.getPointsConfig()))
            && (this.getIpConfig() == null ? other.getIpConfig() == null : this.getIpConfig().equals(other.getIpConfig()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getWeixinServiceConfig() == null ? other.getWeixinServiceConfig() == null : this.getWeixinServiceConfig().equals(other.getWeixinServiceConfig()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCorpSyncSecret() == null) ? 0 : getCorpSyncSecret().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getDomain() == null) ? 0 : getDomain().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUserNumber() == null) ? 0 : getUserNumber().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCustomerRoot() == null) ? 0 : getCustomerRoot().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getOffsetMapY() == null) ? 0 : getOffsetMapY().hashCode());
        result = prime * result + ((getOffsetMapX() == null) ? 0 : getOffsetMapX().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getServerNumber() == null) ? 0 : getServerNumber().hashCode());
        result = prime * result + ((getExportIps() == null) ? 0 : getExportIps().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getUrlCrashUpload() == null) ? 0 : getUrlCrashUpload().hashCode());
        result = prime * result + ((getUrlDownload() == null) ? 0 : getUrlDownload().hashCode());
        result = prime * result + ((getUrlMainServer() == null) ? 0 : getUrlMainServer().hashCode());
        result = prime * result + ((getUrlUpload() == null) ? 0 : getUrlUpload().hashCode());
        result = prime * result + ((getClientNumber() == null) ? 0 : getClientNumber().hashCode());
        result = prime * result + ((getAndUmengAppKey() == null) ? 0 : getAndUmengAppKey().hashCode());
        result = prime * result + ((getAndUmengAppSecret() == null) ? 0 : getAndUmengAppSecret().hashCode());
        result = prime * result + ((getAndUmengMasterSecret() == null) ? 0 : getAndUmengMasterSecret().hashCode());
        result = prime * result + ((getIosUmengAppKey() == null) ? 0 : getIosUmengAppKey().hashCode());
        result = prime * result + ((getIosUmengAppSecret() == null) ? 0 : getIosUmengAppSecret().hashCode());
        result = prime * result + ((getIosUmengMasterSecret() == null) ? 0 : getIosUmengMasterSecret().hashCode());
        result = prime * result + ((getConfigUpdateTime() == null) ? 0 : getConfigUpdateTime().hashCode());
        result = prime * result + ((getLdap() == null) ? 0 : getLdap().hashCode());
        result = prime * result + ((getHaveldapFlag() == null) ? 0 : getHaveldapFlag().hashCode());
        result = prime * result + ((getLdapserver() == null) ? 0 : getLdapserver().hashCode());
        result = prime * result + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getMiddServer() == null) ? 0 : getMiddServer().hashCode());
        result = prime * result + ((getUrlMainSerForMs() == null) ? 0 : getUrlMainSerForMs().hashCode());
        result = prime * result + ((getOauth() == null) ? 0 : getOauth().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getApiServer() == null) ? 0 : getApiServer().hashCode());
        result = prime * result + ((getDataMiddServer() == null) ? 0 : getDataMiddServer().hashCode());
        result = prime * result + ((getGetuiAppId() == null) ? 0 : getGetuiAppId().hashCode());
        result = prime * result + ((getGetuiAppKey() == null) ? 0 : getGetuiAppKey().hashCode());
        result = prime * result + ((getGetuiMasterSecret() == null) ? 0 : getGetuiMasterSecret().hashCode());
        result = prime * result + ((getSearchPinyin() == null) ? 0 : getSearchPinyin().hashCode());
        result = prime * result + ((getSchoolNum() == null) ? 0 : getSchoolNum().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getCorpsecret() == null) ? 0 : getCorpsecret().hashCode());
        result = prime * result + ((getAgentid() == null) ? 0 : getAgentid().hashCode());
        result = prime * result + ((getQqid() == null) ? 0 : getQqid().hashCode());
        result = prime * result + ((getQqsecret() == null) ? 0 : getQqsecret().hashCode());
        result = prime * result + ((getCampuscardBgdImg() == null) ? 0 : getCampuscardBgdImg().hashCode());
        result = prime * result + ((getDisclaimerFlag() == null) ? 0 : getDisclaimerFlag().hashCode());
        result = prime * result + ((getIsScores() == null) ? 0 : getIsScores().hashCode());
        result = prime * result + ((getIsProbation() == null) ? 0 : getIsProbation().hashCode());
        result = prime * result + ((getExField() == null) ? 0 : getExField().hashCode());
        result = prime * result + ((getCustomized() == null) ? 0 : getCustomized().hashCode());
        result = prime * result + ((getPasswordUrl() == null) ? 0 : getPasswordUrl().hashCode());
        result = prime * result + ((getPwdResetUrl() == null) ? 0 : getPwdResetUrl().hashCode());
        result = prime * result + ((getSupplementDocUrl() == null) ? 0 : getSupplementDocUrl().hashCode());
        result = prime * result + ((getIdentityPhotoUrl() == null) ? 0 : getIdentityPhotoUrl().hashCode());
        result = prime * result + ((getAppConfig() == null) ? 0 : getAppConfig().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getSmsStatus() == null) ? 0 : getSmsStatus().hashCode());
        result = prime * result + ((getXiaomiAppId() == null) ? 0 : getXiaomiAppId().hashCode());
        result = prime * result + ((getXiaomiAppSecret() == null) ? 0 : getXiaomiAppSecret().hashCode());
        result = prime * result + ((getHuaweiAppId() == null) ? 0 : getHuaweiAppId().hashCode());
        result = prime * result + ((getHuaweiAppSecret() == null) ? 0 : getHuaweiAppSecret().hashCode());
        result = prime * result + ((getMeizuAppId() == null) ? 0 : getMeizuAppId().hashCode());
        result = prime * result + ((getMeizuAppSecret() == null) ? 0 : getMeizuAppSecret().hashCode());
        result = prime * result + ((getNetworkStatus() == null) ? 0 : getNetworkStatus().hashCode());
        result = prime * result + ((getAddressBook() == null) ? 0 : getAddressBook().hashCode());
        result = prime * result + ((getCorpConfig() == null) ? 0 : getCorpConfig().hashCode());
        result = prime * result + ((getConfig() == null) ? 0 : getConfig().hashCode());
        result = prime * result + ((getQrurl() == null) ? 0 : getQrurl().hashCode());
        result = prime * result + ((getDisclaimer() == null) ? 0 : getDisclaimer().hashCode());
        result = prime * result + ((getAuthCodeUrl() == null) ? 0 : getAuthCodeUrl().hashCode());
        result = prime * result + ((getCampuscardBgdImgNew() == null) ? 0 : getCampuscardBgdImgNew().hashCode());
        result = prime * result + ((getFilterStr() == null) ? 0 : getFilterStr().hashCode());
        result = prime * result + ((getMemoEx() == null) ? 0 : getMemoEx().hashCode());
        result = prime * result + ((getCorpType() == null) ? 0 : getCorpType().hashCode());
        result = prime * result + ((getCorpValue() == null) ? 0 : getCorpValue().hashCode());
        result = prime * result + ((getConfigText() == null) ? 0 : getConfigText().hashCode());
        result = prime * result + ((getClientConfig() == null) ? 0 : getClientConfig().hashCode());
        result = prime * result + ((getPointsConfig() == null) ? 0 : getPointsConfig().hashCode());
        result = prime * result + ((getIpConfig() == null) ? 0 : getIpConfig().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getWeixinServiceConfig() == null) ? 0 : getWeixinServiceConfig().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", corpConfig=").append(corpConfig);
        sb.append(", config=").append(config);
        sb.append(", qrurl=").append(qrurl);
        sb.append(", disclaimer=").append(disclaimer);
        sb.append(", authCodeUrl=").append(authCodeUrl);
        sb.append(", campuscardBgdImgNew=").append(campuscardBgdImgNew);
        sb.append(", filterStr=").append(filterStr);
        sb.append(", memoEx=").append(memoEx);
        sb.append(", corpType=").append(corpType);
        sb.append(", corpValue=").append(corpValue);
        sb.append(", configText=").append(configText);
        sb.append(", clientConfig=").append(clientConfig);
        sb.append(", pointsConfig=").append(pointsConfig);
        sb.append(", ipConfig=").append(ipConfig);
        sb.append(", remark=").append(remark);
        sb.append(", weixinServiceConfig=").append(weixinServiceConfig);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}