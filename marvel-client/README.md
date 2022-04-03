# marvel-client

The `marvel-client` module is responsible for the communication between the project and
the [Marvel API](https://developer.marvel.com/docs).

In order to communicate with Marvel's API you need your public and private keys exposed either by adding them to
the `application.yml` file of `marvel-web` module as follow:

```properties
marvel.api.base_url="https://gateway.marvel.com"
marvel.api.public_key="MY_PUBLIC_KEY"
marvel.api.private_key="MY_PRIVATE_KEY"
```

Or by exposing them over environment variables:

```bash
export MARVEL_API_PUBLIC_KEY="MY_PUBLIC_KEY"
export MARVEL_API_PRIVATE_KEY="MY_PRIVATE_KEY"
```

Once both are set, you can use any of the available clients
(e.g. `MarvelCharacterClient`) and the `HashGenerator` to call the api.

For example:

```kotlin
@Service
class MyService(
    private val client: MarvelCharacterClient,
    private val hashGenerator: HashGenerator
) {
    fun getCharacters() : Call<MarvelResponse<Character>> {
        val timestamp = Instant.now().epochSecond
        val hash = HashGenerator.generate(timestamp)

        return client.getCharacters(
            timestamp,
            HashGenerator.publicKey,
            hash
        )
    }
}
```
