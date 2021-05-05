import java.time.LocalDate;

public class Order {
	int id;
	int userId;
	int gameId;
	LocalDate date;
	float price;
	

	public Order() {
		
	}
	
	public Order(int id, int userId, int gameId, LocalDate date) {
		
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.date = date;
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
