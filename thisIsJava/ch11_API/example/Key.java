package thisIsJava.ch11_API.example;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Key) {
//			Key compareKey = (Key) obj;
//			if(this.number == compareKey.number) {
//				return true;
//			}
//		}
//		return false;
//	}
}	
