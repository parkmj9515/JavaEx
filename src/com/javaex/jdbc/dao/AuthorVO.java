package com.javaex.jdbc.dao;

// 데이터 전송객체(DTO)
// - 데이터베이스 필드에 매칭되는 필드
// - getter setter
// - 기본 생성자
// - 로직은(가급적) 포함하지 않는다
// - toString(), equals() 메서드는 포함하기도 한다
public class AuthorVO {
	// 필드
	private Long authorId; // null을 허용할수있어야함// PK
	private String authorName;
	private String authorDesc;
	
	// 기본생성자
	public AuthorVO() {
		
	}
	// 전체 필드 생성자
	public AuthorVO(Long authorId, String authorName, String authorDesc) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}
	
	public AuthorVO(String authorName, String authorDesc) {
		super();
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}
	
	// getters / setters
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorDesc() {
		return authorDesc;
	}
	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}
	
	// toString or Equals 오버라이드 하기도 함
	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
	
	
	
}
