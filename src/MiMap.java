
public class MiMap<K, V> implements Mappable<K, V> {

	private K[] keys;
	private V[] values;
	
	private int count;
	private int max;
	
	@SuppressWarnings("unchecked")
	public MiMap(int max) {
		this.max = max;
		keys = (K[]) new Object[max];
		values = (V[]) new Object[max];
	}
	
	@Override
	public void put(K key, V value) {
		boolean has = false;
		for(int i = 0; i < keys.length; i++) {
			if(keys[i] == key) {
				has = true;
				values[i] = value;
			}
			if(has)
				break;
		}
		if(!has) {
			keys[count] = key;
			values[count] = value;
			count++;
		}
		
	}

	@Override
	public V get(K key) {
		for(int i = 0; i < keys.length; i++) {
			if(keys[i] == key) {
				return values[i];
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void removePair(K key) {
		V tmpValues[] = (V[]) new Object[max];
		K tmpKeys[] = (K[]) new Object[max];
		
		for(int i = 0, j = 0; i < keys.length; i++) {
			if(keys[i] == key) {
				count--;
			} else {
				tmpValues[j] = values[i];
				tmpKeys[j] = keys[i];
				j++;
			}
		}
		
		values = tmpValues;
		keys = tmpKeys;
		
	}
	
	@Override
	public void removeValue(K key) {
		for(int i = 0; i < keys.length; i++) {
			if(keys[i] == key) {
				values[i] = null;
			}
		}
		
	}

	@Override
	public boolean containsKey(K key) {
		for(int i = 0; i < keys.length; i++) {
			if(keys[i] == key) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		keys = (K[]) new Object[max];
		values = (V[]) new Object[max];
		count = 0;
	}

	@Override
	public void remove(K key) {
		// TODO Auto-generated method stub
		
	}

}
