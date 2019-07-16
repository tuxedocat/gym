fn main() {
    println!("{:?}", Solution::two_sum(vec![2i32, 7, 11, 15], 9));
}

pub struct Solution {}

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        use std::collections::HashMap;
        let mut result = vec![0];
        let mut complements: HashMap<i32, i32> = HashMap::new();
        for (i, x) in nums.iter().enumerate() {
            let compl = target - x;
            if complements.contains_key(&compl) {
                let a = complements.get(&compl).unwrap();
                result = vec![*a, i as i32];
            }
            complements.insert(*x, i as i32);
        }
        result
    }
}
