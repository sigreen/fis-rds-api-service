
package com.example.rest;

public class Lead {

	private String company;
    private String email;
    private String first_and_last_name;
    private String lead_source;
    private String lead_status;
    private String phone;
    private String rating;

    
    public Lead() {
    }

	public Lead(String company, String email, String first_and_last_name, String lead_source, String lead_status,
			String phone, String rating) {
		super();
		this.company = company;
		this.email = email;
		this.first_and_last_name = first_and_last_name;
		this.lead_source = lead_source;
		this.lead_status = lead_status;
		this.phone = phone;
		this.rating = rating;
	}
    
    public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_and_last_name() {
		return first_and_last_name;
	}

	public void setFirst_and_last_name(String first_and_last_name) {
		this.first_and_last_name = first_and_last_name;
	}

	public String getLead_source() {
		return lead_source;
	}

	public void setLead_source(String lead_source) {
		this.lead_source = lead_source;
	}

	public String getLead_status() {
		return lead_status;
	}

	public void setLead_status(String lead_status) {
		this.lead_status = lead_status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}



}
