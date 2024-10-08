import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        backtrack(new ArrayList<>(), nums, result);
        return result;
    }

    private void backtrack(List<Integer> path, int[] options, List<List<Integer>> result) {
        if (path.size() == options.length) {
            result.add(new ArrayList<>(path)); 
            return;
        }

        for (int i = 0; i < options.length; i++) {
            if (path.contains(options[i])) {
                continue; 
            }
            path.add(options[i]);
            backtrack(path, options, result);
            path.remove(path.size() - 1);
        }
    }
}
