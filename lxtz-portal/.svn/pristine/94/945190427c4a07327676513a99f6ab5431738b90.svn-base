package cn.dosy.platform.admin.web;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Comment;
import cn.dosy.platform.customer.domain.Consumption;
import cn.dosy.platform.customer.domain.Merchant;
import cn.dosy.platform.customer.domain.Student;
import cn.dosy.platform.customer.service.ICommentManager;
import cn.dosy.platform.customer.service.IConsumptionManager;
import cn.dosy.platform.customer.service.IMerchantManager;
import cn.dosy.platform.customer.service.IStudentManager;
import cn.dosy.platform.security.domain.User;

@Controller
@RequestMapping(value = "/admin/user")
@SessionAttributes({"viewStudent"})
public class UserController extends BaseController<Auditable> {

	@Resource(name = "studentManager")
	protected IStudentManager studentManager;
	
	@Resource(name = "merchantManager")
	protected IMerchantManager merchantManager;
	
	@Resource(name = "commentManager")
	protected ICommentManager commentManager;
	
	@Resource(name = "consumptionManager")
	protected IConsumptionManager consumptionManager;
	

	@RequestMapping(value = "merchant")
	public String merchant(Model model, Merchant merchant, final SessionStatus status, Page<Merchant> pageRequest) {
		status.setComplete();
		if (merchant == null) {
			merchant = new Merchant();
		}
		pageRequest.setVo(merchant);
		Page<Merchant> page = merchantManager.query(pageRequest);
		model.addAttribute("page", page);
		
		return getRelativePath("/list_merchant");
	}

	
	@RequestMapping(value = "merchant/view/{id}", method = RequestMethod.GET)
	public String view_merchant(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant) request.getSession().getAttribute(
				"viewMerchant");

		if (merchant == null) {
			merchant = merchantManager.findById(id);
		}

		model.addAttribute("viewMerchant", merchant);
		return getRelativePath("/view_merchant");
	}
	
	
	@RequestMapping(value = "student")
	public String student(Model model, Student student,
			final SessionStatus status, Page<Student> pageRequest) {
		status.setComplete();

		if (student == null) {
			student = new Student();
		}
		pageRequest.setVo(student);
		Page<Student> page = studentManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_student");
	}

	@RequestMapping(value = "student/setForbidden/{id}", method = RequestMethod.GET)
	public String setForbidden_student(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Student entity = studentManager.findById(id);
		if (entity != null) {
			if (entity.getForbidden() != null && entity.getForbidden()) {
				entity.setForbidden(false);
			} else {
				entity.setForbidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			studentManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/user/student";
	}

	@RequestMapping(value = "student/view1/{id}", method = RequestMethod.GET)
	public String view_student1(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}
		
		if (!"person_male.gif".equalsIgnoreCase(student.getIconsName())) {
			try {
				String resourcePath = ApplicationContext.getApplicationPath();
				FileUtils.SaveFileFromInputStream(new ByteArrayInputStream(student.getIconsPicture()),
						resourcePath + "/resources/img/portal/icons", student.getIconsName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		model.addAttribute("viewStudent", student);
		return getRelativePath("/view_student1");
	}

	@RequestMapping(value = "student/view2/{id}", method = RequestMethod.GET)
	public String view_student2(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}

		model.addAttribute("viewStudent", student);
		return getRelativePath("/view_student2");
	}

	@RequestMapping(value = "student/view3/{id}", method = RequestMethod.GET)
	public String view_student3(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}

		model.addAttribute("viewStudent", student);
		return getRelativePath("/view_student3");
	}

	@RequestMapping(value = "student/view4/{id}", method = RequestMethod.GET)
	public String view_student4(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}
		
		Consumption query = new Consumption();
		query.setStudentId(student.getId());
		List<Consumption> list = consumptionManager.query(query);
		
		model.addAttribute("list", list);

		model.addAttribute("viewStudent", student);
		return getRelativePath("/view_student4");
	}

	@RequestMapping(value = "student/view5/{id}", method = RequestMethod.GET)
	public String view_student5(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}
		
		Comment query = new Comment();
		query.setIsCancle(null);
		query.setForbidden(null);
		query.setStudent(student);
		List<Comment> list = commentManager.query(query);

		model.addAttribute("list", list);

		model.addAttribute("viewStudent", student);
		return getRelativePath("/view_student5");
	}
	
	@RequestMapping(value = "student/rating/{id}", method = RequestMethod.GET)
	public String rating_student(@PathVariable(value = "id") String id,
			HttpServletRequest request, Model model) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");

		if (student == null) {
			student = studentManager.findById(id);
		}
		model.addAttribute("viewStudent", student);
		return getRelativePath("/rating_student");
	}
	
	@RequestMapping(value = "student/rating", method = RequestMethod.POST)
	public String rating_student(HttpServletRequest request, int rating) {
		Student student = (Student) request.getSession().getAttribute(
				"viewStudent");
		if (student != null) {
			student.setRating(rating);
			studentManager.update(student);
		}
		return CONTROLLER_REDIRECT + "/admin/user/student";
	}
	
	@RequestMapping(value = "comment")
	public String comment(Model model, String name,String content,
			final SessionStatus status, Page<Comment> pageRequest) {
		status.setComplete();
		
		Comment comment = new Comment();
		comment.setForbidden(null);
		comment.setIsCancle(null);
		
		if (StringUtils.isNotBlank(content)) {
			comment.setContent(content);
		}
		if (StringUtils.isNotBlank(name)) {
			comment.setStudentName(name);
		}
		
		pageRequest.setVo(comment);
		Page<Comment> page = commentManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_comment");
	}
	
	@RequestMapping(value = "comment/setForbidden/{id}", method = RequestMethod.GET)
	public String setForbidden_comment(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Comment entity = commentManager.findById(id);
		if (entity != null) {
			if (entity.getForbidden() != null && entity.getForbidden()) {
				entity.setForbidden(false);
			} else {
				entity.setForbidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			commentManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/user/comment";
	}

}
