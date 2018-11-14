package com.chen.cat.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Customer implements Serializable {
    private Integer customerId;

    private String corpSyncSecret;

    private String customerName;

    private String domain;

    private String type;

    private Integer userNumber;

    private String province;

    private String city;

    private String customerRoot;

    private Date addTime;

    private BigDecimal offsetMapY;

    private BigDecimal offsetMapX;

    private Date modifyTime;

    private String serverNumber;

    private String exportIps;

    private String pinyin;

    private String urlCrashUpload;

    private String urlDownload;

    private String urlMainServer;

    private String urlUpload;

    private String clientNumber;

    private String andUmengAppKey;

    private String andUmengAppSecret;

    private String andUmengMasterSecret;

    private String iosUmengAppKey;

    private String iosUmengAppSecret;

    private String iosUmengMasterSecret;

    private Date configUpdateTime;

    private String ldap;

    private Integer haveldapFlag;

    private String ldapserver;

    private String iconUrl;

    private String describe;

    private String middServer;

    private String urlMainSerForMs;

    private String oauth;

    private String memo;

    private String apiServer;

    private String dataMiddServer;

    private String getuiAppId;

    private String getuiAppKey;

    private String getuiMasterSecret;

    private String searchPinyin;

    private String schoolNum;

    private String corpid;

    private String corpsecret;

    private Integer agentid;

    private String qqid;

    private String qqsecret;

    private String campuscardBgdImg;

    private Integer disclaimerFlag;

    private Integer isScores;

    private Integer isProbation;

    private String exField;

    private Integer customized;

    private String passwordUrl;

    private String pwdResetUrl;

    private String supplementDocUrl;

    private String identityPhotoUrl;

    private String appConfig;

    private String url;

    private Integer smsStatus;

    private String xiaomiAppId;

    private String xiaomiAppSecret;

    private String huaweiAppId;

    private String huaweiAppSecret;

    private String meizuAppId;

    private String meizuAppSecret;

    private Integer networkStatus;

    private String addressBook;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCorpSyncSecret() {
        return corpSyncSecret;
    }

    public void setCorpSyncSecret(String corpSyncSecret) {
        this.corpSyncSecret = corpSyncSecret == null ? null : corpSyncSecret.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCustomerRoot() {
        return customerRoot;
    }

    public void setCustomerRoot(String customerRoot) {
        this.customerRoot = customerRoot == null ? null : customerRoot.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public BigDecimal getOffsetMapY() {
        return offsetMapY;
    }

    public void setOffsetMapY(BigDecimal offsetMapY) {
        this.offsetMapY = offsetMapY;
    }

    public BigDecimal getOffsetMapX() {
        return offsetMapX;
    }

    public void setOffsetMapX(BigDecimal offsetMapX) {
        this.offsetMapX = offsetMapX;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getServerNumber() {
        return serverNumber;
    }

    public void setServerNumber(String serverNumber) {
        this.serverNumber = serverNumber == null ? null : serverNumber.trim();
    }

    public String getExportIps() {
        return exportIps;
    }

    public void setExportIps(String exportIps) {
        this.exportIps = exportIps == null ? null : exportIps.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getUrlCrashUpload() {
        return urlCrashUpload;
    }

    public void setUrlCrashUpload(String urlCrashUpload) {
        this.urlCrashUpload = urlCrashUpload == null ? null : urlCrashUpload.trim();
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload == null ? null : urlDownload.trim();
    }

    public String getUrlMainServer() {
        return urlMainServer;
    }

    public void setUrlMainServer(String urlMainServer) {
        this.urlMainServer = urlMainServer == null ? null : urlMainServer.trim();
    }

    public String getUrlUpload() {
        return urlUpload;
    }

    public void setUrlUpload(String urlUpload) {
        this.urlUpload = urlUpload == null ? null : urlUpload.trim();
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber == null ? null : clientNumber.trim();
    }

    public String getAndUmengAppKey() {
        return andUmengAppKey;
    }

    public void setAndUmengAppKey(String andUmengAppKey) {
        this.andUmengAppKey = andUmengAppKey == null ? null : andUmengAppKey.trim();
    }

    public String getAndUmengAppSecret() {
        return andUmengAppSecret;
    }

    public void setAndUmengAppSecret(String andUmengAppSecret) {
        this.andUmengAppSecret = andUmengAppSecret == null ? null : andUmengAppSecret.trim();
    }

    public String getAndUmengMasterSecret() {
        return andUmengMasterSecret;
    }

    public void setAndUmengMasterSecret(String andUmengMasterSecret) {
        this.andUmengMasterSecret = andUmengMasterSecret == null ? null : andUmengMasterSecret.trim();
    }

    public String getIosUmengAppKey() {
        return iosUmengAppKey;
    }

    public void setIosUmengAppKey(String iosUmengAppKey) {
        this.iosUmengAppKey = iosUmengAppKey == null ? null : iosUmengAppKey.trim();
    }

    public String getIosUmengAppSecret() {
        return iosUmengAppSecret;
    }

    public void setIosUmengAppSecret(String iosUmengAppSecret) {
        this.iosUmengAppSecret = iosUmengAppSecret == null ? null : iosUmengAppSecret.trim();
    }

    public String getIosUmengMasterSecret() {
        return iosUmengMasterSecret;
    }

    public void setIosUmengMasterSecret(String iosUmengMasterSecret) {
        this.iosUmengMasterSecret = iosUmengMasterSecret == null ? null : iosUmengMasterSecret.trim();
    }

    public Date getConfigUpdateTime() {
        return configUpdateTime;
    }

    public void setConfigUpdateTime(Date configUpdateTime) {
        this.configUpdateTime = configUpdateTime;
    }

    public String getLdap() {
        return ldap;
    }

    public void setLdap(String ldap) {
        this.ldap = ldap == null ? null : ldap.trim();
    }

    public Integer getHaveldapFlag() {
        return haveldapFlag;
    }

    public void setHaveldapFlag(Integer haveldapFlag) {
        this.haveldapFlag = haveldapFlag;
    }

    public String getLdapserver() {
        return ldapserver;
    }

    public void setLdapserver(String ldapserver) {
        this.ldapserver = ldapserver == null ? null : ldapserver.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getMiddServer() {
        return middServer;
    }

    public void setMiddServer(String middServer) {
        this.middServer = middServer == null ? null : middServer.trim();
    }

    public String getUrlMainSerForMs() {
        return urlMainSerForMs;
    }

    public void setUrlMainSerForMs(String urlMainSerForMs) {
        this.urlMainSerForMs = urlMainSerForMs == null ? null : urlMainSerForMs.trim();
    }

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth == null ? null : oauth.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getApiServer() {
        return apiServer;
    }

    public void setApiServer(String apiServer) {
        this.apiServer = apiServer == null ? null : apiServer.trim();
    }

    public String getDataMiddServer() {
        return dataMiddServer;
    }

    public void setDataMiddServer(String dataMiddServer) {
        this.dataMiddServer = dataMiddServer == null ? null : dataMiddServer.trim();
    }

    public String getGetuiAppId() {
        return getuiAppId;
    }

    public void setGetuiAppId(String getuiAppId) {
        this.getuiAppId = getuiAppId == null ? null : getuiAppId.trim();
    }

    public String getGetuiAppKey() {
        return getuiAppKey;
    }

    public void setGetuiAppKey(String getuiAppKey) {
        this.getuiAppKey = getuiAppKey == null ? null : getuiAppKey.trim();
    }

    public String getGetuiMasterSecret() {
        return getuiMasterSecret;
    }

    public void setGetuiMasterSecret(String getuiMasterSecret) {
        this.getuiMasterSecret = getuiMasterSecret == null ? null : getuiMasterSecret.trim();
    }

    public String getSearchPinyin() {
        return searchPinyin;
    }

    public void setSearchPinyin(String searchPinyin) {
        this.searchPinyin = searchPinyin == null ? null : searchPinyin.trim();
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum == null ? null : schoolNum.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getCorpsecret() {
        return corpsecret;
    }

    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret == null ? null : corpsecret.trim();
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public String getQqid() {
        return qqid;
    }

    public void setQqid(String qqid) {
        this.qqid = qqid == null ? null : qqid.trim();
    }

    public String getQqsecret() {
        return qqsecret;
    }

    public void setQqsecret(String qqsecret) {
        this.qqsecret = qqsecret == null ? null : qqsecret.trim();
    }

    public String getCampuscardBgdImg() {
        return campuscardBgdImg;
    }

    public void setCampuscardBgdImg(String campuscardBgdImg) {
        this.campuscardBgdImg = campuscardBgdImg == null ? null : campuscardBgdImg.trim();
    }

    public Integer getDisclaimerFlag() {
        return disclaimerFlag;
    }

    public void setDisclaimerFlag(Integer disclaimerFlag) {
        this.disclaimerFlag = disclaimerFlag;
    }

    public Integer getIsScores() {
        return isScores;
    }

    public void setIsScores(Integer isScores) {
        this.isScores = isScores;
    }

    public Integer getIsProbation() {
        return isProbation;
    }

    public void setIsProbation(Integer isProbation) {
        this.isProbation = isProbation;
    }

    public String getExField() {
        return exField;
    }

    public void setExField(String exField) {
        this.exField = exField == null ? null : exField.trim();
    }

    public Integer getCustomized() {
        return customized;
    }

    public void setCustomized(Integer customized) {
        this.customized = customized;
    }

    public String getPasswordUrl() {
        return passwordUrl;
    }

    public void setPasswordUrl(String passwordUrl) {
        this.passwordUrl = passwordUrl == null ? null : passwordUrl.trim();
    }

    public String getPwdResetUrl() {
        return pwdResetUrl;
    }

    public void setPwdResetUrl(String pwdResetUrl) {
        this.pwdResetUrl = pwdResetUrl == null ? null : pwdResetUrl.trim();
    }

    public String getSupplementDocUrl() {
        return supplementDocUrl;
    }

    public void setSupplementDocUrl(String supplementDocUrl) {
        this.supplementDocUrl = supplementDocUrl == null ? null : supplementDocUrl.trim();
    }

    public String getIdentityPhotoUrl() {
        return identityPhotoUrl;
    }

    public void setIdentityPhotoUrl(String identityPhotoUrl) {
        this.identityPhotoUrl = identityPhotoUrl == null ? null : identityPhotoUrl.trim();
    }

    public String getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(String appConfig) {
        this.appConfig = appConfig == null ? null : appConfig.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
    }

    public String getXiaomiAppId() {
        return xiaomiAppId;
    }

    public void setXiaomiAppId(String xiaomiAppId) {
        this.xiaomiAppId = xiaomiAppId == null ? null : xiaomiAppId.trim();
    }

    public String getXiaomiAppSecret() {
        return xiaomiAppSecret;
    }

    public void setXiaomiAppSecret(String xiaomiAppSecret) {
        this.xiaomiAppSecret = xiaomiAppSecret == null ? null : xiaomiAppSecret.trim();
    }

    public String getHuaweiAppId() {
        return huaweiAppId;
    }

    public void setHuaweiAppId(String huaweiAppId) {
        this.huaweiAppId = huaweiAppId == null ? null : huaweiAppId.trim();
    }

    public String getHuaweiAppSecret() {
        return huaweiAppSecret;
    }

    public void setHuaweiAppSecret(String huaweiAppSecret) {
        this.huaweiAppSecret = huaweiAppSecret == null ? null : huaweiAppSecret.trim();
    }

    public String getMeizuAppId() {
        return meizuAppId;
    }

    public void setMeizuAppId(String meizuAppId) {
        this.meizuAppId = meizuAppId == null ? null : meizuAppId.trim();
    }

    public String getMeizuAppSecret() {
        return meizuAppSecret;
    }

    public void setMeizuAppSecret(String meizuAppSecret) {
        this.meizuAppSecret = meizuAppSecret == null ? null : meizuAppSecret.trim();
    }

    public Integer getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(Integer networkStatus) {
        this.networkStatus = networkStatus;
    }

    public String getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(String addressBook) {
        this.addressBook = addressBook == null ? null : addressBook.trim();
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
        Customer other = (Customer) that;
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
            && (this.getAddressBook() == null ? other.getAddressBook() == null : this.getAddressBook().equals(other.getAddressBook()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", corpSyncSecret=").append(corpSyncSecret);
        sb.append(", customerName=").append(customerName);
        sb.append(", domain=").append(domain);
        sb.append(", type=").append(type);
        sb.append(", userNumber=").append(userNumber);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", customerRoot=").append(customerRoot);
        sb.append(", addTime=").append(addTime);
        sb.append(", offsetMapY=").append(offsetMapY);
        sb.append(", offsetMapX=").append(offsetMapX);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serverNumber=").append(serverNumber);
        sb.append(", exportIps=").append(exportIps);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", urlCrashUpload=").append(urlCrashUpload);
        sb.append(", urlDownload=").append(urlDownload);
        sb.append(", urlMainServer=").append(urlMainServer);
        sb.append(", urlUpload=").append(urlUpload);
        sb.append(", clientNumber=").append(clientNumber);
        sb.append(", andUmengAppKey=").append(andUmengAppKey);
        sb.append(", andUmengAppSecret=").append(andUmengAppSecret);
        sb.append(", andUmengMasterSecret=").append(andUmengMasterSecret);
        sb.append(", iosUmengAppKey=").append(iosUmengAppKey);
        sb.append(", iosUmengAppSecret=").append(iosUmengAppSecret);
        sb.append(", iosUmengMasterSecret=").append(iosUmengMasterSecret);
        sb.append(", configUpdateTime=").append(configUpdateTime);
        sb.append(", ldap=").append(ldap);
        sb.append(", haveldapFlag=").append(haveldapFlag);
        sb.append(", ldapserver=").append(ldapserver);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", describe=").append(describe);
        sb.append(", middServer=").append(middServer);
        sb.append(", urlMainSerForMs=").append(urlMainSerForMs);
        sb.append(", oauth=").append(oauth);
        sb.append(", memo=").append(memo);
        sb.append(", apiServer=").append(apiServer);
        sb.append(", dataMiddServer=").append(dataMiddServer);
        sb.append(", getuiAppId=").append(getuiAppId);
        sb.append(", getuiAppKey=").append(getuiAppKey);
        sb.append(", getuiMasterSecret=").append(getuiMasterSecret);
        sb.append(", searchPinyin=").append(searchPinyin);
        sb.append(", schoolNum=").append(schoolNum);
        sb.append(", corpid=").append(corpid);
        sb.append(", corpsecret=").append(corpsecret);
        sb.append(", agentid=").append(agentid);
        sb.append(", qqid=").append(qqid);
        sb.append(", qqsecret=").append(qqsecret);
        sb.append(", campuscardBgdImg=").append(campuscardBgdImg);
        sb.append(", disclaimerFlag=").append(disclaimerFlag);
        sb.append(", isScores=").append(isScores);
        sb.append(", isProbation=").append(isProbation);
        sb.append(", exField=").append(exField);
        sb.append(", customized=").append(customized);
        sb.append(", passwordUrl=").append(passwordUrl);
        sb.append(", pwdResetUrl=").append(pwdResetUrl);
        sb.append(", supplementDocUrl=").append(supplementDocUrl);
        sb.append(", identityPhotoUrl=").append(identityPhotoUrl);
        sb.append(", appConfig=").append(appConfig);
        sb.append(", url=").append(url);
        sb.append(", smsStatus=").append(smsStatus);
        sb.append(", xiaomiAppId=").append(xiaomiAppId);
        sb.append(", xiaomiAppSecret=").append(xiaomiAppSecret);
        sb.append(", huaweiAppId=").append(huaweiAppId);
        sb.append(", huaweiAppSecret=").append(huaweiAppSecret);
        sb.append(", meizuAppId=").append(meizuAppId);
        sb.append(", meizuAppSecret=").append(meizuAppSecret);
        sb.append(", networkStatus=").append(networkStatus);
        sb.append(", addressBook=").append(addressBook);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}