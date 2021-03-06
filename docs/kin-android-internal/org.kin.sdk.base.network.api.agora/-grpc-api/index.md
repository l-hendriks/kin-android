[kin-android](../../index.md) / [org.kin.sdk.base.network.api.agora](../index.md) / [GrpcApi](./index.md)

# GrpcApi

`abstract class GrpcApi`

### Types

| Name | Summary |
|---|---|
| [StreamHandler](-stream-handler/index.md) | `interface StreamHandler<Request>` |
| [UnrecognizedProtoResponse](-unrecognized-proto-response.md) | `object UnrecognizedProtoResponse : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) |

### Exceptions

| Name | Summary |
|---|---|
| [UnrecognizedResultException](-unrecognized-result-exception/index.md) | `data class UnrecognizedResultException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GrpcApi(managedChannel: ManagedChannel)` |

### Properties

| Name | Summary |
|---|---|
| [managedChannel](managed-channel.md) | `val managedChannel: ManagedChannel` |

### Functions

| Name | Summary |
|---|---|
| [callAsObservableCallback](call-as-observable-callback.md) | `fun <Request, Response> `[`KFunction2`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-function2/index.html)`<Request, StreamObserver<Response>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>.callAsObservableCallback(request: Request, callback: `[`ObservableCallback`](../../org.kin.sdk.base.tools/-observable-callback/index.md)`<Response>): StreamHandler<Request>` |
| [callAsPromisedCallback](call-as-promised-callback.md) | `fun <Request, Response> `[`KFunction2`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-function2/index.html)`<Request, StreamObserver<Response>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>.callAsPromisedCallback(request: Request, callback: `[`PromisedCallback`](../../org.kin.sdk.base.tools/-promised-callback/index.md)`<Response>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [canRetry](can-retry.md) | `fun `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`.canRetry(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isForcedUpgrade](is-forced-upgrade.md) | `fun `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`.isForcedUpgrade(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [AgoraKinAccountApiV4](../-agora-kin-account-api-v4/index.md) | `class AgoraKinAccountApiV4 : `[`GrpcApi`](./index.md)`, `[`KinAccountApiV4`](../../org.kin.sdk.base.network.api/-kin-account-api-v4/index.md)`, `[`KinStreamingApiV4`](../../org.kin.sdk.base.network.api/-kin-streaming-api-v4/index.md) |
| [AgoraKinAccountCreationApiV4](../-agora-kin-account-creation-api-v4/index.md) | `class AgoraKinAccountCreationApiV4 : `[`GrpcApi`](./index.md)`, `[`KinAccountCreationApiV4`](../../org.kin.sdk.base.network.api/-kin-account-creation-api-v4/index.md) |
| [AgoraKinAccountsApi](../-agora-kin-accounts-api/index.md) | `class AgoraKinAccountsApi : `[`GrpcApi`](./index.md)`, `[`KinAccountApi`](../../org.kin.sdk.base.network.api/-kin-account-api/index.md)`, `[`KinStreamingApi`](../../org.kin.sdk.base.network.api/-kin-streaming-api/index.md)`, `[`KinAccountCreationApi`](../../org.kin.sdk.base.network.api/-kin-account-creation-api/index.md) |
| [AgoraKinTransactionsApi](../-agora-kin-transactions-api/index.md) | `class AgoraKinTransactionsApi : `[`GrpcApi`](./index.md)`, `[`KinTransactionApi`](../../org.kin.sdk.base.network.api/-kin-transaction-api/index.md)`, `[`KinTransactionWhitelistingApi`](../../org.kin.sdk.base.network.api/-kin-transaction-whitelisting-api/index.md) |
| [AgoraKinTransactionsApiV4](../-agora-kin-transactions-api-v4/index.md) | `class AgoraKinTransactionsApiV4 : `[`GrpcApi`](./index.md)`, `[`KinTransactionApiV4`](../../org.kin.sdk.base.network.api/-kin-transaction-api-v4/index.md) |
