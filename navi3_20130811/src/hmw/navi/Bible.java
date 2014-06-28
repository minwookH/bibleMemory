package hmw.navi;

public class Bible {
	private String id;
	private String sub_id;
	private String first_sub;
	private String second_sub;
	private String third_sub;
	private String address;
	private String words;
	private String category;
	
	
	public Bible(){
		
	}
	
	public Bible(String id, String sub_id, String first_sub, String second_sub, String third_sub,
			String address, String words, String category){
		this.id = id;
		this.sub_id = sub_id;
		this.first_sub = first_sub;
		this.second_sub = second_sub;
		this.third_sub = third_sub;
		this.address = address;
		this.words = words;
		this.category = category;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	public String getFirst_sub() {
		return first_sub;
	}
	public void setFirst_sub(String first_sub) {
		this.first_sub = first_sub;
	}
	public String getSecond_sub() {
		return second_sub;
	}
	public void setSecond_sub(String second_sub) {
		this.second_sub = second_sub;
	}
	public String getThird_sub() {
		return third_sub;
	}
	public void setThird_sub(String third_sub) {
		this.third_sub = third_sub;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
