package cn.dosy.platform.core.web.vo;


import java.io.Serializable;

/**
 * <p>
 * 界面绑定的Label Value
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年08月31日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年08月31日；
 */
public class SelectItem implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String description;

	private boolean disabled;

	private String label;

	private Object value;

	public SelectItem() {
		this.description = null;
		this.disabled = false;
		this.label = null;

		this.value = null;
	}

	public SelectItem(Object value ) {
		this(value, (value == null) ? null : value.toString(), null, false);
	}

	public SelectItem(Object value, String label ) {
		this(value, label, null, false);
	}

	public SelectItem(Object value, String label, String description ) {
		this(value, label, description, false);
	}

	public SelectItem(Object value, String label, String description, boolean disabled) {
		this.description = null;
		this.disabled = false;
		this.label = null;
		this.value = null;

		setValue(value);
		setLabel(label);
		setDescription(description);
		setDisabled(disabled);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDisabled() {
		return this.disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}