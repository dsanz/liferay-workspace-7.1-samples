package mytest02.portlet;

import mytest02.constants.Mytest02PortletKeys;

import com.liferay.portal.portlet.bridge.soy.SoyPortletRegister;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author dsanz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.single-page-application=false",
		"javax.portlet.display-name=mytest02 Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=ViewMyTwo",
		"javax.portlet.name=" + Mytest02PortletKeys.Mytest02,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service=SoyPortletRegister.class
)
public class Mytest02SoyPortletRegister implements SoyPortletRegister {
}