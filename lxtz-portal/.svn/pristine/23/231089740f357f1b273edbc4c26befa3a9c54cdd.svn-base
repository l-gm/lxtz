package cn.dosy.platform.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import cn.dosy.platform.core.domain.AbstractDomainEntity;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.domain.Named;
import cn.dosy.platform.core.domain.Structured;


@MappedSuperclass
public abstract class AbstractUserGroup<E extends Auditable> extends AbstractDomainEntity implements Named, Structured<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AbstractUserGroup() {
		children = new ArrayList<E>();
	}

	protected E parent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ID")
	public E getParent() {
		return this.parent;
	}

	public void setParent(E parent) {
		this.parent = parent;
		
	}

	protected List<E> children;
	
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	public List<E> getChildren() {
		return this.children;
	}

	public void setChildren(List<E> children) {
		this.children = children;		
	}
	
	protected String name;
	
	protected String code;

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;		
	}
	
	
	private String shortName;

	/**
	 * 获取属性：中文简称
	 * 
	 * @return shortName
	 */
	@Column(name = "SHORT_NAME", length = 100)
	public String getShortName() {
		return this.shortName;
	}

	/**
	 * 属性设置：中文简称
	 * 
	 * @param shortName
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	

	protected String description;

	/**
	 * 获取属性：备注
	 * 
	 * @return description
	 */
	@Column(name = "Description", length = 512)
	public String getDescription() {
		return this.description;
	}

	/**
	 * 属性设置：备注
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
