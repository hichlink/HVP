package com.hichlink.hvp.admin.modules.mgmt.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.aspire.webbas.client.AuthStaffUtil;
import com.aspire.webbas.portal.common.entity.Department;
import com.aspire.webbas.portal.common.entity.Staff;

public class StaffUtil {

	/**
	 * 获取当前登录用户信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Staff getLoginStaff(HttpServletRequest request) throws Exception {
		Staff staff = AuthStaffUtil.getLoginStaff(request);
		if (null == staff) {
			throw new Exception("用户未登录");
		}
		return staff;
	}

	/**
	 * 获取当前登录用户loginName
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getLoginName(HttpServletRequest request) throws Exception {
		Staff staff = getLoginStaff(request);
		if (null == staff)
			return null;
		return staff.getLoginName();
	}

	/**
	 * 获取当前登录用户staffId
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getStaffId(HttpServletRequest request) throws Exception {
		Staff staff = getLoginStaff(request);
		if (null == staff)
			return null;
		return "" + staff.getStaffId();
	}

	/**
	 * 是否为管理员
	 * 
	 * @return true 是 false 否
	 *         如果staff.getDepartment()为空为管理员，或staff.getDepartment(
	 *         ).getDomain()为SYS_ADMIN为管理员
	 * @throws Exception
	 */
	public static boolean isAdmin(HttpServletRequest request) throws Exception {
		Staff staff = getLoginStaff(request);
		if (null == staff) {
			return false;
		}
		Department department = staff.getDepartment();
		if (null == department) {
			return true;
		}
		String domain = department.getDomain();
		if (null != domain && ("SYS_ADMIN").equals(domain)) {
			return true;
		}
		return false;
	}

}
