import XCTest
@testable import SingleNumber

final class SingleNumberTests: XCTestCase {
    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct
        // results.
        XCTAssertEqual(SingleNumber.Solution().singleNumber([2, 2, 1]), 1)
        XCTAssertEqual(SingleNumber.Solution().singleNumber([4, 2, 2, 1, 1]), 4)
    }

    static var allTests = [
        ("testExample", testExample),
    ]
}
