fun main() {
    // Valid IPv4 addresses
    check(
        description = "Valid IP: 192.168.1.1",
        result = isValidIPV4("192.168.1.1").toString(),
        correctResult = "true"
    )
    check(
        description = "Valid IP: 0.0.0.0",
        result = isValidIPV4("0.0.0.0").toString(),
        correctResult = "true"
    )
    check(
        description = "Valid IP: 255.255.255.255",
        result = isValidIPV4("255.255.255.255").toString(),
        correctResult = "true"
    )

    // Invalid IPv4 addresses
    check(
        description = "Invalid IP: 192.168.1.256 (segment > 255)",
        result = isValidIPV4("192.168.1.256").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168.1 (missing segment)",
        result = isValidIPV4("192.168.1").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168.01.1 (leading zero in segment)",
        result = isValidIPV4("192.168.01.1").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168.1.1.1 (too many segments)",
        result = isValidIPV4("192.168.1.1.1").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168.1.-1 (negative number)",
        result = isValidIPV4("192.168.1.-1").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168.1.a (non-numeric)",
        result = isValidIPV4("192.168.1.a").toString(),
        correctResult = "false"
    )
    check(
        description = "Invalid IP: 192.168..1 (empty segment)",
        result = isValidIPV4("192.168..1").toString(),
        correctResult = "false"
    )

}