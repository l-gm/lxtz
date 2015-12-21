package cn.dosy.platform.core.domain;

import java.util.Date;

public interface Auditable  {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#getId()
	 */
	public String getId() ;

	/**
	 * Sets the id of the entity.
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(String id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#isNew()
	 */
	public boolean isNew();
	

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getCreatedBy()
	 */
	public String getCreatedBy();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setCreatedBy(java.lang.Object)
	 */
	public void setCreatedBy(final String createdBy);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getCreatedDate()
	 */
	public Date getCreatedDate() ;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setCreatedDate(org.joda.time
	 * .DateTime)
	 */
	public void setCreatedDate(Date createdDate);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getLastModifiedBy()
	 */
	public String getLastModifiedBy();
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setLastModifiedBy(java.lang
	 * .Object)
	 */
	public void setLastModifiedBy(final String lastModifiedBy);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Auditable#getLastModifiedDate()
	 */
	public Date getLastModifiedDate();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.data.domain.Auditable#setLastModifiedDate(org.joda
	 * .time.DateTime)
	 */
	public void setLastModifiedDate(Date lastModifiedDate);
}
