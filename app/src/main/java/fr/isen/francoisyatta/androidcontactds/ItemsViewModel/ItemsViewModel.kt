package fr.isen.francoisyatta.androidcontactds.ItemsViewModel

import com.google.gson.annotations.SerializedName


data class ItemsViewModel (

  @SerializedName("results" ) var results : ArrayList<Results> = arrayListOf(),
  @SerializedName("info"    ) var info    : Info?              = Info()

): java.io.Serializable