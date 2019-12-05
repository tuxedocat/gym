import XCTest
@testable import DefangingIP

final class DefangingIPTests: XCTestCase {
    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct
        // results.
        XCTAssertEqual(DefangingIP().text, "Hello, World!")
    }

    static var allTests = [
        ("testExample", testExample),
    ]
}
