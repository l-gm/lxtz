package cn.dosy.platform.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Abstract base class for auditable entities. Stores the audition values in
 * persistent fields.
 * 
 * @author Oliver Gierke
 * @param <U>
 *            the auditing type. Typically some kind of user.
 * @param <PK>
 *            the type of the auditing type's idenifier
 */
@MappedSuperclass
public abstract class AbstractAuditable implements Auditable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AbstractAuditable() {

	}

	protected String id;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#getId()
	 */
	@Id
	@Column(name = "ID", nullable = false, length = 50)
	public String getId() {

		return id;
	}

	/**
	 * Sets the id of the entity.
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {

		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#isNew()
	 */
	@Transient
	public boolean isNew() {

		return null == getId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return String.format("Entity of type %s with id: %s", this.getClass()
				.getName(), getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		if (null == obj) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!getClass().equals(obj.getClass())) {
			return false;
		}

		AbstractAuditable that = (AbstractAuditable) obj;

		return null == this.getId() ? false : this.getId().equals(that.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		int hashCode = 17;

		hashCode += null == getId() ? 0 : getId().hashCode() * 31;

		return hashCode;
	}

	

	protected String createdBy;

	
	protected Date createdDate;

	
	protected String lastModifiedBy;

	
	protected Date lastModifiedDate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getCreatedBy()
	 */
	@Column(name = "CREATOR_ID", nullable = true, length = 50)
	public String getCreatedBy() {

		return createdBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setCreatedBy(java.lang.Object)
	 */
	public void setCreatedBy(final String createdBy) {

		this.createdBy = createdBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getCreatedDate()
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_TIME", nullable = false)
	public Date getCreatedDate() {

		return createdDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setCreatedDate(org.joda.time
	 * .DateTime)
	 */
	public void setCreatedDate(Date createdDate) {

		this.createdDate = createdDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getLastModifiedBy()
	 */
	@Column(name = "LAST_MODIFICATOR_ID", nullable = true, length = 50)
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setLastModifiedBy(java.lang
	 * .Object)
	 */
	public void setLastModifiedBy(final String lastModifiedBy) {

		this.lastModifiedBy = lastModifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getLastModifiedDate()
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_MODIFICATION_TIME", nullable = false)
	public Date getLastModifiedDate() {

		return lastModifiedDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setLastModifiedDate(org.joda
	 * .time.DateTime)
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {

		this.lastModifiedDate = lastModifiedDate;
	}
}