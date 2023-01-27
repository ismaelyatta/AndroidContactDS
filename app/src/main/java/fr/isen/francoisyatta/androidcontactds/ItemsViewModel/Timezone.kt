package fr.isen.francoisyatta.androidcontactds.ItemsViewModel

import com.google.gson.annotations.SerializedName


data class Timezone (

  @SerializedName("offset"      ) var offset      : String? = null,
  @SerializedName("description" ) var description : String? = null

): java.io.Serializable