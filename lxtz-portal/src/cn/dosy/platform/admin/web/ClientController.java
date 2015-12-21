package cn.dosy.platform.admin.web;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Consumption;
import cn.dosy.platform.customer.service.IConsumptionManager;

@Controller
@RequestMapping(value = "/admin/client")
@SessionAttributes({"auditConsumption"})
public class ClientController extends BaseController<Auditable> {

	@Resource(name = "consumptionManager")
	protected IConsumptionManager consumptionManager;

	@RequestMapping(value = "consumption")
	public String consumption(Model model, Consumption consumption,
			final SessionStatus status, Page<Consumption> pageRequest) {

		status.setComplete();
		pageRequest.setVo(consumption);
		Page<Consumption> page = consumptionManager.query(pageRequest);
		model.addAttribute("page", page);

		return getRelativePath("/list_consumption");
	}

	@RequestMapping(value = "consumption/view/{id}", method = RequestMethod.GET)
	public String view_consumption(@PathVariable(value = "id") String id,
			final SessionStatus status, Model model) {
		status.setComplete();
		Consumption consumption = consumptionManager.findById(id);
		model.addAttribute("consumption", consumption);
		return getRelativePath("/view_consumption");
	}
	
	@RequestMapping(value = "consumption/audit/{id}", method = RequestMethod.GET)
	public String audit_consumption(@PathVariable(value = "id") String id, Model model) {
		Consumption consumption = consumptionManager.findById(id);
		model.addAttribute("auditConsumption", consumption);
		return getRelativePath("/audit_consumption");
	}
	
	@RequestMapping(value = "consumption/audit", method = RequestMethod.POST)
	public String audit_consumption(Boolean agree, String comment, HttpServletRequest request) {
		Consumption consumption = (Consumption)request.getSession().getAttribute("auditConsumption");
		
		consumption.setAgree(agree);
		consumption.setComment(comment);
		consumption.setBizTime(new Date());
		
		consumptionManager.update(consumption);
		return CONTROLLER_REDIRECT + "/admin/client/consumption/view/" + consumption.getId();
	}
}
