class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        var counts = [Int: Int]()
        for n in nums {
            counts[n, default: 0] += 1
        }
        for (n, c) in counts {
            if c == 1 {
                return n
            }
        }
        return 0
    }
}
