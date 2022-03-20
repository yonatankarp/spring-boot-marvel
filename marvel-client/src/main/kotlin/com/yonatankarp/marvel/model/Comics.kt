package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Date
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.Price
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.TextObjects
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a comics in the Marvel API.
 *
 * @author yonatankarp
 */
@Suppress("kotlin:S6218")
data class Comics(
    /**
     * The unique ID of the comic resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The ID of the digital comic representation of this comic. Will be 0 if
     * the comic is not available digitally.
     */
    @JsonProperty("digitalId")
    var digitalId: Int? = null,

    /**
     * The canonical title of the comic
     */
    @JsonProperty("title")
    var title: String? = null,

    /**
     * The number of the issue in the series (will generally be 0 for collection
     * formats).
     */
    @JsonProperty("issueNumber")
    var issueNumber: Int? = null,

    /**
     * If the issue is a variant (e.g. an alternate cover, second printing, or
     * director's cut), a text description of the variant.
     */
    @JsonProperty("variantDescription")
    var variantDescription: String? = null,

    /**
     * The preferred description of the comic.
     */
    @JsonProperty("description")
    var description: String? = null,

    /**
     * 	The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime? = null,

    /**
     * The ISBN for the comic (generally only populated for collection formats).
     */
    @JsonProperty("isbn")
    var isbn: String? = null,

    /**
     * The UPC barcode number for the comic (generally only populated for
     * periodical formats).
     */
    @JsonProperty("upc")
    var upc: String? = null,

    /**
     * The Diamond code for the comic.
     */
    @JsonProperty("diamondCode")
    var diamondCode: String? = null,

    /**
     * The EAN barcode for the comic.
     */
    @JsonProperty("ean")
    var ean: String? = null,

    /**
     * The ISSN barcode for the comic.
     */
    @JsonProperty("issn")
    var issn: String? = null,

    /**
     * The publication format of the comic e.g. comic, hardcover, trade
     * paperback.
     */
    @JsonProperty("format")
    var format: String? = null,

    /**
     * The number of story pages in the comic.
     */
    @JsonProperty("pageCount")
    var pageCount: Int? = null,

    /**
     * A set of descriptive text blurbs for the comic.
     */
    @JsonProperty("textObjects")
    var textObjects: Array<TextObjects>? = null,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String? = null,

    /**
     * A set of public website URLs for the resource.
     */
    @JsonProperty("urls")
    var urls: Set<Url>? = null,

    /**
     * A summary representation of the series to which this comic belongs.
     */
    @JsonProperty("series")
    var series: SeriesSummary? = null,

    /**
     * A list of variant issues for this comic (includes the "original" issue
     * if the current issue is a variant).
     */
    @JsonProperty("variants")
    var variants: Array<ComicsSummary>? = null,

    /**
     * A list of collections which include this comic (will generally be empty
     * if the comic's format is a collection).
     */
    @JsonProperty("collections")
    var collections: Array<ComicsSummary>? = null,

    /**
     * A list of issues collected in this comic (will generally be empty for
     * periodical formats such as "comic" or "magazine").
     */
    @JsonProperty("collectedIssues")
    var collectedIssues: Array<ComicsSummary>? = null,

    /**
     * A list of key dates for this comic.
     */
    @JsonProperty("dates")
    var dates: Array<Date>? = null,

    /**
     * A list of prices for this comic.
     */
    @JsonProperty("prices")
    var prices: Array<Price>? = null,

    /**
     * The representative image for this comic.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A list of promotional images associated with this comic.
     */
    @JsonProperty("images")
    var images: Array<Image>? = null,

    /**
     * A resource list containing the creators associated with this comic.
     */
    @JsonProperty("creators")
    var creators: ResourceList<CreatorSummary>? = null,

    /**
     * A resource list containing the characters which appear in this comic.
     */
    @JsonProperty("characters")
    var characters: ResourceList<CharacterSummary>? = null,

    /**
     * 	A resource list containing the stories which appear in this comic.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>? = null,

    /**
     * A resource list containing the events in which this comic appears.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>? = null,
) {
    @Suppress("DuplicatedCode", "kotlin:S3776")
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comics

        if (id != other.id) return false
        if (digitalId != other.digitalId) return false
        if (title != other.title) return false
        if (issueNumber != other.issueNumber) return false
        if (variantDescription != other.variantDescription) return false
        if (description != other.description) return false
        if (modified != other.modified) return false
        if (isbn != other.isbn) return false
        if (upc != other.upc) return false
        if (diamondCode != other.diamondCode) return false
        if (ean != other.ean) return false
        if (issn != other.issn) return false
        if (format != other.format) return false
        if (pageCount != other.pageCount) return false
        if (!textObjects.contentEquals(other.textObjects)) return false
        if (resourceUri != other.resourceUri) return false
        if (urls != other.urls) return false
        if (series != other.series) return false
        if (!variants.contentEquals(other.variants)) return false
        if (!collections.contentEquals(other.collections)) return false
        if (!collectedIssues.contentEquals(other.collectedIssues)) return false
        if (!dates.contentEquals(other.dates)) return false
        if (!prices.contentEquals(other.prices)) return false
        if (!images.contentEquals(other.images)) return false
        if (thumbnail != other.thumbnail) return false
        if (creators != other.creators) return false
        if (characters != other.characters) return false
        if (stories != other.stories) return false
        if (events != other.events) return false

        return true
    }

    @Suppress("DuplicatedCode", "kotlin:S3776")
    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + digitalId.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + issueNumber.hashCode()
        result = 31 * result + variantDescription.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + modified.hashCode()
        result = 31 * result + isbn.hashCode()
        result = 31 * result + upc.hashCode()
        result = 31 * result + diamondCode.hashCode()
        result = 31 * result + ean.hashCode()
        result = 31 * result + issn.hashCode()
        result = 31 * result + format.hashCode()
        result = 31 * result + pageCount.hashCode()
        result = 31 * result + textObjects.hashCode()
        result = 31 * result + resourceUri.hashCode()
        result = 31 * result + urls.hashCode()
        result = 31 * result + series.hashCode()
        result = 31 * result + variants.hashCode()
        result = 31 * result + collections.hashCode()
        result = 31 * result + collectedIssues.hashCode()
        result = 31 * result + dates.hashCode()
        result = 31 * result + prices.hashCode()
        result = 31 * result + thumbnail.hashCode()
        result = 31 * result + images.hashCode()
        result = 31 * result + creators.hashCode()
        result = 31 * result + characters.hashCode()
        result = 31 * result + stories.hashCode()
        result = 31 * result + events.hashCode()
        return result
    }

    override fun toString(): String =
        StringBuilder()
            .append("Comics(")
            .append("id=").append(id).append(SEPARATOR)
            .append("digitalId=").append(digitalId).append(SEPARATOR)
            .append("title=").append(title).append(SEPARATOR)
            .append("issueNumber=").append(issueNumber).append(SEPARATOR)
            .append("variantDescription=").append(variantDescription).append(SEPARATOR)
            .append("description=").append(description).append(SEPARATOR)
            .append("modified=").append(modified).append(SEPARATOR)
            .append("isbn=").append(isbn).append(SEPARATOR)
            .append("upc=").append(upc).append(SEPARATOR)
            .append("diamondCode=").append(diamondCode).append(SEPARATOR)
            .append("ean=").append(ean).append(SEPARATOR)
            .append("issn=").append(issn).append(SEPARATOR)
            .append("format=").append(format).append(SEPARATOR)
            .append("pageCount=").append(pageCount).append(SEPARATOR)
            .append("textObjects=")
            .append(textObjects?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("resourceUri=").append(resourceUri).append(SEPARATOR)
            .append("urls=")
            .append(urls?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("series=").append(series).append(SEPARATOR)
            .append("variants=")
            .append(variants?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("collections=")
            .append(collections?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("collectedIssues=").append(
                collectedIssues?.joinToString(
                    separator = SEPARATOR,
                    prefix = ARRAY_PREFIX,
                    postfix = ARRAY_POSTFIX
                )
            ).append(SEPARATOR)
            .append("dates=")
            .append(dates?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("prices=")
            .append(prices?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("thumbnail=").append(thumbnail).append(SEPARATOR)
            .append("images=")
            .append(images?.joinToString(separator = SEPARATOR, prefix = ARRAY_PREFIX, postfix = ARRAY_POSTFIX))
            .append(SEPARATOR)
            .append("creators=").append(creators).append(SEPARATOR)
            .append("characters=").append(characters).append(SEPARATOR)
            .append("stories=").append(stories).append(SEPARATOR)
            .append("events=").append(events)
            .append(")")
            .toString()

    companion object {
        private const val ARRAY_PREFIX = "{"
        private const val ARRAY_POSTFIX = "}"
        private const val SEPARATOR = ", "
    }
}
