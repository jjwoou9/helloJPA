package hellojpa;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Member {
	
	@Id
	private Long id;
	@Column(name = "name", nullable = false, unique = true)
	private String username;
	private Integer age;
	@Enumerated(EnumType.STRING) //Ordinal 절대 안쓰고 String만 쓰자.
	private RoleType roleType;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	@Lob
	private String description; 
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
