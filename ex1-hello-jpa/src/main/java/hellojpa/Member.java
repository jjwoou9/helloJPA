package hellojpa;

import java.util.Date;

import javax.persistence.*;

@Entity
@TableGenerator( 
		 name = "MEMBER_SEQ_GENERATOR", 
		 table = "MY_SEQUENCES", 
		 pkColumnValue = "MEMBER_SEQ", allocationSize = 1)
public class Member {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.TABLE, 
	 generator = "MEMBER_SEQ_GENERATOR")
	private Long id;
	@Column(name = "name", nullable = false, unique = true)
	private String username;
	
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
}
