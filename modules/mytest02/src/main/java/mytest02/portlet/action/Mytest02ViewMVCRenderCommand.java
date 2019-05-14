package mytest02.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import mytest02.constants.Mytest02PortletKeys;
import org.osgi.service.component.annotations.Component;

/**
 * @author dsanz
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + Mytest02PortletKeys.Mytest02,
		"mvc.command.name=ViewMyTwo",
		"mvc.command.name=/"
	},
	service = MVCRenderCommand.class
)
public class Mytest02ViewMVCRenderCommand
	implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		Template template = (Template)renderRequest.getAttribute(
			WebKeys.TEMPLATE);

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		template.put("layouts", themeDisplay.getLayouts());

		PortletURL navigationURL = renderResponse.createRenderURL();

		navigationURL.setParameter("mvcRenderCommandName", "NavigationMyTwo");

		template.put("navigationURL", navigationURL.toString());

		template.put("releaseInfo", ReleaseInfo.getReleaseInfo());

		return "ViewMyTwo";
	}

}