import Foundation

func defangIPaddr(_ address: String) -> String {
    let ans = address.replacingOccurrences(of: ".", with: "[.]")
    return ans
}

func main() {
    let addr1 = "255.100.50.0"
    print("\(defangIPaddr(addr1))")
}
