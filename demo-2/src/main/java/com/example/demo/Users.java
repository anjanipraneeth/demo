package com.example.demo;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Users {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(unique = true, nullable = false)
	    private String username;

	    private String firstName;
	    private String middleName;
	    private String lastName;
	    @ElementCollection(fetch = FetchType.EAGER)
	    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
	    @Column(name = "role")
	    private Set<String> roles;
	    public Users(Set<String> roles) {
			super();
			this.roles = roles;
		}
		public Set<String> getRoles() {
			return roles;
		}
		public void setRoles(Set<String> roles) {
			this.roles = roles;
		}
		@Column(nullable = false)
	    private String password;
	    private String email;
	    private String contact;
	    private String description;
	    private String memo;
	    private LocalDate expirationDate;
	    private Integer timeout;
	    private String language;
	    private String timezone;
	    private String organization;
	    
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
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public LocalDate getExpirationDate() {
			return expirationDate;
		}
		public void setExpirationDate(LocalDate expirationDate) {
			this.expirationDate = expirationDate;
		}
		public Integer getTimeout() {
			return timeout;
		}
		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getTimezone() {
			return timezone;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
		public String getOrganization() {
			return organization;
		}
		public void setOrganization(String organization) {
			this.organization = organization;
		}
		public Users(Long id, String username, String firstName, String middleName, String lastName, String password,
				String email, String contact, String description, String memo, LocalDate expirationDate,
				Integer timeout, String language, String timezone, String organization) {
			super();
			this.id = id;
			this.username = username;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.password = password;
			this.email = email;
			this.contact = contact;
			this.description = description;
			this.memo = memo;
			this.expirationDate = expirationDate;
			this.timeout = timeout;
			this.language = language;
			this.timezone = timezone;
			this.organization = organization;
		}
		public Users() {
			super();
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", username=" + username + ", firstName=" + firstName + ", middleName="
					+ middleName + ", lastName=" + lastName + ", password=" + password + ", email=" + email
					+ ", contact=" + contact + ", description=" + description + ", memo=" + memo + ", expirationDate="
					+ expirationDate + ", timeout=" + timeout + ", language=" + language + ", timezone=" + timezone
					+ ", organization=" + organization + "]";
		}	
}
