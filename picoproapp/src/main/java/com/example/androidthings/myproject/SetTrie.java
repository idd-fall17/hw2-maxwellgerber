package com.example.androidthings.myproject;

/**
 * Created by maxwellgerber on 9/10/17.
 */

import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class SetTrie {

    private TreeSet<String> lines;

    public SetTrie() {
        lines = new TreeSet<String>();
    }

    public void loadWhitespaced(String longline) {
        for(String s: longline.trim().split("\\s+")){
            if (s.length() > 2) {
                load(s);
            }
        };
    }

    public void load(String line) {
        lines.add(line);
    }

    public boolean matchPrefix(String prefix) {
        Set<String> tailSet = lines.tailSet(prefix);
        for (String tail : tailSet) {
            if (tail.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    public List<String> findCompletions(String prefix) {
        List<String> completions = new ArrayList<String>();
        Set<String> tailSet = lines.tailSet(prefix);
        for (String tail : tailSet) {
            if (tail.startsWith(prefix)) {
                completions.add(tail);
            } else {
                break;
            }
        }
        return completions;
    }

    public String complete(String prefix) {
        if(prefix.length() == 0) {
            return prefix;
        }
        List<String> completions = findCompletions(prefix);
        String shortest = prefix;
        int best = 1000;
        for(String choice: completions) {
            if(choice.length() < best && !choice.equals(prefix)) {
                shortest = choice;
                best = choice.length();
            }

        }
        return  shortest;
    }
}