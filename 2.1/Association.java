public class Association<K, V> {
	
	protected K theKey;
	protected V theValue;
	
	public Association(K key, V value){
		this.theKey = key; 
		this.theValue = value;
	}
	public K getTheKey() {
		return theKey;
	}
	public void setTheKey(K theKey) {
		this.theKey = theKey;
	}
	public V getTheValue() {
		return theValue;
	}
	public void setTheValue(V theValue) {
		this.theValue = theValue;
	}
	
	

}
