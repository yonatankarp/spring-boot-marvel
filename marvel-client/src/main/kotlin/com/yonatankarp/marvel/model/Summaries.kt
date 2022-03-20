@file:Suppress("MemberVisibilityCanBePrivate")

package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author yonatankarp
 */

/**
 * This entity is the base summary for all other summaries returned from Marvel.
 *
 * @param resourceUri url reference to consume the full entity
 * @param name the name of the entity
 */
sealed class BaseSummary(
    val resourceUri: String?,
    val name: String?,
) {
    override fun toString(): String =
        "${this.javaClass.name.split('.').last()}(resourceUri=$resourceUri, name=$name)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as BaseSummary
        return resourceUri == other.resourceUri && name == other.name
    }

    override fun hashCode(): Int {
        var result = resourceUri.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}

/**
 * A Comics summary includes reference to the comics entity and the comics name.
 *
 * @param resourceUri url reference to consume the full comics entity
 * @param name the name of the comics
 */
class ComicsSummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,
) : BaseSummary(resourceUri, name)

/**
 * A Series summary includes reference to the series entity and the series name.
 */
class SeriesSummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,
) : BaseSummary(resourceUri, name)

/**
 * An Event summary includes reference to the event entity and the event name.
 *
 * @param resourceUri url reference to consume the full event entity
 * @param name the name of the event
 */
class EventSummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,
) : BaseSummary(resourceUri, name)

/**
 * A Character summary includes reference to the character entity and the character name.
 *
 * @param resourceUri url reference to consume the full character entity
 * @param name the name of the character
 */
class CharacterSummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,
) : BaseSummary(resourceUri, name)

/**
 * A Story summary includes reference to the story entity, type, and the story
 * name.
 *
 * @param resourceUri url reference to consume the full story entity
 * @param name the name of the story
 * @param type the type of the story (e.g. cover, interiorStory)
 */
class StorySummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,

    @JsonProperty("type")
    val type: String? = null,
) : BaseSummary(resourceUri, name) {

    override fun toString(): String = "StorySummary(resourceUri=$resourceUri, name=$name, type=$type)"

    override fun equals(other: Any?): Boolean {
        if (!super.equals(other)) return false
        other as StorySummary
        return type == other.type
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}

/**
 * A Creator summary includes reference to the creator entity, role, and the
 * creator name.
 *
 * @param resourceUri url reference to consume the full creator entity
 * @param name the name of the creator
 * @param role the role of the creator (e.g. writer)
 */
class CreatorSummary(
    @JsonProperty("resourceURI")
    resourceUri: String? = null,

    @JsonProperty("name")
    name: String? = null,

    @JsonProperty("role")
    val role: String? = null,
) : BaseSummary(resourceUri, name) {

    override fun toString(): String = "CreatorSummary(resourceUri=$resourceUri, name=$name, role=$role)"

    override fun equals(other: Any?): Boolean {
        if (!super.equals(other)) return false
        other as CreatorSummary
        return role == other.role
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + role.hashCode()
        return result
    }
}
