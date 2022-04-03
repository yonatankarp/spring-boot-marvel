# marvel-client

The `marvel-client` module is responsible for the communication between the
project and the [Marvel API](https://developer.marvel.com/docs).

In order to communicate with Marvel's API you need your public and private keys
exposed either by adding them to the `application.yml` file as follow:

```yml
marvel:
  api:
    public_key: "MY_PUBLIC_KEY"
    private_key: "MY_PRIVATE_KEY"
```

Or by exposing them over environment variables:
```shell
expose MARVEL_API_PUBLIC_KEY=MY_PUBLIC_KEY
expose MARVEL_API_PRIVATE_KEY=MY_PRIVATE_KEY
```

Once both are set, you can use any of the available clients
(e.g. `MarvelCharacterClient`) and the `HashGenerator` to call the api.

For example:

```kotlin
val client = Retrofit.Builder()
    .client(OkHttpClient())
    .baseUrl("MARVEL_API_URL")
    .addConverterFactory(JacksonConverterFactory.create(objectMapper))
    .build()
    .create(MarvelCharacterClient::class.java)

val timestamp = Instant.now().epochSecond
val hash = HashGenerator.generate(timestamp)

val characters =
    client.getCharacters(timestamp, HashGenerator.publicKey, hash)
```
