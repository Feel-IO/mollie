## 3.4.0
- Changed `java.util.Date` fields to its `java.time` representatives

## 3.3.0
- Changed OrderRequest `expiresAt` field date serialization format to `yyyy-MM-dd`

## 3.2.3
- Add "voucher" as a known payment method

## 3.2.2
- Allow a custom user agent string

## 3.2.0
- Add support for category attribute in OrderLineRequest
- Exposed the dashboard link in the OrderLink


## 3.1.0
- Fixed camel case issue for 'metadata' in OrderRequest
- Allow multiple methods in PaymentRequest
- Fixed isCancelable always false
- Mapped Status fields to Enums
- Mapped 'value' from Amount to a BigDecimal
- Fixed an issue where the TokenType from TokenResponse was not mapping

## 3.0.1
- Optionals default to empty instead of `null`

## 2.2.7
- Fixed a typo in PaymentEmbedded.chargebacks

## 2.2.6
- Made Config object part of the Client, instead of being a singleton.
  This allows multiple clients to have different configurations

## 2.2.5
- Fixed a typo in RefundResponse
- Fixed a wrong enum value in ResponseType

## 2.2.4
- Removed the description field from SimpleMethodResponse
- Added the name field from SimpleMethodResponse

## 2.2.3
- Added lombok annotations to SimpleMethodResponse class

## 2.2.2
- cardToken added to PaymentRequest
- Issue with order links resolved
- Updated unirest version to 3.6.01

## 2.2.0
- Default 'UNKNOWN' value for Locale enum when the enum is not found
- Bumped Jackson to 2.10.1
- Added CONTRIBUTING, CONTRIBUTORS and CHANGELOG files
