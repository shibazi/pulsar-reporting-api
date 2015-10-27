/*******************************************************************************
*  Copyright © 2012-2015 eBay Software Foundation
*  This program is dual licensed under the MIT and Apache 2.0 licenses.
*  Please see LICENSE for more information.
*******************************************************************************/
package com.ebay.pulsar.analytics.auth;

import java.util.Map;

/**
 * After login, client will get the user information like userName, token generated by server side which will be 
 * used for request other resources for this user.
 * Other informations like image, email, department, etc will be store in ext with key/value pair.
 * Once client get the object, it could get the informations what it wants.
 * 
 *@author qxing
 * 
 **/
public class UserInfo {
		private String userName;
		private String token;
		private boolean loginSuccess;
		private boolean enabled;
		private boolean enableAuthentication;
		private boolean enableAuthorization;
		private Map<String,Object> ext;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public Map<String, Object> getExt() {
			return ext;
		}
		public void setExt(Map<String, Object> ext) {
			this.ext = ext;
		}
		
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		public boolean isEnableAuthentication() {
			return enableAuthentication;
		}
		public void setEnableAuthentication(boolean enableAuthentication) {
			this.enableAuthentication = enableAuthentication;
		}
		public boolean isEnableAuthorization() {
			return enableAuthorization;
		}
		public void setEnableAuthorization(boolean enableAuthorization) {
			this.enableAuthorization = enableAuthorization;
		}
		public boolean isLoginSuccess() {
			return loginSuccess;
		}
		public void setLoginSuccess(boolean loginSuccess) {
			this.loginSuccess = loginSuccess;
		}
		
}