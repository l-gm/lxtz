package cn.dosy.platform.core.domain;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@DynamicInsert
@DynamicUpdate
@MappedSuperclass
public abstract class AbstractDomainEntity extends AbstractAuditable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AbstractDomainEntity() {
		
	}
	
	public AbstractDomainEntity(boolean initDefault) {
		if(initDefault)
		{
			this.setId(java.util.UUID.randomUUID().toString());
			this.setLastModifiedDate(new Date());
			this.setCreatedDate(new Date());
		//	this.setCreatedBy("");
		//	this.setLastModifiedBy("");
		}
	}
	
	@PrePersist
	public void prePersist() {
		if(StringUtils.isBlank(this.id))
			this.setId(java.util.UUID.randomUUID().toString());
		this.setLastModifiedDate(new Date());
		this.setCreatedDate(new Date());
	
	}

	@PreUpdate
	public void preUpdate() {
		this.setLastModifiedDate(new Date());
	
	}
}
