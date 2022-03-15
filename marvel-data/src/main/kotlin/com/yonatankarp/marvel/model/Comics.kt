package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.Price
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.TextObjects
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant

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
    val id: Int,

    /**
     * The ID of the digital comic representation of this comic. Will be 0 if
     * the comic is not available digitally.
     */
    val digitalId: Int,

    /**
     * The canonical title of the comic
     */
    val title: String,

    /**
     * The number of the issue in the series (will generally be 0 for collection
     * formats).
     */
    val issueNumber: Int,

    /**
     * If the issue is a variant (e.g. an alternate cover, second printing, or
     * director's cut), a text description of the variant.
     */
    val variantDescription: String,

    /**
     * The preferred description of the comic.
     */
    val description: String,

    /**
     * 	The date the resource was most recently modified.
     */
    val modified: Instant,

    /**
     * The ISBN for the comic (generally only populated for collection formats).
     */
    val isbn: String,

    /**
     * The UPC barcode number for the comic (generally only populated for
     * periodical formats).
     */
    val upc: String,

    /**
     * The Diamond code for the comic.
     */
    val diamondCode: String,

    /**
     * The EAN barcode for the comic.
     */
    val ean: String,

    /**
     * The ISSN barcode for the comic.
     */
    val issn: String,

    /**
     * The publication format of the comic e.g. comic, hardcover, trade
     * paperback.
     */
    val format: String,

    /**
     * The number of story pages in the comic.
     */
    val pageCount: Int,

    /**
     * A set of descriptive text blurbs for the comic.
     */
    val textObjects: Array<TextObjects>,

    /**
     * The canonical URL identifier for this resource.
     */
    val resourceUri: String,

    /**
     * A set of public website URLs for the resource.
     */
    val urls: Set<Url>,

    /**
     * A summary representation of the series to which this comic belongs.
     */
    val series: Array<SeriesSummary>,

    /**
     * A list of variant issues for this comic (includes the "original" issue
     * if the current issue is a variant).
     */
    val variants: Array<ComicsSummary>,

    /**
     * A list of collections which include this comic (will generally be empty
     * if the comic's format is a collection).
     */
    val collections: Array<ComicsSummary>,

    /**
     * A list of issues collected in this comic (will generally be empty for
     * periodical formats such as "comic" or "magazine").
     */
    val collectedIssues: Array<ComicsSummary>,

    /**
     * A list of key dates for this comic.
     */
    val dates: Array<Instant>,

    /**
     * A list of prices for this comic.
     */
    val prices: Array<Price>,

    /**
     * The representative image for this comic.
     */
    val thumbnail: Image,

    /**
     * A list of promotional images associated with this comic.
     */
    val images: Array<Image>,

    /**
     * A resource list containing the creators associated with this comic.
     */
    val creators: ResourceList<CreatorSummary>,

    /**
     * A resource list containing the characters which appear in this comic.
     */
    val characters: ResourceList<CharacterSummary>,

    /**
     * 	A resource list containing the stories which appear in this comic.
     */
    val stories: ResourceList<StorySummary>,

    /**
     * A resource list containing the events in which this comic appears.
     */
    val events: ResourceList<EventSummary>
) {
    @Suppress("Duplicates", "kotlin:S3776")
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
        if (!series.contentEquals(other.series)) return false
        if (!variants.contentEquals(other.variants)) return false
        if (!collections.contentEquals(other.collections)) return false
        if (!collectedIssues.contentEquals(other.collectedIssues)) return false
        if (!dates.contentEquals(other.dates)) return false
        if (!prices.contentEquals(other.prices)) return false
        if (thumbnail != other.thumbnail) return false
        if (!images.contentEquals(other.images)) return false
        if (creators != other.creators) return false
        if (characters != other.characters) return false
        if (stories != other.stories) return false
        if (events != other.events) return false

        return true
    }

    @Suppress("Duplicates", "kotlin:S3776")
    override fun hashCode(): Int {
        var result = id
        result = 31 * result + digitalId
        result = 31 * result + title.hashCode()
        result = 31 * result + issueNumber
        result = 31 * result + variantDescription.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + modified.hashCode()
        result = 31 * result + isbn.hashCode()
        result = 31 * result + upc.hashCode()
        result = 31 * result + diamondCode.hashCode()
        result = 31 * result + ean.hashCode()
        result = 31 * result + issn.hashCode()
        result = 31 * result + format.hashCode()
        result = 31 * result + pageCount
        result = 31 * result + textObjects.contentHashCode()
        result = 31 * result + resourceUri.hashCode()
        result = 31 * result + urls.hashCode()
        result = 31 * result + series.hashCode()
        result = 31 * result + variants.contentHashCode()
        result = 31 * result + collections.contentHashCode()
        result = 31 * result + collectedIssues.contentHashCode()
        result = 31 * result + dates.contentHashCode()
        result = 31 * result + prices.contentHashCode()
        result = 31 * result + thumbnail.hashCode()
        result = 31 * result + images.contentHashCode()
        result = 31 * result + creators.hashCode()
        result = 31 * result + characters.hashCode()
        result = 31 * result + stories.hashCode()
        result = 31 * result + events.hashCode()
        return result
    }
}
