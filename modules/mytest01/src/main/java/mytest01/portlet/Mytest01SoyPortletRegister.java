package mytest01.portlet;

import mytest01.constants.Mytest01PortletKeys;

import com.liferay.portal.portlet.bridge.soy.SoyPortletRegister;

import java.io.IOException;

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
		"javax.portlet.display-name=mytest01 Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=View",
		"javax.portlet.name=" + Mytest01PortletKeys.Mytest01,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service=SoyPortletRegister.class
)
public class Mytest01SoyPortletRegister implements SoyPortletRegister {
}