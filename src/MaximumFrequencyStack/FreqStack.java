package MaximumFrequencyStack;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class FreqStack {
    ArrayList<Integer> freqStack;
    HashMap<Integer, Integer> freq= new HashMap<>();
    Collection<Integer> freq_val;
    Integer max_freq;
    List<Integer> max_key;;

    public FreqStack() {
        freqStack = new ArrayList<Integer>();
    }

    public void push(int val) {
        this.freqStack.add(val);
        if (freq.containsKey(val)) freq.put(val, freq.get(val)+1);
        else freq.put(val, 1);
    }

    public int pop() {
        freq_val =  freq.values();
        max_freq = freq_val.stream().max(Integer::compare).orElse(0);
        max_key = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if (entry.getValue().equals(max_freq)){
                max_key.add(entry.getKey());
            }
        }
        for (int i = freqStack.size() - 1; i >=0; i--){
            if (max_key.contains(freqStack.get(i))){
                freq.put(freqStack.get(i), freq.get(freqStack.get(i))-1);
                return freqStack.remove(i);
            }
        }
        return 0;
    }
}


//новое сообщение из gitHub
