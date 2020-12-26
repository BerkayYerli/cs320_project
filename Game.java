package game;

public class Game{
    protected  String name;
    protected  String description;
	protected  String publisher;
    protected  float price;
    protected  float score;
    protected  boolean is_multi;
    
        
    
    
    public Game(String name,String description,String publisher,float price,float score,boolean is_multi){
        this.name=name;this.description=description;this.publisher=publisher; this.price=price; this.score=score;this.is_multi=is_multi;} 
    
    public String toString(){
        return this.name+"'s Features:\nDescription: "+this.description+", Publisher: "+this.publisher+", Price: "+this.price+", Score: "+this.score+", Multiplayer: "+this.is_multi;
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public boolean isIs_multi() {
		return is_multi;
	}

	public void setIs_multi(boolean is_multi) {
		this.is_multi = is_multi;
	}
    
    
    
    

}




